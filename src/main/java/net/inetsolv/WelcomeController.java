package net.inetsolv;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "/welcome")
public class WelcomeController {

	@RequestMapping(method = RequestMethod.GET)
	public String display() {
		return "one.jsp";
	}
}
