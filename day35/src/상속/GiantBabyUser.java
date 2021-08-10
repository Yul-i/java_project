package 상속;

public class GiantBabyUser {

	public static void main(String[] args) {
		GiantBaby gBaby = new GiantBaby();
		gBaby.age = 1;
		gBaby.name = "희동이";
		gBaby.toy = "또봇";
		gBaby.sound = 300;
		
		System.out.println(gBaby);
		gBaby.think();
		gBaby.tool();
		gBaby.cry();
		gBaby.Crawl();
	}

}
