package com.cs4.appointmentManagement.service.impl;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Component;

import com.cs4.appointmentManagement.service.EncryptService;

@Component
public class EncryptServiceImpl implements EncryptService {

	@Override
	public String encrypt(String password) {
		return Base64.encodeBase64String(DigestUtils.sha256(password));
	}
}
