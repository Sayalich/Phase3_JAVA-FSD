package com.springcloud.feign.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name= "greetings")
public interface Greetingsclient {

	@GetMapping(value= "/calculator/welcome/{localeId}")
	public String getGreetings(@PathVariable(name= "localeId") String langCode);
	
	@GetMapping(value="/getsum/{num}")
	public String funadd(@PathVariable(name="num")int i);
     
	@GetMapping(value="/calculator/inrtousd/{num}")
	public String converttousd(@PathVariable(name="num")String number);
	
	
	@GetMapping(value="/calculator/inrtoyen/{}")
	public String convertoyen(@PathVariable(name="num")String number);
	
@GetMapping(value="/calculator/inrtoeuro/{}")
public String convertoeuro(@PathVariable(name="num")String number);
	


}