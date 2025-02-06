package com.bptn.course._16_java_collections_map;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Gatherer.Integrator;

public class MapDemo {

	public static void main(String[] args) {
		
		//create hashmap
		Map<Integer, String> hashMap = new HashMap<>();
		
		//populate hashmap
		hashMap.put(1, "one");
		hashMap.put(2, "two");
		hashMap.put(3, "three");
		hashMap.put(4, "four");
		hashMap.put(5, "five");
		hashMap.put(6, "six");
		hashMap.put(7, "seven");
		hashMap.put(8, "eight");
		hashMap.put(9, "nine");
		hashMap.put(10, "ten");
		
		//print hashmap
		System.out.println(hashMap);
		
		
		
		//remove element with key 7
		hashMap.remove(7);
		
		
		
		for(Map.Entry<Integer, String> entry : hashMap.entrySet()) {  //traverses over the entries in entrySet
			System.out.println(entry.getKey() + " : " + entry.getValue());
	
	}
		
		
		hashMap.remove(7);
		hashMap.put(11, "eleven");
		
		
		for(Integer key : hashMap.keySet()) {  //for-each key in keySet
			
			System.out.println(key + " : " + hashMap.get(key));
		}
		
		

}
}