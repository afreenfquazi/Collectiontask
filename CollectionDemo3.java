package com.practice.CollectionsProblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/*Create a program to get the HashMap from the given input string array 
 where the key for the HashMap is first three letters of array element in Upper Case 
 and the value of HashMap is the element itself
 
Input:{�goa�,�kerala�,�gujarat�} [string array]
Output:{{GOA,goa},{KER,kerala},{GUJ,Gujarat}} [hashmap]
*/

public class CollectionDemo3 {

	public static HashMap<String, String> getEntries(String array[]) {
		String array2[] = new String[array.length];
		HashMap<String, String> map = new HashMap<>();

		for (int i = 0; i < array.length; i++) {
			array2[i] = array[i];
			array2[i] = array2[i].substring(0, 3).toUpperCase();
			map.put(array2[i], array[i]);

		}

		return map;
	}

	public static void main(String[] args) {

		String array[] = { "goa", "kerala", "gujarat" };
		HashMap<String, String> map = getEntries(array);
		Set<Entry<String, String>> set = map.entrySet();
		Iterator<Entry<String, String>> itr = set.iterator();
		while (itr.hasNext()) {
			Entry<String, String> keyvalue = itr.next();
			System.out.println(keyvalue.getKey() + " " + keyvalue.getValue());
		}

	}
}
