package esnerda.keboola.ex.appnexus.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;

/**
 * @author David Esner
 */
public class CsvUtil {

	/**
	 * Removes first line from the specified file. Using NIO - fast.
	 * 
	 * @param csvFile
	 * @throws IOException
	 */
	public static void removeHeaderFromCsv(File csvFile) throws IOException {
		// create output file
		File outFile = new File(csvFile.getParent() + File.separator + "tempRes");
		FileChannel out = null;
		FileOutputStream fout = null;
		FileInputStream fis = null;
		FileChannel in = null;
		try {
			// retrieve file header
			fis = new FileInputStream(csvFile);

			// read header
			readLineWithNL(fis);

			fout = new FileOutputStream(outFile);
			out = fout.getChannel();
			// Write the rest of the file using NIO
			in = fis.getChannel();
			// set position to header
			long pos = in.position() - 1;
			for (long p = pos, l = in.size(); p < l;) {
				p += in.transferTo(p, l - p, out);
			}
		} catch (IOException ex) {
			throw ex;
		} finally {
			try {
				fis.close();
				in.close();
				out.close();
				fout.close();
			} catch (Exception ex) {
				// do nothing.
			}
		}

		csvFile.delete();

		outFile.renameTo(csvFile);
	}

	private static final boolean isNL(int character) {
		if ((character == -1)) {
			return false;
		} else {
			return ((((char) character == '\n') || ((char) character == '\r')));
		}
	}

	public static void deleteEmptyFiles(List<File> files) {
		for (File f : files) {
			try {
				if (isFileEmpty(f)) {
					f.delete();
				}
			} catch (IOException e) {
				// do nothing, I really dont care here
			}
		}
	}

	public static boolean isFileEmpty(File f) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(f))) {
			String line = br.readLine();
			return StringUtils.isBlank(line);
		}
	}

	private static char[] readLineWithNL(FileInputStream in) throws IOException {
		try {
			int hLen = 0;

			ArrayList<Character> chars = new ArrayList();
			int ch = in.read();
			chars.add((char) ch);
			while (!isNL(ch)) {
				ch = in.read();
				chars.add((char) ch);
			}
			boolean isNl = true;
			while (isNl) {
				ch = in.read();
				if (isNL(ch)) {
					chars.add((char) ch);
					isNl = true;
				} else {
					isNl = false;
				}
				hLen++;
			}
			char[] charArray = new char[chars.size()];
			for (int i = 0; i < chars.size(); i++) {
				charArray[i] = chars.get(i);
			}
			return charArray;
		} catch (IOException ex) {
			throw ex;
		}
	}

	public static String[] readHeader(File csvFile, char separator, char quotechar, char escape, boolean strictQuotes,
			boolean ignoreLeadingWhiteSpace) throws Exception {
		String[] headers = null;
		try (FileReader freader = new FileReader(csvFile);
				CSVReader csvreader = new CSVReader(freader, separator, quotechar, escape, 0, strictQuotes,
						ignoreLeadingWhiteSpace);) {

			headers = csvreader.readNext();
			if (headers == null) {
				throw new Exception("Error reading csv file header: " + csvFile.getName());
			}
		}
		return headers;
	}

	/**
	 * Validates the structure of the merged csv files.
	 *
	 * @param mFiles
	 *            List of MasterFiles to check
	 * @return Returns true if the data structure of all given files matches.
	 *         Throws an user exception (Exception) otherwise.
	 * @throws Exception
	 */
	public static boolean dataStructureMatch(Collection<String> fileNames, String folderPath) throws Exception {
		String[] headers = null;
		String headerLine = "";
		String currFile = "";
		BufferedReader reader;
		FileInputStream fis;
		boolean firstRun = true;
		try {
			int maxHeaderSize = 0;
			for (String fname : fileNames) {
				String fPath = folderPath + File.separator + fname;
				currFile = fPath;

				File csvFile = new File(fPath);
				FileReader freader = new FileReader(csvFile);
				CSVReader csvreader = new CSVReader(freader, '\t', CSVWriter.NO_QUOTE_CHARACTER);
				headers = csvreader.readNext();
				if (headers != null) {
					if (headers.length != maxHeaderSize) {

						maxHeaderSize = headers.length;
						// get header line
						fis = new FileInputStream(fPath);
						reader = new BufferedReader(new InputStreamReader(fis));
						headerLine = reader.readLine();
						reader.close();
						if (!firstRun) {
							throw new Exception(
									"Data structure of downloaded files within is different, cannot upload to a single SAPI table!");
						}
						firstRun = false;

					}

				} else {
					throw new Exception("Error reading csv file header: " + currFile);
				}
				csvreader.close();
			}
			if (maxHeaderSize == 0 || headerLine.equals("")) {
				throw new Exception("Zero length header in csv file!");
			}
			return true;

		} catch (FileNotFoundException ex) {
			throw new Exception("CSV file not found. " + currFile + " " + ex.getMessage());
		} catch (IOException ex) {
			throw new Exception("Error reading csv file: " + currFile + " " + ex.getMessage());
		}
	}
}
