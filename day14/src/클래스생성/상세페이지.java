package 클래스생성;

import 클래스사용.TravleProductsDB;
import 클래스사용.TravleReservationDB;

public class 상세페이지 {

	public static void main(String[] args) {
		TravleProductsDB travleProductsDB = new TravleProductsDB();
		
		travleProductsDB.getMainTitle();
		travleProductsDB.getSubTitle();
		travleProductsDB.getTag();
		travleProductsDB.getDuring();
		travleProductsDB.getTermDeparture();
		travleProductsDB.getTermArrival();
		travleProductsDB.getLocalTown();
		travleProductsDB.getReservedPerson();
		travleProductsDB.getReservePossiblePerson();
		travleProductsDB.getReserveleastPerson();
		travleProductsDB.getAdultCost();
		travleProductsDB.getChildCost();
		travleProductsDB.getReserveDay();
		travleProductsDB.getReservePossibility();
		travleProductsDB.getDeparturePossible();
		travleProductsDB.setReserveAdult();
		
		System.out.println();
		
		TravleReservationDB travleReservationDB = new TravleReservationDB();
		
		travleReservationDB.setSubTitle();
		travleReservationDB.setReserveDay();
		travleReservationDB.setReserveAdult();
		travleReservationDB.setReserveChild();
		travleReservationDB.setTotalCost();

	}

}
