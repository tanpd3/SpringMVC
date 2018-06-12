package practice.spring.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	 @RequestMapping(value = {"", "/", "/home"})
	  public String index() {
	    return "home";
	  }
}
