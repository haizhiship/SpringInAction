package spittr.web;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/","/homepage"})    //将控制器映射到"/"和"/homepage"  控制器为类级别
public class HomeController {

	@RequestMapping(method = GET) // 处理GET请求
	public String home() {
		return "home";  //视图名称为home
	}

}
