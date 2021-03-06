package com.iris.glossary.api;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.stream.Collectors;


public class ReadGlossaryFile {
	
	public static void main(String[] args) throws IOException {
		
		String filePath = "D:\\ConsolidatedGlossary.txt";
	    HashMap<String, String> map = new HashMap<String, String>();

	    String line;
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

		/*
		 * for (String key : map.keySet()) { // System.out.println(key + ":" +
		 * map.get(key));
		 * 
		 * }
		 */
	    reader.close();
		
		
		 String json = "{"+map.entrySet().stream() .map(e -> "\""+ e.getKey() + "\"" +
		  ":\"" + String.valueOf(e.getValue()) + "\"")
		  .collect(Collectors.joining(", "))+"}"; System.out.println(json);
		 
	    
	}

}
