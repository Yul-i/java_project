package dto;

public class DTOTest2 {
	public static void main(String[] args) {
		//게시판 Bag을 2개 만들어서, 값들을 넣어보고
		// 넣은 값들을 프린트 해보세요. toString()
		//그림 그려보세요.
		//bag[주소] <--- id[null]
//						title[null]
//						content[null]
//						writer[null]
		게시판Bag bag = new 게시판Bag();
		bag.setId("1");
		bag.setTitle("너구리의 생태");
		bag.setContent("너구리는 음식을 씻어먹는다.");
		bag.setWriter("너구리");		
		
		System.out.println(bag);
		
		게시판Bag bag2 = new 게시판Bag();
		bag2.setId("2");
		bag2.setTitle("곰돌이의 생태");
		bag2.setContent("곰돌이는 겨울잠을 잔다.");
		bag2.setWriter("곰돌이");
		
		System.out.println(bag2);
	}
	
}
