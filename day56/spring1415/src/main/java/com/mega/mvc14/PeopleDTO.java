package com.mega.mvc14;

public class PeopleDTO {
	private String memId;
	private String memPw;
	private String memName;
	private String birthday;
	private String gender;
	private String email;
	private String tel;
	private String address;
	private String memLevel;
	private String language;
	private String memImg;
	
	
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getMemPw() {
		return memPw;
	}
	public void setMemPw(String memPw) {
		this.memPw = memPw;
	}
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMemLevel() {
		return memLevel;
	}
	public void setMemLevel(String memLevel) {
		this.memLevel = memLevel;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getMemImg() {
		return memImg;
	}
	public void setMemImg(String memImg) {
		this.memImg = memImg;
	}
	
	
	@Override
	public String toString() {
		return "PeopleDTO [memId=" + memId + ", memPw=" + memPw + ", memName=" + memName + ", birthday=" + birthday
				+ ", gender=" + gender + ", email=" + email + ", tel=" + tel + ", address=" + address + ", memLevel="
				+ memLevel + ", language=" + language + ", memImg=" + memImg + "]";
	}
	
	
}
