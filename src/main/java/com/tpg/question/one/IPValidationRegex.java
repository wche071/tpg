package com.tpg.question.one;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPValidationRegex {

	private static final String IPADDRESS_PATTERN = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
			+ "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
			+ "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
	private static Pattern pattern = Pattern.compile(IPADDRESS_PATTERN);

	/**
	 * 
	 * @param ipAddress
	 * @return true if ipAddress is valid ip address. otherwise return false
	 */
	public static boolean validate(final String ipAddress) {
		if (ipAddress == null) {
			return false;
		}
		Matcher matcher = pattern.matcher(ipAddress);

		return matcher.matches();

	}
}
