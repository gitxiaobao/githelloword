package com.hoau.eai.eas.vo;

import java.util.List;

public class EASQuotationInformation {
	private String accountNumberAlone;//���˵������
	private String documentType;//��֤����
	private String biasLineNumber;//ƫ�߸�����
	private String reimbursedMonth;//���˵��·�
	private String amountPayable;//Ӧ�����
	private String amount;//�ۿ���
	private String actualAmountPaid;//ʵ�����
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
