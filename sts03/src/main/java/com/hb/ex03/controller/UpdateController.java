package com.hb.ex03.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hb.ex03.model.entity.GuestVo;
import com.hb.ex03.service.GuestService;

@Controller
public class UpdateController {
	@Autowired
	GuestService guestService;
	
	@RequestMapping(value="/guest/{1}", method=RequestMethod.GET)
	public String detail(@PathVariable(value="1") int sabun, Model model) throws Exception {
		
		model.addAttribute("bean",guestService.detail(sabun));
		
		return "guest/detail";
	}
	
	@RequestMapping(value="/guest/{1}", method=RequestMethod.PUT)
	public String update(@PathVariable("1") int sabun, GuestVo bean) throws Exception {
		
		bean.setSabun(sabun);
		guestService.edit(bean);
		
		return "redirect:/guest/"+sabun;
	}
	
	@RequestMapping(value="/guest/{1}", method=RequestMethod.DELETE)
	public String delete(@PathVariable("1") int sabun) throws Exception {
		
		guestService.delete(sabun);
		
		return "redirect:/guest";
	}

}
