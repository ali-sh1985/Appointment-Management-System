package com.cs4.appointmentManagement.dao.impl;

import org.springframework.stereotype.Repository;

import com.cs4.appointmentManagement.dao.AddressDao;
import com.cs4.appointmentManagement.domain.Address;

@Repository
public class AddressDaoImpl extends GenericDaoImpl<Address> implements AddressDao {
	public AddressDaoImpl() {
		super.setDaoType(Address.class);
	}
}
