package com.hdfc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdfc.accountdetailspojo.AccountDetailsPojo;
import com.hdfc.repository.AccountDetailsRepository;

@Service
public class AccountDetailsService {
	@Autowired
	AccountDetailsRepository accountDetailsRepository;
	public void customerDetails(AccountDetailsPojo accountDetailsPojo) {
		accountDetailsRepository.save(accountDetailsPojo);
		
	}

}
