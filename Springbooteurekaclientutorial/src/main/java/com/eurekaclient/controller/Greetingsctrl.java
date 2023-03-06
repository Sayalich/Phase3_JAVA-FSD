package com.eurekaclient.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value= "/calculator")
public class Greetingsctrl {
	// Greetings map.
	static Map<String, String> greetings;
	// Initialize the greetings map at the application start-up.
	static {
		greetings = new HashMap<String, String>();
		greetings.put("fr", "BONJOUR");
		greetings.put("es", "HOLA");
		greetings.put("de", "GUTENTAG");
		greetings.put("it", "CIAO");
		greetings.put("hi", "नमस्ते");
		greetings.put("en", "GOOD MORNING");
	}

	@GetMapping(value= "/welcome/{localeId}")
	public String getGreetings(@PathVariable(name= "localeId") String langCode) {
		System.out.println("Fetching greetings type for locale id= " + langCode);
		String msg = greetings.entrySet().stream().filter((code) -> langCode.equalsIgnoreCase(code.getKey()))
				.map(langName -> langName.getValue()).collect(Collectors.joining());
		return msg;
	}
	
	// TO CONVERT INR TO USD
	@GetMapping(value="/inrtousd/{money}")
	public String converttousd(@PathVariable(name="money")double amt)
	{
		
	  double ans=amt*0.012;
	  
	String s= Double.toString(ans);
	return s;
	    
		//return ans;
	}
	
	@GetMapping(value="/inrtoyen/{money}")
	public String converttoyen(@PathVariable(name="money") double amt)
	{
		double ans=amt*1.66;
		String s=Double.toString(ans);
		return s;
	}
	@GetMapping(value="/inrtoeuro/{paisa}")
	public String converttoeuro(@PathVariable(name="paisa")double amount)
	{
		double ans=amount*0.011;
		String s=Double.toString(ans);
		return s;
	}
//	
//	@GetMapping(value="/add/{num}")
//	public String funadd(@PathVariable(name="num") int number)
//	{
//		String ans=Integer.toString(number *number);
//		return ans;
//	}
//	
//	@GetMapping(value="/mul/{num}")
//	public String funmul(@PathVariable(name="num") int number)
//	{
//		String ans=Integer.toString(number*number);
//		return ans;
//	}
//	@GetMapping(value="/div/{localnum}")
//	public String fundiv(@PathVariable(name="localnum")int local)
//	{
//		String ans=Integer.toString(local);
//		return ans;
//	}
//	@GetMapping(value="/printing/{sa}")
//	public String funname(@PathVariable(name="sa")String number)
//	{
//		String ans=number;
//		return ans;
//	}
}