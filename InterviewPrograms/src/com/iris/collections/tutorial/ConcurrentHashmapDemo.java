package com.iris.collections.tutorial;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class ConcurrentHashmapDemo { 
    public static void main(String[] args) 
    { 
        ConcurrentHashMap<Integer,String> chm = new ConcurrentHashMap<>(); 
        chm.put(101, "Objects");
		chm.put(102, "Methods");
		chm.put(103, "Functionality");
		chm.put(104, "Functionality");
		chm.put(105, "Functionality");
		chm.put(106, "Functionality");
		chm.put(107, "Functionality");
		chm.put(108, "Functionality");
		chm.put(109, "Functionality");
		chm.put(100, "Functionality");
		chm.put(111, "Functionality");
		chm.put(112, "Functionality");
		chm.put(113, "Functionality");
		chm.put(114, "Functionality");
		chm.put(115, "Functionality");
		chm.put(116, "Functionality");
		chm.put(117, "Functionality");
		chm.put(118, "Functionality");
		chm.put(171, "blocks");
		chm.put(172, "blocks1");
		chm.put(173, "blocks2");
		chm.put(174, "blocks3");
		chm.put(175, "blocks4");
		chm.put(1, "ABC");
		chm.put(2,"DEF");
		chm.put(1,"XYZ");
		chm.put(1,"PQR");
		chm.put(1,"PQR");
		
		System.out.println(chm);
		
		for(Map.Entry<Integer, String> map : chm.entrySet()) {
			
			System.out.print(" " + map.getKey() + " ");
			chm.put(199, "instance blocks");
			System.out.print( map.getValue());
			
		}
    } 
} 