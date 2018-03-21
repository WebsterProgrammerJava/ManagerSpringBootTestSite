package br.com.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;

@Controller
@RequestMapping("/home")
public class PrincipalController {
	
	@RequestMapping(value= "/principal", method = RequestMethod.GET)
	public ModelAndView paginaInicial() {
	
	
	  return new ModelAndView("index");

	
	}
	
	@RequestMapping(value= "/biografia", method = RequestMethod.GET)
	public ModelAndView pageBiografia() {
		
		
		return new ModelAndView("page2");
	}
	
	@RequestMapping(value= "/blog", method = RequestMethod.GET)
	public ModelAndView pageBlog() {
		
		
		return new ModelAndView("page3");
	}
	
	
	@RequestMapping(value= "/contato", method = RequestMethod.GET)
	public ModelAndView pageContato() {
		
		
		return new ModelAndView("page4");
	}
	
	
	
	
	
	
}
