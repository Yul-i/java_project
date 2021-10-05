package interfaceTest;

public class AppleComputer implements ComputerInterface {

	@Override
	public void typing(String language) {
		System.out.println("사용 언어는 : "+language);
	}

	@Override
	public void search(String word) {
		System.out.println("검색할 단어는 : "+word);
	}

	@Override
	public void game(String game) {
		System.out.println(game+" 게임을 실행합니다.");
	}

}
