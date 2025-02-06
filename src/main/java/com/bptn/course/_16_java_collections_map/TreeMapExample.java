package com.bptn.course._16_java_collections_map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		
		
		//define a TreeMap
		
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		
		
		//populate the treemap
		
		treeMap.put("Toronto", 10000);
		treeMap.put("Burlington", 4000);
		treeMap.put("Ottawa", 2000);
		treeMap.put("London", 500);
		treeMap.put("Scarborough", 10000);
		treeMap.put("Hamilton", null);
		treeMap.put("Brampton", null);  //allows duplicate null values
		treeMap.put("Burlington", 6000);  //does not allow duplicate keys and will override the previous key with the same name
		
		
		
		//treeMap.put(null, 10000);  //throws nullpointerexception
		
		
		System.out.println(treeMap);
		
		
		//use .remove() method to remove Burlington
		
		
		treeMap.remove("Burlington"); //since the first burlington was overwritten this will remove the updated key value pair.
		
		System.out.println(treeMap);
		
		
		
		//get the first key of the map
		
		System.out.println("The first key of the map is: " + treeMap.firstKey());   //treeMap object must be created using TreeMap<String, Integer> because these methods only exist in the TreeMap class rather than the Map class
		
		
		//get the first entry of the map
		
		System.out.println("The first entry of the map is: " + treeMap.firstEntry());
		
		
		// .keySet() method returns the Set view of the keys
		// .get(Object k) method returns the actual object that corresponds with the
		// specified key.

		for (String key : treeMap.keySet()) {

			System.out.println("City Name: " + key + "Population:" + treeMap.get(key));

		}
		
		
		//subMap() method
		
		
		System.out.println("Submap from Brampton to Ottawa excluding Ottawa: " + treeMap.subMap("Brampton" , "Ottawa"));  //the overlaoded subMap() method allows you to choose to include or exclude certain keys
		
		//headMap(K toKey) method
		
		System.out.println("HeadMao cities less than London " + treeMap.headMap("London")); //shows all the keys less than the given key excluding the key if requested (overloaded method exists)  
		
		//tailMap() method returns keys that are greater than the given key with similar overloaded methods as well
		
	
		
		
	}

}


//natural ascending order of the keys
/*
 * does not allow null values for the keys because comparing must happen and this cannot happen on a null key
 * 
 * accepts multiple null value for the values
 * 
 * does not allow duplicate keys and will override the previous key with the same name
 * 
 * 
 * 
 * 
 */
