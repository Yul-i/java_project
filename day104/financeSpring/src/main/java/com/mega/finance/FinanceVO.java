package com.mega.finance;

public class FinanceVO {
	private String today;
	private String yesterday;
	private String high;
	private String company;
	private String code;
	
	
	public String getToday() {
		return today;
	}
	public void setToday(String today) {
		this.today = today;
	}
	public String getYesterday() {
		return yesterday;
	}
	public void setYesterday(String yesterday) {
		this.yesterday = yesterday;
	}
	public String getHigh() {
		return high;
	}
	public void setHigh(String high) {
		this.high = high;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	
	@Override
	public String toString() {
		return "FinanceVO [today=" + today + ", yesterday=" + yesterday + ", high=" + high + ", company=" + company
				+ ", code=" + code + "]";
	}
	
	
}
