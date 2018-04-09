package org.musin.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.musin.domain.ProductVO;

@Controller
public class SampleController5 {
	
	@RequestMapping("/doJSON")
	public @ResponseBody ProductVO doJSON() {
		ProductVO vo = new ProductVO("���û�ǰ", 30000);
		
		return vo;
	}

}
