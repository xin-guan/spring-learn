package com.doubleganse.exception;

/**
 * 自定义异常
 *
 * @author mingjun chen
 */
public class CustomException extends Exception {

	private Integer code = 1;
	private String message = "操作失败";

	public CustomException() {
	}

	public CustomException(String message) {
		super(message);
		this.message = message;
	}

	public CustomException(Integer code, String message) {
		this.code = code;
		this.message = message;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
