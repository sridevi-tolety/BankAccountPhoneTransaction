package com.bank.account.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.account.models.BankAccount;
import com.bank.account.repository.BankAccountRepository;

@RestController
@RequestMapping("/banking")
public class BankAccountController {
	
	@Autowired
	private BankAccountRepository brep;
	
	@GetMapping("/checkExistance/{phonenumber}")
	public Double getAcctNumber(@PathVariable Long phonenumber) {
		
		List<BankAccount> acctsList = brep.findByPhonenumber(phonenumber);
		System.out.println("Size :::"+acctsList.size());
		BankAccount ba = acctsList.get(0);
		return ba.getBalanceamount();
	}

}
