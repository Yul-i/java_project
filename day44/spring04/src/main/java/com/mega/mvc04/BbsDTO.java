package com.mega.mvc04;

public class BbsDTO {
	private String no;
	private String title;
	private String content;
	private String writer;
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	@Override
	public String toString() {
		return "BbsDTO [no=" + no + ", title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}
	
}
