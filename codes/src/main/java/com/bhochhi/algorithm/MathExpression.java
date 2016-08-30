package com.bhochhi.algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MathExpression {

	public static void main(String[] args) {
		String exprn = "2+ 3";
		NodeT tree = parse(exprn);
		printTree(tree);
	} 
	
	
	private static void printTree(NodeT tree) {
		System.out.println(tree.value);
		while(tree.hasChild()){
			List<NodeT> nodes = tree.getChildren();
			for(NodeT n: nodes){
				printTree(n);
			}
			
		}
		
	}

	private static NodeT parse(String exprn) {
		System.out.println((exprn.toCharArray().length));
		Collections.reverse(expChars);
		NodeT root = new NodeT();
//		for(String c : expChars){
//			System.out.println(c);
//		}
		
		return root;
	}
}