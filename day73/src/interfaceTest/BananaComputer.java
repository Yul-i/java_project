package interfaceTest;

public class BananaComputer implements ComputerInterface {

	@Override
	public void typing(String language) {
		System.out.println("기본 설정언어는 "+language+" 입니다.");
	}

	@Override
	public void search(String word) {
		System.out.println("google에서 "+word+"를 검색합니다.");
	}

	@Override
	public void game(String game) {
		System.out.println("기본 게임으로 "+game+"이 설치되어 있습니다.");
	}

}
