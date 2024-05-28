package com.example.demo.ServiceImp;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Studentdb1;
import com.example.demo.Repository.IssueRepository;
import com.example.demo.Service.CollegeIssueTrackingService;

@Service
public class CollegeIssueTrackingServiceImplementation implements CollegeIssueTrackingService{
	
	@Autowired
	private IssueRepository issueRepository;
	
	@Override
	public List<Studentdb1> show(){
		
		System.out.println("Inside interface");
		
	

	    
	    
		List<Studentdb1> list=issueRepository.findAll();
		return list;
		
		
          }
	@Override
	public void save(Studentdb1 studentdb1) {
		System.out.println("inside service implementation"+studentdb1.Issuename + studentdb1.IssueDescription + studentdb1.Department + studentdb1.Issuestatus);
		issueRepository.save(studentdb1);
	}

	public Studentdb1 getIssueid(int id) {
	 Optional <Studentdb1> optional=issueRepository.findById(id);
	 Studentdb1 studentdb1=optional.get();
	 return studentdb1;
	}
	public void deleteIssue(int id) {
		issueRepository.deleteById(id);
				
	}

}
