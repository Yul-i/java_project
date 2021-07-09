package 클래스사용;

public class 상품리스트DB {
	
	String ip = "localhost";
	String port = "3306";
	String id = "root";
	String pw = "1234";
	String table = "TravleProducts";
	
// 	Table - TravleProductsDB
	
//	String MainTitle = "[연합상품][버스]강원도권으로 떠나는 당일여행";
//	String SubTitle = "강릉, 평창, 인제, 원주, 영월 등 강원도 지역으로 떠나는 당일, 무박 테마여행";
//	int AdultCost = 27900;
	
	
	public void read() {
		for (int i = 0; i <= 3; i++) {
			System.out.println("상품 리스트 "+i+"출력");			
		}
	}

	

}
