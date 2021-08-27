package com.mega.mvc07;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	@RequestMapping("productInsert")
	public void insert(ProductDTO dto) {
		System.out.println("받아온 값 결과 : " + dto);
	}
}
