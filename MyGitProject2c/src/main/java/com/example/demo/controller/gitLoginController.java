package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class gitLoginController {

		//一覧表示用
		@RequestMapping(path = "/gitlogin", method = RequestMethod.GET)
		public String viewPage(String ID, String PW) {
		
			return "gitlogin";
		}
		//ログイン検証用
		@RequestMapping(path = "/gitlogin", method = RequestMethod.POST)
		public String loginPost(String ID, String PW) {

			if(ID == "gitlogin" && PW == "gitpw") {
				
				return "redirect:/gittemlist";
			}
				else {
					System.out.println("IDもしくはパスワードが違います");
				}
			return "redirect:/home";
		}

	}



