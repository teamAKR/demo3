package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ServiceInterface.ServiceInterface;
import com.model.Login;
import com.model.User;

@Controller
public class Homecontroller {
	@Autowired
	ServiceInterface service;

	public ServiceInterface getService() {
		return service;
	}

	public void setService(ServiceInterface service) {
		this.service = service;
	}
	
   @RequestMapping("/")
	public String start()
	{
		return "login";
		
	}
   @RequestMapping("/registerpage")
   public String register()
   {
	return "register";
	   
   }
   
   @RequestMapping("/register")
   private String SaveUSer(@ModelAttribute User user,@ModelAttribute Login login,Model m)
   {
	   user.setLogin(login);
	User u=(User)service.SaveUser(user);
	
	return "login";
	   
   }
   @RequestMapping("/login")
   public String loginaction(@ModelAttribute User user,@ModelAttribute Login login ,Model m)
   {
	
		Login log =service.check(login);
		List<User>list=service.getAlllData();
		m.addAttribute("userlist", list);
	return "success";
	   
   }
	@RequestMapping("/delete")
	public String deleteUser(@RequestParam int id ,Model m)
	{
	service.deleteUser(id);
	List<User>list=service.getAlllData();
	m.addAttribute("msg", "Record Deleted");
	m.addAttribute("userlist", list);
		return "success";
		
	}  

}
