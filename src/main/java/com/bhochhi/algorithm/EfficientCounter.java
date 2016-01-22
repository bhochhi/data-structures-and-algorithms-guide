package com.bhochhi.algorithm;

import java.util.HashMap;

public class EfficientCounter {

	public static void main(String[] args) {
		String s = "one two three two three three";
		String[] sArr = s.split(" ");
		HashMap<String, MutableInteger> efficientCounter = new HashMap<String, MutableInteger>(); 

		for (String a : sArr) {
			MutableInteger initValue = new MutableInteger(1);
			MutableInteger oldValue = efficientCounter.put(a, initValue);
	 
			if (oldValue != null) {
				initValue.set(oldValue.get() + 1);
			}
		}
		
		efficientCounter.forEach((x,y)-> {			
			System.out.println(x);
			System.out.println(y.toString());
			
		});
	 
	}
	
}
