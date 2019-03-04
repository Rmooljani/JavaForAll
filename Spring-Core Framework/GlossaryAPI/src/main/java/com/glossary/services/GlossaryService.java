package com.glossary.services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
@SuppressWarnings("unused")
public class GlossaryService {
	
	private HashMap<String, String> map;
	
	private String key;
	private String value;
	
	public HashMap<String, String> getMap() {
		return map;
	}
	public void setMap(HashMap<String, String> map) {
		this.map = map;
	}
	public Map<String,String> myService() throws IOException {
		
		String filePath = "D:\\ConsolidatedGlossary.txt";
	     map = new HashMap<String, String>();
	    String line;
	    @SuppressWarnings("resource")
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
	    while ((line = reader.readLine()) != null)
	    {
	        String[] parts = line.split(":", 2);
	        if (parts.length >= 2)
	        {
	            String key = parts[0];
	            String value = parts[1];
	            map.put(key, value);
	        } else {
	            System.out.println("ignoring line: " + line);
	        }
	    }
	    for(Map.Entry<String, String> myMap:map.entrySet()) {
	    	key=myMap.getKey();
	    	value=myMap.getValue();
	    }
	    return map;
	}

}
