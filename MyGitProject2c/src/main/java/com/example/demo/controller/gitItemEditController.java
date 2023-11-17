package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class gitItemEditController {
	
	
	//更新（更新）用メソッド
		@RequestMapping(path = "/gititemedit", method = RequestMethod.GET)
		public String getUpd() {

			
			return "ititemedit.html";
		}
		@RequestMapping(path = "/gititemedit", method = RequestMethod.POST)
		public String postUpd(Model model) {

			model.addAttribute("/gitpralogin", "");
			return "gititemedit.html";
		}
	}


