package ���ǹ�;

import java.util.Date;

public class �ð���ǰ {

	public static void main(String[] args) {
		// 25�� Date 
		
		Date date = new Date();
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();
		System.out.println(hour+"��"+min+"��"+sec+"��");

		int year = date.getYear()+1900;
		int month = date.getMonth()+1;
		int today = date.getDate();
		System.out.println(year+"��"+month+"��"+today+"��");
		
		int day = date.getDay();
		System.out.println(day);
		if (day==0) {
			System.out.println("�Ͽ���");
		}else if (day==1) {
			System.out.println("������");
		}
	}

}
