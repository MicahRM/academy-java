package com.bptn.course._16_java_collections_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		
		
		//create Hashmap
		
		Map<String,Integer> hashMap = new HashMap<>();
		
		
		//populate the hashMap
		
		hashMap.put("Angie", 33);
		hashMap.put("Steve", 34);
		hashMap.put("John", 35);
		hashMap.put("Angie", 32);
		hashMap.put("Jane", 34);
		hashMap.put("Sweytha", 100);
		hashMap.put("Sarah", null);
		hashMap.put("Johnson", null);
		hashMap.put(null, 33);
		hashMap.put(null, 300);
		
		
		System.out.println(hashMap);
		
		
		//.keySet() method returns the Set view of the keys
		//.get(Object k)  method returns the actual object that corresponds with the specified key.
		
		
		for(String key : hashMap.keySet()) {
			
			
			System.out.println("Name: " + key + "Age:" + hashMap.get(key));
			
		}
		
		// get the age of john and print it 
		System.out.println("Retreive age of John: " + hashMap.get("John"));
		
		
		
		//.replace() method replaces the value within the key if the key exists and otherwise returns null if the key does not exist within the map
		
		hashMap.replace("Jane", 40);
		
		System.out.println("Jane's new age is: " + hashMap.get("Jane"));
		
		
		hashMap.replace("Aakash", 40);  //returns null because "Aakash" key does not exist.
		
		
		
		//iterating through hashMao using entrySet() method which prints the entire entry (key, value)
		
		for(Map.Entry<String, Integer> entry : hashMap.entrySet()){
			
			System.out.println("Name: " + entry.getKey() + "Age: " + entry.getValue());		
			
		}
		
		
		
		//check if a key is present using the containsKey(Object k) method
		
		if(hashMap.containsKey("Jane")){
			
			System.out.println("The key is existing in the map");
		} else {
			System.out.println("The key is not existing in the map");
		}
		
		
		
		
		//check if a value is present using the containsValue(Object k) method, a single value can exists many times within a HashMap as long as they have distinct keys
		
	    if(hashMap.containsValue(34)){
			System.out.println("The value is existing in the map");
		} else {
			System.out.println("The value is not existing in the map");
		}  
	    
	    
	    //putIfAbsent(Object k, Object V) adds key value pair if the key does not already exist in the map
	    
	    hashMap.putIfAbsent("Sweytha" , 60); //does not override value because key already exists.
	    
	    
	    hashMap.putIfAbsent("Aakash" , 60); //does add because this value does not a;ready exist
	    
	    System.out.println(hashMap);	    
	    
	    
		
		
		
		
	
	}

}


/*
 * does not preserve any order
 * does allow null values within the value part "similar to a list"
 * allows duplicate values but not duplicate keys, it will only keep the latest key of a certain name and override all prior keys with the same name
 * allows maximum 1 null value as the key, the latest null key will update the null key value.
 * 
 */
