package com.hoau.eai.eas.vo;

import java.util.List;

public class EASQuotationInformation {
	private String accountNumberAlone;//报账单单编号
	private String documentType;//单证类型
	private String biasLineNumber;//偏线付款单编号
	private String reimbursedMonth;//报账单月份
	private String amountPayable;//应付金额
	private String amount;//扣款金额
	private String actualAmountPaid;//实付金额
	private List<EASWaybillInformation> waybillList;
	public String getAccountNumberAlone() {
		return accountNumberAlone;
	}
	public void setAccountNumberAlone(String accountNumberAlone) {
		this.accountNumberAlone = accountNumberAlone;
	}
	public String getDocumentType() {
		return documentType;
	}
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	public String getBiasLineNumber() {
		return biasLineNumber;
	}
	public void setBiasLineNumber(String biasLineNumber) {
		this.biasLineNumber = biasLineNumber;
	}
	public String getReimbursedMonth() {
		return reimbursedMonth;
	}
	public void setReimbursedMonth(String reimbursedMonth) {
		this.reimbursedMonth = reimbursedMonth;
	}
	public String getAmountPayable() {
		return amountPayable;
	}
	public void setAmountPayable(String amountPayable) {
		this.amountPayable = amountPayable;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getActualAmountPaid() {
		return actualAmountPaid;
	}
	public void setActualAmountPaid(String actualAmountPaid) {
		this.actualAmountPaid = actualAmountPaid;
	}
	public List<EASWaybillInformation> getWaybillList() {
		return waybillList;
	}
	public void setWaybillList(List<EASWaybillInformation> waybillList) {
		this.waybillList = waybillList;
	}
	
}
