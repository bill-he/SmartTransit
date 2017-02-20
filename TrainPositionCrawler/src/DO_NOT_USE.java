import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class DO_NOT_USE {

	public static void main(String[] args) throws IOException {
		
		URL url = new URL("https://api.wmata.com/TrainPositions/TrainPositions?contentType=json");
		HttpsURLConnection urlConnection = (HttpsURLConnection) url.openConnection();
		
		urlConnection.setDoOutput(true);
		
		OutputStream outStream = urlConnection.getOutputStream();
		
		String request = "GET https://api.wmata.com/TrainPositions/TrainPositions?contentType=json HTTP/1.1\r\n";
		request += "Host: api.wmata.com\r\n";
		request += "api_key: b56999f9db1a49f38e6c8a189f1c35f8\r\n";
		
		outStream.write(request.getBytes());
        outStream.flush();
		
		int length = urlConnection.getContentLength();
		
		System.out.println("Length: " + length);
		System.out.println("Status Code: " + urlConnection.getResponseCode());
		System.out.println("Reponse Message: " + urlConnection.getResponseMessage());
		
		String thing = (String) urlConnection.getContent();
		
		System.out.println("package: " + thing);
	}
}
