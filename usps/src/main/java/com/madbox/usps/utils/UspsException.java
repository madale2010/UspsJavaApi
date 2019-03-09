/*******************************************************
 * Copyright (C) 2012-2019 Adam Dale adamdale2018@gmail.com
 * 
 * This file is part of Madbox Solutions.
 * 
 * USPS Java Api can not be copied and/or distributed without the express
 * permission of Madbox Solutions.
 *******************************************************/
package com.madbox.usps.utils;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 */
public class UspsException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor
	 */
	public UspsException()
	{
	}

	/**
	 * Constructor
	 * @param message
	 */
	public UspsException(String message)
	{
		super(message);
	}

	/**
	 * Constructor
	 * @param cause
	 */
	public UspsException(Throwable cause)
	{
		super(cause);
	}

	/**
	 * Constructor
	 * @param message
	 * @param cause
	 */
	public UspsException(String message, Throwable cause)
	{
		super(message, cause);
	}

	/**
	 * Constructor
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public UspsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
	{
		super(message, cause, enableSuppression, writableStackTrace);
	}
	

	/**
	 * @param e
	 */
	public static void processError(Exception e) {
		//throw new CustomException(e);
		try {
			throw new ServletException(e);
		} catch (ServletException e1) {
			
			Logger logger = Logger.getLogger(UspsException.class.getName());
			logger.log(Level.SEVERE, e.getMessage(), e);
			   StringBuilder stringBuilder = new StringBuilder();
			   
			    for(StackTraceElement stackTraceElement : e.getStackTrace()) {
			      stringBuilder.append(stackTraceElement);
			      stringBuilder.append("\n");
			    }
		}
	}
	/**
	 * @param e
	 * @param request 
	 * @param response 
	 */
	public static void processError(Exception e,HttpServletRequest request, HttpServletResponse response){
		try {
			throw new UspsException(e);
		} catch (UspsException e1) {
			
			Logger logger = Logger.getLogger(UspsException.class.getName());
			logger.log(Level.SEVERE, e.getMessage(), e);
			   StringBuilder stringBuilder = new StringBuilder();
			   
			    for(StackTraceElement stackTraceElement : e.getStackTrace()) {
			      stringBuilder.append(stackTraceElement);
			      stringBuilder.append("\n");
			    }
			}
	}
}
