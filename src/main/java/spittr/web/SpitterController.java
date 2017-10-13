package spittr.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spittr.Spitter;
import spittr.data.SpitterRepository;

@Controller
@RequestMapping("/spitter")
public class SpitterController {

	private SpitterRepository spitterRepository;

	@Autowired
	public SpitterController(SpitterRepository spitterRepository) {
		this.spitterRepository = spitterRepository;
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	// 处理对"spitter/register的GET请求"
	/*
	 * 没有任何输入并且只是返回名为registerForm的逻辑视图。按照我们配
	 * 置InternalResourceViewResolver的方式，这意味着将会使用“/WEB-INF/
	 * views/registerForm.jsp”这个JSP来渲染注册表单。 在WebConfig类中转换为物理视图
	 */
	public String showRegistrationForm() {
		return "registerForm";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String processRegistration(@Valid Spitter spitter, Errors errors) {
		if (errors.hasErrors()) {
			return "registerForm";
		}

		spitterRepository.save(spitter);
		return "redirect:/spitter/" + spitter.getUsername();
	}
	@RequestMapping(value = "/{username}",method=RequestMethod.GET)
	public String showSpitterProfile(
			@PathVariable String username, Model model){
		Spitter spitter = spitterRepository.findByUsername(username);
		model.addAttribute(spitter);
		return "profile";
	}
}
