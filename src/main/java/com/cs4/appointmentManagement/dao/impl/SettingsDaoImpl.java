package com.cs4.appointmentManagement.dao.impl;

import org.springframework.stereotype.Repository;

import com.cs4.appointmentManagement.dao.SettingsDao;
import com.cs4.appointmentManagement.domain.Settings;

@Repository
public class SettingsDaoImpl extends GenericDaoImpl<Settings> implements SettingsDao {
	public SettingsDaoImpl() {
		super.setDaoType(Settings.class);
	}
}
