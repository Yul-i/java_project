package 배열생성;

public class 기본형배열2 {

	public static void main(String[] args) {
	//	int[] : int 타입의 배열을 가르키는 주소가 들어간다는 의미
	//  s : 힙영역에 할당된 저장공간의 주소가 들어간다.
	//  = : 힙영역에 할당된 저장공간의 주소를 변수에 넣는다.
	//  new : 힙영역에 지정된 타입의 크기만큼 배열을 만들어라.
	//  int[10] : 배열로 만들어진 데이터의 타입과 크기가 설정/0~9까지의 index를 가진 배열 생성
		
		int[] s = new int[10];
		
		System.out.println(s.length);//배열의 갯수
		
		for (int i = 0; i < s.length; i++) {//i=index
			System.out.print(s[i]+" ");
			//배열은 자동 초기화 되어있음
		}System.out.println();
		
		for (int i = 0; i < s.length; i++) {
			s[i] = i;
		}
		
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]+ 1 + " ");
			
		}

	}

}
