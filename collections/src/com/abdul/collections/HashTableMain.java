package com.abdul.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableMain {

	public static void main(String[] args) {
		Map<String , String> map=new Hashtable<>();
		map.put("myName", "Abdul");
		map.put("myAge", "30");
		map.put("location", "Chennai");
		
		System.out.println("maps available"+map);
		
		System.out.println("using get method"+map.get("myAge"));
		
		//unavailable key you ll get null
		System.out.println("using get unavailable key method"+map.get("ar"));
		
		//if we add again with same key then value will be replaced
		
		map.put("myAge", "29");
		
		System.out.println("maps after adding with same key available"+map);
		
		//cannot  use null for the key
		/*map.put(null, "abc");
		map.put(null, "null");
		*/
		System.out.println("maps after adding with same key available"+map);
		
		Set<String> set= map.keySet();
		
		for(String setkey:set){
			System.out.println("iterating using the key"+map.get(setkey));
		}
	}


	}
/*
 * 
 * Output
 * maps available{location=Chennai, myAge=30, myName=Abdul}
using get method30
using get unavailable key methodnull
maps after adding with same key available{location=Chennai, myAge=29, myName=Abdul}
maps after adding with same key available{location=Chennai, myAge=29, myName=Abdul}
iterating using the keyChennai
iterating using the key29
iterating using the keyAbdul

Hashtable is  thread is thread safe
it doesnt allow null key 

*/

