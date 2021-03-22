package com.spring.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.domain.User;
import com.spring.rest.service.UserServiceImpl;

@RestController
public class UserRestController {

	@Autowired
	private UserServiceImpl userService;

	public void setUserService(UserServiceImpl userService) {
		this.userService = userService;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST, consumes = { "application/xml", "application/json" })
	public @ResponseBody String addUser(@RequestBody User user) {
		boolean isAdded = userService.add(user);
		if (isAdded) {
			return "User Added Successfully!";
		} else {
			return "Failed to Add the user....!";
		}
	}

	@RequestMapping(value = "/get", method = RequestMethod.GET, produces = { "application/xml", "application/json" })
	public @ResponseBody User getUserbyId(@RequestParam(name = "uid") String uid) {
		User user = userService.get(uid);
		return user;
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT, consumes = { "application/xml", "application/json" })
	public @ResponseBody String update(@RequestParam(name = "uid") String uid, @RequestBody User user) {
		boolean isUpdated = userService.update(uid, user);
		if (isUpdated) {
			return "User Updated Successfully!";
		} else {
			return "Failed to update the user....!";
		}
	}

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public @ResponseBody String delete(@RequestParam(name = "uid") String uid) {
		boolean isDeleted = userService.delete(uid);
		if (isDeleted) {
			return "User Deleted Successfully!";
		} else {
			return "Failed to delet the user....!";
		}
	}

}
