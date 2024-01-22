package DiamonShop.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import DiamonShop.Dao.SlidesDao;
import DiamonShop.Service.User.HomeServiceIpl;

@Controller
//public class HomeController {
//	@RequestMapping(value = {"/", "/trang-chu"}, method = RequestMethod.GET)
//	public String Index() {
//		return "user/index";
//	}
//}

public class HomeController {
	@Autowired
	HomeServiceIpl HomeService;
	@RequestMapping(value = {"/", "/trang-chu"}, method = RequestMethod.GET)
	public ModelAndView Index() {
		ModelAndView mv = new ModelAndView("user/index");
		mv.addObject("slides",HomeService.GetDataSlide());
		return mv;
	}
	@RequestMapping(value = "/product")
	public ModelAndView Product() {
		ModelAndView mv = new ModelAndView("user/product");
		return mv;
	}
}
