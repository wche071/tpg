package com.tpg.question.three;

import org.springframework.stereotype.Component;


public class AccountDBAcess {
	
	
	public void getAccountDetail(Long accountId)
	{
		try {
			Thread.sleep(5000);

		} catch (Exception e) {

		}

	}
	
	public void getBookingDetail(Long accountId)
	{
		try {
			Thread.sleep(5000);

		} catch (Exception e) {

		}
		throw new RuntimeException();

	}

}
