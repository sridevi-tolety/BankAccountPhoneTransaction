package com.bank.account.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bank.account.models.BankAccount;

public interface BankAccountRepository extends JpaRepository<BankAccount , Long>{	
	
	@Query(value = "select * from bank_account where phonenumber= ?1" , nativeQuery=true)
	List<BankAccount> findByPhonenumber(Long phonenumber);
}
