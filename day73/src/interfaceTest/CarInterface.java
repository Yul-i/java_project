package interfaceTest;

public interface CarInterface {
	//3개 기능 정의! => 추상 메서드만 정의
	
	public void make(int amount, String color, String version);
	public void run(int speed);
	public void camping(String town, String sleep); 
}
