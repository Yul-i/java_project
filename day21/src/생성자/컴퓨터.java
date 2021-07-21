package 생성자;

public class 컴퓨터 {
	int price;
	String company;
	int size;
	
	public 컴퓨터(int price, String company, int size) {
		this.price = price;
		this.company = company;
		this.size = size;
	}

	public String toString() {
		return "컴퓨터 [price=" + price + ", company=" + company + ", size=" + size + "]";
	}
	
}	
