package com.hdfc.accountdetailspojo;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class HDFCCreditorDebitModel {
private Long cbid;

private Long accountno;
private  Long atmpin;
private  float credit;
private  float debit;
}
