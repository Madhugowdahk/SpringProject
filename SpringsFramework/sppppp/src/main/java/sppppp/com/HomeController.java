package sppppp.com;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

@Controller
public class HomeController {
 @RequestMapping("/home")
	public String home(Model model)
	{
	 //in this program how we can send the data from controller to view(jsp)
	 //in the form of key and value
	 model.addAttribute("name", "viratkohli");
		System.out.println("hello guys");
		return "index";
	}
 @RequestMapping("/about")
 public ModelAndView about()
 {
	 ModelAndView modelandview=new ModelAndView();
	 modelandview.addObject("id",123);
	 modelandview.addObject("name","madhugowda");
	 LocalDateTime now= LocalDateTime.now();
	 modelandview.addObject("time", now);
	 System.out.println("this is all about controller and model view");
	//it is necessary to view
	 modelandview.setViewName("index2");
	 return modelandview;
 }
}
