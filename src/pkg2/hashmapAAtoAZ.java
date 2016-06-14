package pkg2;

import java.util.*;

public class hashmapAAtoAZ {
	
	public static void main(String[] args ) {
		
		HashMap<String, List<String>> map = new HashMap<String, List<String>>();
		String key=null;
		List<String> value = new ArrayList<String>();
		List<String> sample = new ArrayList<String>();
		int dictionaryArrayLength = 0;
		String[] dictionaryArray = null;
		
		String ch = null;
		int c =0;
		
		// for AA -> AM
		sample.add("AA");sample.add("AB");sample.add("AC");sample.add("AD");sample.add("AE");sample.add("AF");sample.add("AG");sample.add("AH");sample.add("AI");sample.add("AJ");sample.add("AK");sample.add("AL");sample.add("AM");
		dictionaryArray = DictionaryforAAtoAN.array;
		dictionaryArrayLength = DictionaryforAAtoAN.arrayLength;
		for(int i=0; i < sample.size(); i++) {
			key = sample.get(i);
			value = new ArrayList<String>();
			for(int j=0; j<dictionaryArrayLength; j++) {
				ch = dictionaryArray[j].substring(0, 2).toUpperCase();
				if(ch.equals(key)) {
					value.add(dictionaryArray[j]);
				}
			}
			map.put(key, value);
		}
		
		// for AN -> AZ
		sample = new ArrayList<String>();
		String[] dictionaryArray1 = null;
		sample.add("AN");sample.add("AO");sample.add("AP");sample.add("AQ");sample.add("AR");sample.add("AS");sample.add("AT");sample.add("AU");sample.add("AV");sample.add("AW");sample.add("AX");sample.add("AY");sample.add("AZ");
		dictionaryArray1 = DictionaryforANtoAZ.array;
		dictionaryArrayLength = DictionaryforANtoAZ.arrayLength;
		for(int i=0; i < sample.size(); i++) {
			key = sample.get(i);
			value = new ArrayList<String>();
			for(int j=0; j<dictionaryArrayLength; j++) {
				ch = dictionaryArray1[j].substring(0, 2).toUpperCase();
				if(ch.equals(key)) {
					value.add(dictionaryArray1[j]);
				}
			}
			map.put(key, value);
		}
		
		for(String key1 : map.keySet()) {
			System.out.println("KEY: "+ key1 + "\t" + "VALUE: " + map.get(key1));
			++c;
		}
		System.out.println(c);
	}
}
	

