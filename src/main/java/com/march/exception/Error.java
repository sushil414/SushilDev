package com.march.exception;

import java.util.Date;

public class Error {
	
	private int code;
	private String message;
	private Date timeStamp;
	private String path;
	
	public Error() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Error(int code, String message, Date timeStamp, String path) {
		super();
		this.code = code;
		this.message = message;
		this.timeStamp = timeStamp;
		this.path = path;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
}
