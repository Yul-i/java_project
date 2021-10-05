package interfaceTest;

public class 컴퓨터사용 {
	public static void main(String[] args) {
		AppleComputer com1 = new AppleComputer();
		
		com1.typing("일본어");
		com1.search("고릴라의 생태");
		com1.game("카트라이더");
		
		BananaComputer com2 = new BananaComputer();
		
		com2.typing("한국어");
		com2.search("자바 잘하는 법");
		com2.game("스타크래프트");
	}
}
