package 생성자;

public class MemberBag {
	
	String id;
	String pw;
	String name;
	String tel;
	
	
	public MemberBag(String id, String pw, String name, String tel) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.tel = tel;
	}


	@Override
	public String toString() {
		return "MemberBag [id=" + id + ", pw=" + pw + ", name=" + name + ", tel=" + tel + "]";
	}
	
	
}
