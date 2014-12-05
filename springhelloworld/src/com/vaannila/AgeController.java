package com.vaannila;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class AgeController extends AbstractController {

	 
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		String ag = request.getParameter("age");
		int age = 0;
		String modelName = "";
		if(ag != null && ag.length() > 0){
			try {
				age = Integer.parseInt(ag);
			} catch (Exception e) {
				modelName="fail";
				e.printStackTrace();
			}
		}
		if(age < 0 || age > 120){
			modelName="fail";
		}else{
			modelName="page3";
		}
		// logical name of view,key name of model, actual model to render in jsp
		return new ModelAndView(modelName,"testMessage", "This is from test page");
	}


}
