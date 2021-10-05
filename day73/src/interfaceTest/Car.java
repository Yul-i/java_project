package interfaceTest;

public class Car implements CarInterface {

	@Override
	public void make(int amount, String color, String version) {
		System.out.println("생산하는 차 갯수 : "+ amount+ " 차 색상 : "+color+" 차 버전 : "+version);
	}

	@Override
	public void run(int speed) {
		System.out.println("차가 시속 "+speed+"km/h 로 달린다.");
	}

	@Override
	public void camping(String town, String sleep) {
		System.out.println("오늘의 여행지 : "+town+", 오늘은 "+sleep+"을 할것이다.");
		
	}

}
