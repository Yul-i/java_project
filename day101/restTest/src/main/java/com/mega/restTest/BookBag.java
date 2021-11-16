package com.mega.restTest;

public class BookBag {
	
	private String id;
	private String name;
	private String url;
	private String Img;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getImg() {
		return Img;
	}
	public void setImg(String img) {
		Img = img;
	}
	
	
	@Override
	public String toString() {
		return "BookBag [id=" + id + ", name=" + name + ", url=" + url + ", Img=" + Img + "]";
	}
}

