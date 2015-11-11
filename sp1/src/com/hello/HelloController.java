package com.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
/*
 * -Controller(AbstractController)
 * 클라이언트 요청을 받아 처리하는 클래스.
 * 
 *  -ModelAndView
 *  컨트롤러의 처리 결과를 보여줄 뷰와 뷰에 전달할 값을 저장
 *
 */
 
public class HelloController extends AbstractController {
	private HelloService helloService;
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("hello/hello");
		mav.addObject("msg",helloService.getMessage());
		//req.setAttribute("msg", helloService.getMessage()); mav.addObject나 req.setAttribute 같다.
		return mav;
	}

	public void setHelloService(HelloService helloService) {
		this.helloService = helloService;
	}
		
}
