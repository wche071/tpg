package com.tpg.question.three;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MethodTimeComsumerAspectUnitTest {

	@Test
	public void test() {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-tpg.xml");

		AccountDBAcess accountDBAcess = (AccountDBAcess) appContext.getBean("accountDBAcess");

		accountDBAcess.getAccountDetail(100l);
		try {
			accountDBAcess.getBookingDetail(100l);
		} catch (Exception e) {

		}

	}

}
