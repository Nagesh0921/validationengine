package com.validationengine.ve.bo;

import java.util.List;

public class Response {
	private Integer rowNo;
	private List<ResponseBuilder> errors;
	public List<ResponseBuilder> getBuilder() {
		return errors;
	}
	public void setBuilder(List<ResponseBuilder> builder) {
		this.errors = builder;
	}
	public Integer getRowNo() {
		return rowNo;
	}
	public void setRowNo(Integer rowNo) {
		this.rowNo = rowNo;
	}
	
	
}
