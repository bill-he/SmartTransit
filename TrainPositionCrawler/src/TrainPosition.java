//// This sample uses the Apache HTTP client from HTTP Components (http://hc.apache.org/httpcomponents-client-ga/)
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import org.json.*;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class TrainPosition {
	
	private static Date startTime = new Date();
	
	public static void main(String[] args) {
		
		HttpClient httpclient = HttpClients.createDefault();

		try {
			URIBuilder builder = new URIBuilder("https://api.wmata.com/TrainPositions/TrainPositions?contentType=json");

			URI uri = builder.build();
			HttpGet request = new HttpGet(uri);
			request.setHeader("api_key", "b56999f9db1a49f38e6c8a189f1c35f8");

			while (true) {
        	 
//				request.setEntity(reqEntity);
	
				HttpResponse response = httpclient.execute(request);
				HttpEntity entity = response.getEntity();
				
				if (entity != null) {
					String positions = EntityUtils.toString(entity);
					System.out.println(positions);
					appendToFile(positions, "log");
				}
				break;
				
			}
     } catch (Exception e) {
         System.out.println(e.getMessage());
     }
 }
	
	// method to append text to the log file
	private static void appendToFile(String addition, String fileName) {
		BufferedWriter bw = null;
		
		try {
			
	         bw = new BufferedWriter(new FileWriter(startTime.toString() + " " + fileName, true));
	         bw.write(addition);
	         bw.newLine();
	         bw.flush();
	     } catch (IOException ioe) {
	    	 ioe.printStackTrace();
		 } finally {               
			 try {
				bw.close();
			 } catch (IOException e) {
				e.printStackTrace();
			 }
		 }
	}

}
