package com.validationengine.ve.bo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.validationeneinge.ve.validators.DateFormat;
import com.validationeneinge.ve.validators.DateRange;
import com.validationeneinge.ve.validators.FieldDependency;
import com.validationeneinge.ve.validators.GreaterThanRange;
import com.validationeneinge.ve.validators.SpecialCharacter;
import com.validationeneinge.ve.validators.TextRange;

@FieldDependency.List({
	@FieldDependency(firstField = "engRetOption", secondField = "retScope")
})
public class Aircraft implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1885325983331171887L;
	
	@JsonProperty("acTailNo")
	@SpecialCharacter
	@GreaterThanRange
	private String acTailNo;
	
	@JsonProperty("acCycleTime")
	@TextRange
	private String acCycleTime;
	
	@JsonProperty("delDate")
	@DateFormat
	@DateRange
	private String deliveryDate;
	
	@JsonProperty("statusDate")
	@DateFormat
	@DateRange
	private String statusDate;
	
	@JsonProperty("retDate")
	@DateFormat
	@DateRange
	private String retDate;
	
	@JsonProperty("backUp")
	private Boolean backUp;
	
	@JsonProperty("acCycleSinceContract")
	@TextRange
	private String acCycleSinceContract;
	
	@JsonProperty("acTimeSinceContractStart")
	@TextRange
	private String acTimeSinceContractStart;
	
	@JsonProperty("retCycleSinceNew")
	@TextRange
	private String retCycleSinceNew;
	
	@JsonProperty("retTimeSinceNew")
	@TextRange
	private String retTimeSinceNew;
	
	@JsonProperty("billingTag")
	@SpecialCharacter
	private String billingTag;
	
	@JsonProperty("operationalDate")
	@DateFormat
	@DateRange
	private String operationalDate;
	
	@JsonProperty("engRetOpt")
	private String engRetOption;
	
	@JsonProperty("retScope")
	private String retScope;
	

	public String getEngRetOption() {
		return engRetOption;
	}

	public void setEngRetOption(String engRetOption) {
		this.engRetOption = engRetOption;
	}

	public String getRetScope() {
		return retScope;
	}

	public void setRetScope(String retScope) {
		this.retScope = retScope;
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getAcTailNo() {
		return acTailNo;
	}

	public void setAcTailNo(String acTailNo) {
		this.acTailNo = acTailNo;
	}

	public String getAcCycleTime() {
		return acCycleTime;
	}

	public String getStatusDate() {
		return statusDate;
	}

	public void setStatusDate(String statusDate) {
		this.statusDate = statusDate;
	}

	public String getRetDate() {
		return retDate;
	}

	public void setRetDate(String retDate) {
		this.retDate = retDate;
	}

	public Boolean getBackUp() {
		return backUp;
	}

	public void setBackUp(Boolean backUp) {
		this.backUp = backUp;
	}

	public String getAcCycleSinceContract() {
		return acCycleSinceContract;
	}

	public void setAcCycleSinceContract(String acCycleSinceContract) {
		this.acCycleSinceContract = acCycleSinceContract;
	}

	public String getAcTimeSinceContractStart() {
		return acTimeSinceContractStart;
	}

	public void setAcTimeSinceContractStart(String acTimeSinceContractStart) {
		this.acTimeSinceContractStart = acTimeSinceContractStart;
	}

	public String getRetCycleSinceNew() {
		return retCycleSinceNew;
	}

	public void setRetCycleSinceNew(String retCycleSinceNew) {
		this.retCycleSinceNew = retCycleSinceNew;
	}

	public String getRetTimeSinceNew() {
		return retTimeSinceNew;
	}

	public void setRetTimeSinceNew(String retTimeSinceNew) {
		this.retTimeSinceNew = retTimeSinceNew;
	}

	public String getBillingTag() {
		return billingTag;
	}

	public void setBillingTag(String billingTag) {
		this.billingTag = billingTag;
	}

	public String getOperationalDate() {
		return operationalDate;
	}

	public void setOperationalDate(String operationalDate) {
		this.operationalDate = operationalDate;
	}

	public void setAcCycleTime(String acCycleTime) {
		this.acCycleTime = acCycleTime;
	}
	
	
}
