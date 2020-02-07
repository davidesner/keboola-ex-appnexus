# AppNexus extractor
AppNexus extractor docker component for Keboola Connection.
## Functionality
The component allows retrieving performance reports provided by AppNexus Report service along with most of the corresponding entities. 
### Entities
**List of supported entity datasets:**

 - List item
 - Advertiser 
 - Brand
 - Campaign
 - Category
 - Creative
 - Insertion Order
 - Label
 - Line Item
 - Media Type
 - Placement
 - Publisher
 - Segment
 - Site
 
When the `Changed since` configuration parameter is not specified, all entities available are downloaded. Each consequent run only records that have changed from the previous run are downloaded/updated. For more details on retrieved data please see corresponding service documentation at [AppNexus reference](https://wiki.appnexus.com/display/api/Reference)

**NOTE**: Some of the nested attributes contained within entities were deliberately omitted. Some transitive relations between entities can be retrieved only along with one of the pair. For example LineItem - Creative transitive table is obtained only with LineItem dataset. It is recommended to retrieve all of the datasets for best results. 


### Reports
There are two types of reports available. Bulk and standard reports.
  - **Bulk reports*, use them to retrieve data in regular manner. They offer data at most granular level and run faster then standard reports. However, they are limited to a 30 day history.
  - **Standard reports* are suitable for one-off load of historical data, they allow to specify intervals larger than 30 days. However, if the interval is too long or the report is too large to compute they may fail. Also, it takes longer to retrieve.
  
#### Bulk Reports

Current version allows retrieving two detailed bulk reports:

 - **Network Analytics feed**
	 - Feed offering extensive data on network's buy-side and sell-side performance. See [Network Analytics feed](https://wiki.appnexus.com/display/api/Network+Analytics+Feed) 
 - **Click Trackers feed**
	 - Track user clicks on creatives served by third-party ad servers (rather than by AppNexus). This reporting feed provides data on those external clicks. See [Click Trackers feed](https://wiki.appnexus.com/display/api/Clicktrackers+Feed)

Any other reports can be added on request.

Granularity of each report is controlled by values specified in the dimensions parameter. Reports are automatically sliced according to the dimensions specified.

**NOTE**: Any bulk report data is available in high detail but is limited to **30 day** history. If you do not specify since parameter within past 30 days, it will be overridden and minimum start date used instead. 
It is recommended to leave the since parameter completely out. The extractor will load full history on the first run and each consecutive run only new data will be retrieved. To override this behaviour, please create new configuration.

#### Standard Reports
 Below is a list of supported Standard Reports:
 - **[Network Analytics](https://wiki.appnexus.com/display/api/Network+Analytics)**
 - **[Attributed Conversions](https://wiki.appnexus.com/display/api/Attributed+Conversions)**
 
**Important Note**: 

For standard reports it is only allowed to specify the time interval in predefined report ranges. In order to keep compatibility with the bulk reports that allow specifying custom date range, the range you specify is translated as follows:

- nrDays > 1 && nrDays <= 2 => `yesterday`
- nrDays > 2 && nrDays <= 3)  `last_2_days`
- nrDays > 3 && nrDays <= 7 => `last_7_days`
- nrDays > 7 && nrDays <= 30 => `last_30_days`
- > 30 days => `lifetime`


## Configuration
### Parameters

 - **User Name** – (REQ) Your AppNexus account user name
 - **Password**– (REQ) Your AppNexus account password
 - **Endpoint URL**– (REQ)  AppNexus API endpoint URL. Default is https://api.appnexus.com
 - **Changed since** – (OPT) Specify starting point of the time interval. If not specified, all available data is downloaded. If `Data since last run` is set to true, this value is used only first time the component is run, or whenever its changed.
 - **Days back reporting interval** - Specifies number of days that will be retrieved each run after the first run is performed. If `Data since last run` is set to `true` this value is ignored and `Changed Since` is used instead.
 - **Data since last run** - If set to `Yes` only data for past X days specified by `Days back reporting interval` are retrieved. Otherwise, `Changed Since` date is always used.
 - **Datasets** – list of datasets to download. Description of each dataset is provided in previous section.
 - **Network Analytics report parameters** – Specify dimensions which will be used in the report. The report data is sliced by specified dimensions accordingly. ***NOTE***: Pay attention when specifying the `IDs` parameter. Columns that can form **unique identifier** of a row must be specified correctly, otherwise the Incremental load will not work correctly and some data may be lost. If you are not sure, please leave this parameter out, perform Full load and specify the parameter afterwards.
 - **Click Tracker report parameters** – Specify dimensions and ID columns which will be used in the report. The report data is sliced by specified dimensions accordingly.
 - **Storage upload mode** – (DEFAULT `Incremental`) specifies whether to upload incrementally. If set to `Incremental`, the primary keys must be specified.
.
