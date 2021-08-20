package day43;

public class 콘도bag {
	String num;
	String name;
	int money;
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "번호:    " + num + ", 이름:    " + name + ", 은행잔고:    " + money + "\n";
	}
	

}
