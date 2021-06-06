package com.validationengine.ve.bo;

import java.io.Serializable;
import java.util.List;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WrapperInput implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4390234217071410555L;
	@JsonProperty("ac")
	private List<@Valid Aircraft> aircrafts;
	public List<Aircraft> getAircrafts() {
		return aircrafts;
	}
	public void setAircrafts(List<Aircraft> aircrafts) {
		this.aircrafts = aircrafts;
	}
}
