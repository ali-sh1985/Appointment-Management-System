package com.cs4.appointmentManagement.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.cs4.appointmentManagement.domain.Authority;
import com.cs4.appointmentManagement.domain.User;
import com.cs4.appointmentManagement.domain.UserCredentials;
import com.cs4.appointmentManagement.service.EncryptService;
import com.cs4.appointmentManagement.service.UserCredentialsService;
import com.cs4.appointmentManagement.service.UserService;

public class UserAuthenticator implements AuthenticationProvider {

	@Autowired
	private UserCredentialsService userCredentialsService;
	
	@Autowired
	private EncryptService encryptService;
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		System.out.println("authenticate()");
		System.out.println(authentication.getName());
		UserCredentials userCredentials = userCredentialsService.findByUsername(authentication.getName());
		String encryptedPassword = encryptService.encrypt(authentication.getCredentials().toString());
		System.out.println("enc="+encryptedPassword);
		System.out.println("dbPass="+userCredentials.getPassword());
		if(userCredentials == null)
			return null;
		
		if(userCredentials.getPassword().equals(encryptedPassword)) {
			List<GrantedAuthority> grantedAuths = new ArrayList<>();
			System.out.println(userCredentials.getAuthority().size());
			for(Authority authority : userCredentials.getAuthority()) {
				System.out.println("Authority="+authority.getAuthority());
				grantedAuths.add(new SimpleGrantedAuthority(authority.getAuthority()));
			}
			
			Authentication auth = new UsernamePasswordAuthenticationToken(authentication.getName(),
					authentication.getCredentials(), grantedAuths);
			return auth;
		}
		return null;
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}
}
