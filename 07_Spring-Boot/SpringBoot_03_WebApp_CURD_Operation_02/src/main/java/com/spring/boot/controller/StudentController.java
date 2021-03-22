package com.spring.boot.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.boot.model.Student;
import com.spring.boot.service.StudentService;

@Controller
public class StudentController {

	@Autowired(required = true)
	private StudentService studentservice;

	@ModelAttribute("student")
	public Student studentForm() {
		return new Student();
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/store", method = RequestMethod.POST)
	public String storeBook(Model model, @ModelAttribute("student") Student s) {
		// calling service method
		boolean isInserted = studentservice.insert(s);

		if (isInserted) {
			model.addAttribute("sMsg", "Student Datails Stored Successfully");
		} else {
			model.addAttribute("eMsg", "Failed to store Student Datails ");
		}

		return "index";
	}

	@RequestMapping(value = "/retriveStudents", method = RequestMethod.GET)
	public String viewStudents(Model model) {
		List<Student> studentsList = studentservice.findAllStudents();
		model.addAttribute("students", studentsList);
		return "viewStudents";
	}

	@RequestMapping("/delete")
	public String deleteBook(Model model, HttpServletRequest req) {
		boolean isDelete = false;
		String stuid = req.getParameter("stuid");
		if (stuid != null && !stuid.equals("")) {
			int studentid = Integer.parseInt(stuid);
			isDelete = studentservice.delete(studentid);
		}
		return "redirect:retriveStudents";
	}

	@RequestMapping("/edit")
	public String edit(Model model, HttpServletRequest req) {
		String stuid = req.getParameter("stuid");
		if (null != stuid && !"".equals(stuid)) {
			int studentid = Integer.parseInt(stuid);
			Student s = studentservice.edit(studentid);
			model.addAttribute("student", s);
		}
		return "editStudent";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(Model model, @ModelAttribute("student") Student s) {
		boolean isUpdated = studentservice.update(s);
		if (isUpdated) {
			model.addAttribute("sMsg", "Updated Successfully..");
		} else {
			model.addAttribute("eMsg", "Failed to update..");
		}
		return "editStudent";
	}
}
