package com.bhochhi.algorithm.stringandarray;

public class ReverseArrayImpl implements ReverseArray<Object> {

	public Object[] reverse(Object[] array) {
	    int j = 0;
	    int len = array.length;
	    Object[] result = new Object[len];
		for(int i = len-1;i >= 0; i-- ){
			result[j++] = array[i];
		}
		return result;
	}
}
