package com.validationengine.ve.bo;

public class ResponseBuilder {
	private String fieldName;
	private String message;
	
	public ResponseBuilder() {
		
	}
	
	public ResponseBuilder(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
}
