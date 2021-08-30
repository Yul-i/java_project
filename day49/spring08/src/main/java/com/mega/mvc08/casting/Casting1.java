package com.mega.mvc08.casting;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import com.mega.mvc08.MemberDTO;

public class Casting1 {

	public static void main(String[] args) {
		//클래스간 캐스팅은 상속관계에 있는 클래스만 가능!
		ArrayList list = new ArrayList();
		
		MemberDTO dto = new MemberDTO();
		dto.setId("hong");
		
		list.add(dto);  //Object(큰) <--자동형변환-- MemberDTO(작)
		list.add("hong"); //Object(큰) <--자동형변환-- String(작)
		list.add(new Date()); //Object(큰) <--자동형변환-- Date(작)
		list.add(new Random()); //Object(큰) <--자동형변환-- Random(작)
		list.add(100); //Object(큰) <--자동형변환(업캐스팅)-- Integer(작)<--오토박싱--int(기본형)
		list.add(11.11);//Object(큰) <--자동형변환-- Double(작)<--auto-boxing--double(기본형)
		//업, 다운은 클래스에서만 사용
		System.out.println(list);
		
		
		Object dto2= list.get(0); //Object
//		System.out.println(dto2.getId());
		//업매스팅되어 Object로 들어간 객체는 원래 클래스가 가지고 있던
		//자식에서 추가된 메서드를 쓸 수 없게 된다.
		//부모클래스로 업캐스팅 하는 경우는 자식에서 추가된 메서드를 인식 못한다.
		
		//자식에게 추가된 메서드를 사용하고 싶으면 
		//다시 자식타입으로 변환해야 한다.
		//자식 타입은 부모타입 보다 작으므로 강제 형변환이 필요하다.
		MemberDTO dto3 = (MemberDTO) list.get(0); 
		//memberDTO(작)<--강제형변환(다운캐스팅)--Object
		System.out.println(dto3.getId());
		
		//100을 꺼내서 1을 더해보자.
		System.out.println(list.get(4));
		int age = (Integer) list.get(4);
		System.out.println(age+1);
		//int <--오토언박싱 --Integer <-다운캐스팅 -- Object
		//11.11을 꺼내서 100을 더해보세요.
		double temp = (double) list.get(5);
		System.out.println(temp+100);
		//double <-오토언박싱--Double<-다운캐스팅--Object
	}

}
