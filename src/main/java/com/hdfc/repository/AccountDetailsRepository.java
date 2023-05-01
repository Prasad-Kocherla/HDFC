package com.hdfc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdfc.accountdetailspojo.AccountDetailsPojo;

@Repository
public interface AccountDetailsRepository extends JpaRepository<AccountDetailsPojo, Long> {

}
