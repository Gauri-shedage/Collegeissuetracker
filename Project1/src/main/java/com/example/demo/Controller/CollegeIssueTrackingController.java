package com.example.demo.Controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Studentdb1;
import com.example.demo.Service.CollegeIssueTrackingService;
import com.example.demo.ServiceImp.CollegeIssueTrackingServiceImplementation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class CollegeIssueTrackingController {
	
	@Autowired
	
	CollegeIssueTrackingServiceImplementation c1;

	
	@RequestMapping("/")
         public String getAllIssues(Model model) {
	
		 System.out.println("Hello World");
		 
		 List<Studentdb1> list=c1.show();		
		 model.addAttribute("newList",list);
		
		 return "collegeissue";
		}
	@RequestMapping("/create")
	public String createIssue() {
		System.out.println("inside create");
		return "add";
	}
	
	@GetMapping("/edit/{id}")
	public String editIssue(@PathVariable int id,Model model) {
		System.out.println("inside edit"+ id);
		
		Studentdb1 studentdb1=c1.getIssueid(id);
		model.addAttribute("studentdb1",studentdb1);
		
		
		return "edit";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute ("studentdb1")Studentdb1 studentdb1) {
		//TODO: process POST request
		c1.save(studentdb1);
		
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteIssue(@PathVariable int id) {
		c1.deleteIssue(id);
		System.out.println("Data deleted"+id);
		return "redirect:/";
	}
	
	
}
