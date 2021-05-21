package com.hdb.ABC;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.apache.commons.io.IOUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Manager {

	private static final String REST_URL = "http://localhost:8080/activePersonnel";

	public static void main(String[] args) throws Exception {
			System.out.println(getRenovationContractorSystemResonse());
	}

	public static List<ABCSystemDataDto> getRenovationContractorSystemResonse() throws Exception{
		URL url = new URL(REST_URL);

		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		InputStream responseStream = connection.getInputStream();
		ObjectMapper mapper = new ObjectMapper();

		List<ABCSystemDataDto> aBCSystemDataDtos = mapper.reader().forType(new TypeReference<List<ABCSystemDataDto>>() {
		}).readValue(IOUtils.toByteArray(responseStream));
		return aBCSystemDataDtos;
	}
}
