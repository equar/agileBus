package com.agilebus.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.log4j.Logger;

public class AgileUtil {
	private static final Logger logger = Logger.getLogger(AgileUtil.class);

	// logging functionality
	public static void log(String parameter) {
		if (logger.isDebugEnabled()) {
			logger.debug(parameter);
		}

		if (logger.isInfoEnabled()) {
			logger.info(parameter);
		}

		logger.warn(parameter);
		logger.error(parameter);
		logger.fatal(parameter);
	}

	public static void sendSMS() throws ClientProtocolException, IOException {
		String myPasscode = "agilebus";
		String myUsername = "agilebus";
		String toPhoneNumber = "+16414514881";
		String myMessage = "Dear Customer";

		@SuppressWarnings("resource")
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet("http://cloud.fowiz.com/api/message_http_api.php?username=" + myUsername
				+ "&phonenumber=" + toPhoneNumber + "&message=" + myMessage + "&passcode=" + myPasscode);
		HttpResponse response = client.execute(request);

		BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

		String line = "";
		StringBuffer response1 = new StringBuffer();
		while ((line = rd.readLine()) != null) {
			response1.append(line);
		}

		System.out.println(response.toString());
	}

}
