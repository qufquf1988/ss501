package com.bbs;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class BoardController extends MultiActionController {
	public ModelAndView list(HttpServletRequest req,HttpServletResponse resp) throws Exception{
		
		return new ModelAndView("bbs/list");
	}
	
	public ModelAndView writeForm(HttpServletRequest req,HttpServletResponse resp) throws Exception{
		
		return new ModelAndView("bbs/write");
	}
	
	public ModelAndView writeSubmit(HttpServletRequest req,HttpServletResponse resp, Board dto) throws Exception{
		
		ModelAndView mav= new ModelAndView("bbs/write_ok");
		mav.addObject("dto",dto);
		return mav;
	}
	
}
