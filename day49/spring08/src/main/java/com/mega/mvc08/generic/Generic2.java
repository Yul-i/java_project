package com.mega.mvc08.generic;

import java.util.ArrayList;
import java.util.HashMap;

import com.mega.mvc08.MemberDTO;

public class Generic2 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("hong", 1000);
		map.put("kim", 2000);
		System.out.println(map);
		
		HashMap<Integer, MemberDTO> map2 = new HashMap<>();
		
		map2.put(1, new MemberDTO());
		map2.put(2, new MemberDTO());
		System.out.println(map2);
		
	}

}
