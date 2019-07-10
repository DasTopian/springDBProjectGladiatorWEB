package com.lti.controller;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.dao.UserDetailsImpl;
import com.lti.entity.User;
import com.lti.entity.UserDTO;

@Controller
public class RegisterController {
	
	/*
	 * no need to read the form data manually
	 * Spring can automatically populate a
	 * bean object, i.e Spring can automatically
	 * store form data in the project
	 * of a POJO class*/
	@Autowired
	UserDetailsImpl ud;

	@RequestMapping("/register.lti")
	public String execute(UserDTO userDTO) {
		
		//code for processing the uploaded file
		String path = "d:/uploads/";
		String filename = userDTO.getName() + "-" + userDTO.getProfilePic().getOriginalFilename();
		String finalpath = path + filename;
		
		try {
			userDTO.getProfilePic().transferTo(new File(finalpath));
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
		// now the code to store the data in database
		User user = new User();
		user.setName(userDTO.getName());
		user.setEmail(userDTO.getEmail());
		user.setAge(userDTO.getAge());
		user.setProfilePicFilename(filename);
		
		ud.addNewUser(user);
		
		
		//ud.addNewUser(userDTO);
		return "register.jsp";
		
	}
	
	@RequestMapping(path="/searchUser.lti")
	public String search(@RequestParam("email") String email, Map<String, Object> model) {
		
		User user = ud.fetchUser(email);
		model.put("userData", user);
		return "searchResult.jsp";
	}

}
