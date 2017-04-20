package esnerda.keboola.ex.appnexus;
/**
 * @author David Esner
 */
public class Main {

	public static void main(String[] args) {
		AppNexusRunner runner = new AppNexusRunner(args);
		try {
			runner.run();
		} catch (Exception e) {
			runner.getLogger().error("Critical error!", e);
			System.exit(1);
		}

	}

}
