package com.nit.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController 
{
	
	@GetMapping("/welcome")
	public ModelAndView getMsg()
	{
		ModelAndView mav=new ModelAndView();
		
		mav.addObject("msg","swapnil laxman jadhav");
		mav.setViewName("welcome");
		
		return mav;
	}
}
