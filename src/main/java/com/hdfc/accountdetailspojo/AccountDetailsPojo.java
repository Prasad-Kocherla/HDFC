package com.hdfc.accountdetailspojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity

@Table(name="account_details")
public class AccountDetailsPojo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long cid;
	@Column(name="cname")
	private String cname;
	@Column(name="caccountnumber")
	private String caccountnumber;
	@Column(name="cmobilenumber")
	private String cmobilenumber;
	@Column(name="caddress")
	private String caddress;

	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCaccountnumber() {
		return caccountnumber;
	}

	public void setCaccountnumber(String caccountnumber) {
		this.caccountnumber = caccountnumber;
	}

	public String getCmobilenumber() {
		return cmobilenumber;
	}

	public void setCmobilenumber(String cmobilenumber) {
		this.cmobilenumber = cmobilenumber;
	}

	public String getCaddress() {
		return caddress;
	}

	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	
}
