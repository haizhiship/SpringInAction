package spittr.web;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/","/homepage"})    //��������ӳ�䵽"/"��"/homepage"  ������Ϊ�༶��
public class HomeController {

	@RequestMapping(method = GET) // ����GET����
	public String home() {
		return "home";  //��ͼ����Ϊhome
	}

}
