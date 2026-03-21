package com.capgemini.Springboot2.exceptions;

public class NotFoundException extends RuntimeException{
	
	public NotFoundException(String msg)
	{
		super(msg);
	}

}
