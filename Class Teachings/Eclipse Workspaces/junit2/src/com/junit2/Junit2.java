package com.junit2;

public class Junit2 {
	
	double multiply(double a, double b)
	{
		return (a*b);
	}
	boolean isOdd(int x)
	{
		return x%2!=0;
	}
	int[] returnNaturalNumber(int n)
	{
		int[] answer= new int[n];
		for(int i=0;i<n;i++)
			answer[i]=i+1;
		return answer;
	}
}
