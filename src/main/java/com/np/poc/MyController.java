package com.np.poc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/", method = RequestMethod.GET)
public class MyController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		return "welcome-page";
	}

}
