/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.tony.common.exception;

/**
 * 业务异常
 *
 * @date: 2017年5月1日 下午10:46:40
 * @author Tony 
 */
public class ServiceException extends Exception {

	private static final long serialVersionUID = -5668118464476660981L;

	public ServiceException(String message) {
		super(message);
	}

	public ServiceException(String message, Throwable t) {
		super(message, t);
	}
}
