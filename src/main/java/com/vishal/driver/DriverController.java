package com.vishal.driver;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.login.Login;

@Controller
public class DriverController {
	
	@RequestMapping(value="/driver", method=RequestMethod.GET)
	public ModelAndView DriverPage() {
		ModelAndView mv=new ModelAndView();
		
		
		mv.setViewName("driver-list");
		
		mv.addObject("Location", "Annandale, VA");
		
		
		Login l=new Login();
		l.setName("Vishal");
		l.setAddress("Pokhara");
		mv.addObject("log",l);
		
		
		return mv;
		
		
	
		
	}
	

}
