package com.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class SampleController {

	@RequestMapping("/hello")
	public String test(){
		return "Hello Test";
	}
	
}
