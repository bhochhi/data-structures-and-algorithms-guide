package com.bhochhi.algorithm;

import java.util.ArrayDeque;
import java.util.Deque;

import org.junit.runner.Computer;

public class MathExpression {

	public static void main(String[] args) {
		String exprn = "2+3";
		NodeT tree = parse(exprn);
		printTree(tree);
	}
	
	
	private static void printTree(NodeT tree) {
		// TODO Auto-generated method stub
		
	}

	private static NodeT parse(String exprn) {
		char[] expChars = exprn.toCharArray();
		NodeT root = new NodeT();
		
		return root;
	}
}