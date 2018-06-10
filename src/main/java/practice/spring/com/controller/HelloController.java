package practice.spring.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping(value = {"/", "/index"})
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="/home", method = RequestMethod.GET)
	public String hello() {
		return "home";
	}
	
	@RequestMapping("/test1/{id}")
	  public String test1(@PathVariable("id") int id, Model model) {
	    model.addAttribute("id", id);
	    return "test1";
	  }
	
	  @RequestMapping("/test2/{id}/{name}")
	  public String test2(@PathVariable("id") int id, @PathVariable("name") String name, Model model) {
	    model.addAttribute("id", id);
	    model.addAttribute("name", name);
	    return "test2";
	  }
	  
	  @RequestMapping(value = "/getJson", method = RequestMethod.POST, produces="application/json")
	  @ResponseBody
	  public String test3(@RequestParam("data_form") String data_form, Model model) {
		System.out.println(data_form);
	    return data_form;
	  }
}
