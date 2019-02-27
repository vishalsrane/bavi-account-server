package com.city.accountserver.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.city.accountserver.dto.AccountInfoDto;

@Service
public class AccountService {

	
	public AccountInfoDto getAccountInfo() {
		AccountInfoDto accountInfoDto = new AccountInfoDto();
		String contact = "124" + Math.random();
		accountInfoDto.setContact(contact);
		accountInfoDto.setName("Vishal" +Math.random());
		return accountInfoDto;
	}

}
