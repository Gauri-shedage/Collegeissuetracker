package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Studentdb1;


public interface CollegeIssueTrackingService {
	
	public List<Studentdb1> show();
	void save(Studentdb1 studentdb1);

}
