package com.bo.impl;

import com.bo.LoginBO;
import com.dao.impl.LoginDaoImpl;
import com.exception.BusinessException;
import com.model.User;

public class LoginBoImpl implements LoginBO {

	@Override
	public boolean isValidUser(User user) throws BusinessException {
		boolean b = false;
		if (user != null && user.getUsername().matches("[a-z0-9]{4,10}")
				&& user.getPassword().matches("[a-z]{3,10}@[0-9]{3}")) {
			b = new LoginDaoImpl().isValidUser(user);
		} else {
			throw new BusinessException("Invalid Username/Password....");
		}
		return b;
	}

}
