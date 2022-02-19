package jp.co.alphabiz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * INDEXコントローラー
 */
@Controller
@RequestMapping(value = { "/", "index" })
public class IndexController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String initializer(Model model) {
		return "home";
	}
}
