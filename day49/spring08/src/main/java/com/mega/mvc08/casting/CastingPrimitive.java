package com.mega.mvc08.casting;

public class CastingPrimitive {

	public static void main(String[] args) {
		//기본형 형변환(정수, 실수, 문자, 논리)
		//형변환(데이터 type 변환)
		byte b1 = 100;//-128~127
		int i1 = 200;
		
		i1 = b1; //가능 int(큰)<-----byte(작은)
		//자동으로 byte에 들어있던 100데이터가 int로 변환되어 저장됨
		//자동 데이터 변환(자동형변환)
		
		b1 = (byte)i1; //불가능 int(큰)----->byte(작은)
		//강제로 int에 들어있던 100데이터가 byte로 변환되어 저장됨
		//강제 데이터 변환(강제형변환)
		
		int i2 = 3000;
		byte b2 = (byte)i2;
		System.out.println(b2);//-72
		//강제형변환이 가능한 이유는 범위의 값만 가능
	}

}
