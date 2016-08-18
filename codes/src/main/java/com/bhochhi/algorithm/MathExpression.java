package com.bhochhi.algorithm;

public class MathExpression {

	public static void main(String[] args) {
		String exprn = "2+3";
		System.out.println(compute(exprn));
	}

	private static int compute(String exprn) {
		char[] expChars = exprn.toCharArray();
		NodeT tree = new NodeT();
		NodeT currentNode = tree;
		for (char c : expChars) {
			if (c == '(') {
				currentNode.leftNode = new NodeT();
				currentNode = currentNode.leftNode;
			} else if (c == ')') {
				currentNode = currentNode.parentNode;
			} else if (c == '+' || c == '-' || c == '*' || c == '/') {
				currentNode.parentNode = new NodeT();
				currentNode.parentNode.value = c;
				currentNode.rightNode = new NodeT();
				currentNode = currentNode.rightNode;
			}
			else{
				currentNode.value = c;				
			}
			
		}
				
		return 0;
	}
}