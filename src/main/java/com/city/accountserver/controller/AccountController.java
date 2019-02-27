package com.city.accountserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.city.accountserver.dto.AccountInfoDto;
import com.city.accountserver.service.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	@GetMapping("/account/accountInfo/")
	public AccountInfoDto getAccountInfo() {
		AccountInfoDto accountInfoDto = accountService.getAccountInfo();
		return accountInfoDto;
	}

}
