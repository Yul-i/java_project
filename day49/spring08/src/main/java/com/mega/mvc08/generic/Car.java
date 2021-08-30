package com.mega.mvc08.generic;

public class Car<T> {
	T size;

	@Override
	public String toString() {
		return "Car [size=" + size + "]";
	}
	
}
