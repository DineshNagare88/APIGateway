package com.practice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.model.Account;
import com.practice.repository.AccountRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AccountService 
{
	@Autowired
    private AccountRepository accountRepository;
	
	public Account fetchAccountDetails(int customerId) 
	{
		log.info("Account Service -> Database Operation Started");
		Optional<Account> accounts = accountRepository.findByCustomerId(customerId);
		if(accounts.isPresent())
		{
		  return accounts.get();
		}
		return null;
	}

}