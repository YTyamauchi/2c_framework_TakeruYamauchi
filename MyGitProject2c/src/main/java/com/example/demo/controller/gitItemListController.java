package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class gitItemListController {
	//一覧表示用
	@RequestMapping(path = "/gititemlist", method = RequestMethod.GET)
	public String viewPage() {

		return "gititemlist";
	}
}
