package com.mega.mvc08.box;

public class 볼펜Main {

	public static void main(String[] args) {
		볼펜 pen = new 볼펜();
		
		pen.cost = 2000;
		pen.company = "모나미";
		pen.Thickness = 0.5;
		
		pen.buy();
		pen.write();
		
		System.out.println(pen);
	}

}
