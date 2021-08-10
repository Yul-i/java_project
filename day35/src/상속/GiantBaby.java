package 상속;

public class GiantBaby extends Baby {
	int sound;
	
	public void Crawl() {
		System.out.println("기어다니다.");
	}

	@Override
	public String toString() {
		return "GiantBaby [sound=" + sound + ", toy=" + toy + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
