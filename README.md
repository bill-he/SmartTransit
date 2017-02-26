# SmartTeam

Algorithm: introduce artificial delays to public transporation to increase transfership for riders

## Sub-tools

### TrainPositionCrawler
TrainPositionCrawler is a class written in Java 8 to allows us to extract Train Position information from the Washington Metropolitan Area Transit Authority (WMATA) API. The resulting file is stored in json.

Dependencies:

* JSON jar: http://mvnrepository.com/artifact/org.json/json
* HttpCore jar: http://mvnrepository.com/artifact/org.apache.httpcomponents/httpcore/4.4.1
* HttpClient jar: http://mvnrepository.com/artifact/org.apache.httpcomponents/httpclient/4.5

### Simulator
Simulator contains classes written in Python 3.5.2 to allows us to simulate train positions and their interactions with other trains, train platforms, and riders. We are focusing on the Washington Metropolitan Area Transit Authority (WMATA).
