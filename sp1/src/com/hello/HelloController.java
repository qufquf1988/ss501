package com.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
/*
 * -Controller(AbstractController)
 * Ŭ���̾�Ʈ ��û�� �޾� ó���ϴ� Ŭ����.
 * 
 *  -ModelAndView
 *  ��Ʈ�ѷ��� ó�� ����� ������ ��� �信 ������ ���� ����
 *
 */
 
public class HelloController extends AbstractController {
	private HelloService helloService;
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("hello/hello");
		mav.addObject("msg",helloService.getMessage());
		//req.setAttribute("msg", helloService.getMessage()); mav.addObject�� req.setAttribute ����.
		return mav;
	}

	public void setHelloService(HelloService helloService) {
		this.helloService = helloService;
	}
		
}
