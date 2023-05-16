package com.memberRegistry.controller;



import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.memberRegistry.Dao.MemberDao;
import com.memberRegistry.model.Member;

@Controller
public class MainController {

	@Autowired
	private MemberDao memberDao;
	
	@RequestMapping("/")
	public ModelAndView listMember(ModelAndView model) {
		List<Member> ls = memberDao.list();
		
		model.addObject("listMember", ls);
		model.setViewName("list");
		return model;
	}
	@RequestMapping(value="/edit",method = RequestMethod.GET)
	public ModelAndView editMember(@RequestParam String id) {
		Member member = memberDao.get(id);
		
		ModelAndView model = new ModelAndView("edit_member");
	    model.addObject("member", member);
	     return model;
	}
	
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute Member member) {
		if(memberDao.get(member.getMemberId())==null){
			memberDao.save(member);
		}else {
			memberDao.update(member);
		}
		
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping("/delete")
	public ModelAndView delete(@RequestParam String id) {
		
		memberDao.delete(id);
		return new ModelAndView("redirect:/");
	}
	@RequestMapping("/new")
	public ModelAndView home(ModelAndView model) {
		
		Member member= new Member();
		model.addObject("member", member);
		model.setViewName("home");
		return model;
	}
	
	
	
}
