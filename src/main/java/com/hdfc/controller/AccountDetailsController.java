package com.hdfc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.accountdetailspojo.AccountDetailsPojo;
import com.hdfc.service.AccountDetailsService;

@RestController
public class AccountDetailsController {
	@Autowired
	AccountDetailsService accountDetailsService;
	@PostMapping("/savedetails")
	public void customerDetails(@RequestBody AccountDetailsPojo accountDetailsPojo) {
		accountDetailsService.customerDetails(accountDetailsPojo);
		
		
	}
	@PostMapping("/savedetails1")
	public void customerDetails1(@RequestBody AccountDetailsPojo accountDetailsPojo) {
		accountDetailsService.customerDetails(accountDetailsPojo);
		
		
	}

}
