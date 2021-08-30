package com.mega.mvc08.generic;

public class Truck <T1, T2>{
	T1 weight;
	T2 distance;
	
	
	@Override
	public String toString() {
		return "Truck [weight=" + weight + ", distance=" + distance + "]";
	}
	
	
}
