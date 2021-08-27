package com.mega.mvc07;

public class ProductDTO {
	private int pNo;
	private String name;
	private String content;
	private String date;
	
	public int getpNo() {
		return pNo;
	}
	public void setpNo(int pNo) {
		this.pNo = pNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	@Override
	public String toString() {
		return "ProductDTO [pNo=" + pNo + ", name=" + name + ", content=" + content + ", date=" + date + "]";
	}
	
}
