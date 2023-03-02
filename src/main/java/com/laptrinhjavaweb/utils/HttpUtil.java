package com.laptrinhjavaweb.utils;

import java.io.BufferedReader;
import java.io.IOException;

public class HttpUtil {
	private String value;

	public HttpUtil(String value) {
		this.value = value;
	}

	public <T> toModel(Class<T> tClass){
		
	}

	public static HttpUtil of(BufferedReader reader) {
		StringBuilder sb = new StringBuilder();
		String line;
		try {
			while ((line = reader.readLine()) != null) {
				sb.append(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new HttpUtil(sb.toString());
	}
}