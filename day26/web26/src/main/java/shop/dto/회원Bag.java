package shop.dto;

public class 회원Bag {
	//public String id; //모든 패키지에서 접근 가능
	//private String id //해당 클래스 안에서만 접근 가능
	private String id;	//default 접근제어자, 같은 패키지내에서만 접근 가능
	private String pw;
	private String name;
	private String tel; //String tel=null;
	//멤버 변수, 클래스 바로 아래 선언됨.
	//선언의 위치는 생존범위를 결정 => 클래스 전역에서 사용
	//전역 변수(Global, 글로벌 변수), 자동 초기화 됨.
	//참조형인 경우, null로 초기화 됨.
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	//값을 넣을 때는 set변수명();  //대문자로 시작 // setId();
	//값을 꺼낼 때는 get변수명();				// getId();
	//getters/setters
	
}
