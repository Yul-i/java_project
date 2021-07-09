package 클래스생성;

public class Labtop {
	public String kinds;
	public int size;
	public String color;
	public boolean adapter;
	
	public void 전원on() {
		System.out.println("노트북 전원이 켜집니다.");
	}
	
	public void 전원off() {
		System.out.println("노트북 전원이 꺼집니다.");
	}
	
	public void 충전on() {
		System.out.println("노트북이 충전됩니다.");
	}
	
	public void 충전off() {
		System.out.println("노트북 배터리를 사용합니다.");
	}

}
