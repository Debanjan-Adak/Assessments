package com.junit;

public class Junit {
	
	public int add(int a,int b)
	{
		return (a+b);
	}
	public String rev(String str)
	{
		String result="";
		for(int i=str.length()-1;i>=0;i--)
		{
			result+=str.charAt(i);
		}
		return result;
	}
}
