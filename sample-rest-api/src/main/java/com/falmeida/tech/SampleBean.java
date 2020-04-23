package com.falmeida.tech;

public class SampleBean {

	private String message;

	public SampleBean(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return String.format("SampleBean [message=%s]", message);
	}
	
}
