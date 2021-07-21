package 생성자;

public class 폰 {
	String company;
	String color;
	int price;
	
	public 폰(String company, String color, int price) {
		this.company = company;
		this.color = color;
		this.price = price;
	}

	public String toString() {
		return "폰 [company=" + company + ", color=" + color + ", price=" + price + "]";
	}
	
	
	
	
//	public 폰(String company, String color, int price) {
//		//this는 이 클래스를 나타냄, this.company의미는
//		//이 클래스의 바로 아래에 있는 com 변수
//		this.company = company;
//		this.color = color;
//		this.price = price;
//	}
//	
//	public String toString() {
//		return company+", "+color+", "+price;
//	}
}

