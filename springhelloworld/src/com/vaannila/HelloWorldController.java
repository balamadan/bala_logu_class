package com.vaannila;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloWorldController extends AbstractController {

	private String message;
	 
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
	//	HttpSession sess = request.getSession();
		//sess.setAttribute("welcomeMessage", message);
		// logical name of view,key name of model, actual model to render in jsp
		return new ModelAndView("welcomePage","welcomeMessage", message);
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
