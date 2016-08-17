package com.bhochhi.algorithm;

public class MathExpression {

	
	public static void main(String[] args) {
		String exprn = "2+3";
		System.out.println(compute(exprn));
	}

	private static char[] compute(String exprn) {
		char[] expChars = exprn.toCharArray(); 
		// TODO Auto-generated method stub
		return null;
	}
	
	class Node{
		int key;
		String name;
		
		Node parentNode;
		Node leftNode;
		Node rightNode;
		
	}
}
