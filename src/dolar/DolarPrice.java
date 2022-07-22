package dolar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

import entities.JsonParser;

public class DolarPrice {

	public static String dolarprice() throws Exception {
		try {
			URL url = new URL("https://economia.awesomeapi.com.br/last/USD-BRL,EUR-BRL");

			HttpURLConnection connect = (HttpURLConnection) url.openConnection();

			if (connect.getResponseCode() != 200)
				throw new RuntimeException("codigo de erro " + connect.getResponseCode());

			BufferedReader response = new BufferedReader(new InputStreamReader(connect.getInputStream()));

			String convert = JsonParser.converteJsonEmString(response);

			JSONObject obj = new JSONObject(convert);

			String stringname = obj.getJSONObject("USDBRL").getString("bid");

			return stringname;

		} catch (Exception e) {
			throw new Exception(e);
		}
	}

}
