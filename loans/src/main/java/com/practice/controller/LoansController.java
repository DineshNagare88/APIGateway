package com.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.models.Loans;
import com.practice.service.LoanService;



@RestController
@RequestMapping("/api/v1/loans")
public class LoansController 
{
	@Autowired
	private LoanService loanService;
  
	@GetMapping("/{id}")
	public List<Loans> getLoansDetails(@PathVariable("id") int customerId)
	{
		return loanService.getAllLoansDetails(customerId);			
	}
}
