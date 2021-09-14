package com.mega.mvc14;

public class ReplyDTO {
	private int id;
	private String content;
	private String writer;
	private int bbsId;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getBbsId() {
		return bbsId;
	}
	public void setBbsId(int bbsId) {
		this.bbsId = bbsId;
	}
	
	
	@Override
	public String toString() {
		return "ReplyDTO [id=" + id + ", content=" + content + ", writer=" + writer + ", bbsId=" + bbsId + "]";
	}
	
	
}
