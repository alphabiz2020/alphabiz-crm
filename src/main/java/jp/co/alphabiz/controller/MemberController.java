package jp.co.alphabiz.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.alphabiz.dto.member.ActorInputDto;
import jp.co.alphabiz.entity.Actor;
import jp.co.alphabiz.form.ActorForm;
import jp.co.alphabiz.service.MemberService;

@Controller
@RequestMapping(value = { "member" })
public class MemberController extends AbstractController {
	final static Logger logger = LoggerFactory.getLogger(MemberController.class);

	@Autowired
	MessageSource msg;

	@Autowired
	MemberService memberService;

	@RequestMapping(method = RequestMethod.GET)
	public String index(Model model) {
		logger.debug("member + index");
		return "member/index";
	}

	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public String search(ActorForm form, Model model) {
		logger.debug("Actor + search");
		String name = form.getName();
		String birthplaceId = form.getBirthplaceId();
		ActorInputDto inputDto = new ActorInputDto();
		inputDto.setName(name); 
		inputDto.setBirthplaceId(birthplaceId); 
		List<Actor> members = memberService.getMemberList(inputDto);
		model.addAttribute("members", members);
		return "member/index";
	}

}
