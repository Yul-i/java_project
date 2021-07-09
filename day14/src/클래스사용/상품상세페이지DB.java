package 클래스사용;

public class 상품상세페이지DB {
	
	String ip = "localhost";
	String port = "3306";
	String id = "root";
	String pw = "1234";
	String table1 = "TravleProducts";
	String table2 = "TravleReservation";
	
// 	Table - TravleProductsDB
	
//	String MainTitle = "[연합상품][버스]강원도권으로 떠나는 당일여행";
//	String SubTitle = "강릉, 평창, 인제, 원주, 영월 등 강원도 지역으로 떠나는 당일, 무박 테마여행";
//	String Tag = "#국내여행";
//	String getDuring = "0박 1일";
//	String TermDeparture = "07:00 전용차량 출발";
//	String TermArrival = "00:00 도착";
//	String LocalTown = "강릉, 평창, 원주";
//	int ReservedPerson = 0;
//	int ReservePossiblePerson = 25;
//	int ReserveleastPerson = 4;
//	int AdultCost = 27900;
//	int ChildCost = 10900;
//	String ReserveDay = "2021년 7월 9일 금요일";
//	String ReservePossibility = "예약가능";
//	String DeparturePossible = "출발확정";
//	int ReserveAdult = 2;
	
	
//  Table - TravleReservationDB
	
//	String SubTitle = "강릉, 평창, 인제, 원주, 영월 등 강원도 지역으로 떠나는 당일, 무박 테마여행";
//	String eserveDay = "2021년 7월 9일 금요일";
//	int ReserveAdult = 2;
//	int ReserveChild = 0;
//	int TotalCost = 55800;
	
	
	public void read() {
		System.out.println("상품 상세 페이지 조회");
	}
	
	public void update() {
		System.out.println("결제페이지로 넘길 데이터 저장");
	}

	

}
