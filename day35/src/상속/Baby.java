package 상속;

public class Baby extends Person {
	String toy;
	
	public void cry() {
		System.out.println("배가 고파서 울다.");
	}

	@Override
	public String toString() {
		return "Baby [toy=" + toy + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
