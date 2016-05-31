package com.bhochhi.algorithm;

public class Fibonacci {
	public static void main(String[] args) {
	  int nth = Integer.parseInt(args[0]);
	  long start = System.currentTimeMillis();
	  for(int i = 0; i<nth;i++){
		  System.out.print(getFib(i)+" ");		  
	  }
	  System.out.println("\nmultple recursion: "+(System.currentTimeMillis() - start));
	  System.out.println();
	  //using corecursion
	  start = System.currentTimeMillis();
	  for(int i = 0; i<nth;i++){
		  System.out.print(fibWithSingleRecursion(i)+" ");		  
	  }	 
	  System.out.println("\ncorecursion: "+(System.currentTimeMillis() - start));
		 
	}

	private static int getFib(int i) {
		if(i==0 || i == 1) {
			return i;
		}
		return getFib(i-1)+getFib(i-2);
	}
	
	private static int fibWithSingleRecursion(int n){
		
		return usingCorecusion(n,0,1);
	}

	private static int usingCorecusion(int n, int preFib, int currentFib) {
		if(n==0 || n == 1) {
			return n;
		}
		else if(n==2){
			return preFib + currentFib;
		}
		else{
			return usingCorecusion(n-1, currentFib, preFib + currentFib);
		}
	}
	
}
