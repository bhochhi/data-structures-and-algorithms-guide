package com.bhochhi.algorithm.stringandarray;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseArrayTest {
	
	private ReverseArray reverseArray;
	private Integer[] array;
	private Integer[] expectedArray;
	
	
	@Before
	public void init(){		
		givenAReverseArrayUtilityService();
		givenAnArrayOfIntegerType();
	}
	
	
	private void givenAReverseArrayUtilityService() {
		reverseArray = new ReverseArrayImpl();		
	}


	private void givenAnArrayOfIntegerType() {		
		array = new Integer[]{1,2,3,4};
		expectedArray = new Integer[]{4,3,2,1};		
	}
	


	@Test
	public void should_reverse_the_original_array(){
		Assert.assertArrayEquals(expectedArray,reverseArray.reverse(array));
	}

}
