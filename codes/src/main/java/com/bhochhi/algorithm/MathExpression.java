package com.bhochhi.algorithm;

import java.util.ArrayDeque;
import java.util.Deque;

import org.junit.runner.Computer;

public class MathExpression {

	public static void main(String[] args) {
		String exprn = "2+3";
		NodeT tree = parseToTree(exprn);
		System.out.println(eval(tree));
	}

	
	private static int solveUsingStack(String expr){
		char[] expChars = expr.toCharArray();
		Deque<Character> stack = new ArrayDeque<Character>();
		for(char c: expChars){
			stack.push(c);
			if(isOperator(c)){
				stack.push(c);
			}
			else if(isOperand(c)){				
				stack.push(c);
			}
			else if(isClosingParenthesis(c)){
				int subTotal = evalParenthesis(stack); 
				if(hasMultipleDigit(subTotal)){
					char[] chars = subTotal.toString().toCharArray();
				}
				stack.push(subTotal);
			}
		}
		
		
		return 0;
	}
	
	
	private static char[] eval(NodeT tree) {
		// TODO Auto-generated method stub
		return null;
	}

	private static NodeT parseToTree(String exprn) {
		char[] expChars = exprn.toCharArray();
		NodeT top = new NodeT();
		NodeT currentNode = top;
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
				
		return top;
	}
}