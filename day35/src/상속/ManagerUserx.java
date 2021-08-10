package 상속;

public class ManagerUserx {

	public static void main(String[] args) {
		Manager manager = new Manager();
		
		manager.name = "김김김";
		manager.address = "파주시";
		manager.salary = 2600;
		manager.rrn = 000000;
		manager.bonus = 1000;
		
		manager.test();
		System.out.println(manager);
	}

}
