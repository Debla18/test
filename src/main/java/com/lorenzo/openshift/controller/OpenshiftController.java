package com.lorenzo.openshift.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OpenshiftController {
	@RequestMapping(value="/")
	public ModelAndView homePage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Home");
		return mv;
	}
}
