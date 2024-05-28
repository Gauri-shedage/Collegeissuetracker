package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Studentdb1;

@Repository
public interface IssueRepository extends JpaRepository<Studentdb1,Integer>{
}
