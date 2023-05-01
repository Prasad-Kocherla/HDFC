package com.hdfc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.accountdetailspojo.HDFCCreditorDebitModel;
import com.hdfc.service.HDFCAtmService;

@RestController
public class HDFCAtmController {

	@Autowired
	private HDFCAtmService hdfcatmService;
	
	@PostMapping("HDFCcreditamount")
	public void creditAmount(@RequestBody HDFCCreditorDebitModel creditorDebitModel) {
		
		hdfcatmService.creditAmount(creditorDebitModel);
	}
	@PostMapping("HDFCdebitamount")
	public void debitAmount(@RequestBody HDFCCreditorDebitModel creditorDebitModel) {
		
		hdfcatmService.debitAmount(creditorDebitModel);
	}

	
}
