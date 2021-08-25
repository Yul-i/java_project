package com.mega.mvc06;

import java.io.FileWriter;
import java.io.IOException;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicBean1;

public class Problem05 {

	  public  void call() {
	      try {
	         System.out.println(3/0);
	      } catch (Exception e) {
	         System.out.println("내가 예외처리 다 함..!");
	      }
	   }
	   


}
