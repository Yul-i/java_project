package 상속;

public class Manager extends Employee{
	int bonus;
	
	public void test() {
		System.out.println("진급 시험을 쳐요.");
	}

	@Override
	public String toString() {
		return "Manager [bonus=" + bonus + ", name=" + name + ", address=" + address + ", salary=" + salary + ", rrn="
				+ rrn + "]";
	}
	
	
}
