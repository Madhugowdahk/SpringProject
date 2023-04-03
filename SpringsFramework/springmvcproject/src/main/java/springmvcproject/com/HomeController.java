package springmvcproject.com;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {


	@RequestMapping("/home")
	public String home()
	{
		System.out.println("hello guys");
		return "index";
	}
}
