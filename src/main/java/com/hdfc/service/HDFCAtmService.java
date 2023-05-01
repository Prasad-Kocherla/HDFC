package com.hdfc.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hdfc.accountdetailspojo.HDFCCreditorDebitModel;
@Service
public class HDFCAtmService {

	public void creditAmount(HDFCCreditorDebitModel creditorDebitModel) {
		RestTemplate restTemplate=new RestTemplate();
		restTemplate.postForObject("http://localhost:8081/creditamount", creditorDebitModel, HDFCCreditorDebitModel.class);
		
	}

	public void debitAmount(HDFCCreditorDebitModel creditorDebitModel) {
		
		RestTemplate restTemplate=new RestTemplate();
		restTemplate.postForObject("http://localhost:8081/debitamount", creditorDebitModel, HDFCCreditorDebitModel.class);
		
	}

}
