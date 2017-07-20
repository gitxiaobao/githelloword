package com.hoau.eai.eas.vo;

import java.util.List;

public class EASBiasLineInformation {
	private String biasLineNumber;//偏线付款单编号
	private String state;//状态	
	private String nameOfAgent;//代理公司名称
	private String subordinateCompany;//	所属一级公司
	private String amountPayable;//	应付金额
	private String amount;//扣款金额	
	private String actualAmountPaid;//		实付金额
	private String loadingType;//装车类型	
	private String whetherRefund;//是否退票	
	private String refundAbstract;//退票摘要	
	private String refundTime;//	退票时间 
	private String paymentMethod;//付款方式	
	private String accountName;//户名	
	private String accountNum;//账号	
	private String accountBank;//	开户行
	private String accountProvince;//省份	
	private String accountCity;//市县
	private List<EASQuotationInformation> quotationList;
	public String getBiasLineNumber() {
		return biasLineNumber;
	}
	public void setBiasLineNumber(String biasLineNumber) {
		this.biasLineNumber = biasLineNumber;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getNameOfAgent() {
		return nameOfAgent;
	}
	public void setNameOfAgent(String nameOfAgent) {
		this.nameOfAgent = nameOfAgent;
	}
	public String getSubordinateCompany() {
		return subordinateCompany;
	}
	public void setSubordinateCompany(String subordinateCompany) {
		this.subordinateCompany = subordinateCompany;
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
	public String getLoadingType() {
		return loadingType;
	}
	public void setLoadingType(String loadingType) {
		this.loadingType = loadingType;
	}
	public String getWhetherRefund() {
		return whetherRefund;
	}
	public void setWhetherRefund(String whetherRefund) {
		this.whetherRefund = whetherRefund;
	}
	public String getRefundAbstract() {
		return refundAbstract;
	}
	public void setRefundAbstract(String refundAbstract) {
		this.refundAbstract = refundAbstract;
	}
	public String getRefundTime() {
		return refundTime;
	}
	public void setRefundTime(String refundTime) {
		this.refundTime = refundTime;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getAccountBank() {
		return accountBank;
	}
	public void setAccountBank(String accountBank) {
		this.accountBank = accountBank;
	}
	public String getAccountProvince() {
		return accountProvince;
	}
	public void setAccountProvince(String accountProvince) {
		this.accountProvince = accountProvince;
	}
	public String getAccountCity() {
		return accountCity;
	}
	public void setAccountCity(String accountCity) {
		this.accountCity = accountCity;
	}
	public List<EASQuotationInformation> getQuotationList() {
		return quotationList;
	}
	public void setQuotationList(List<EASQuotationInformation> quotationList) {
		this.quotationList = quotationList;
	}
	
}
