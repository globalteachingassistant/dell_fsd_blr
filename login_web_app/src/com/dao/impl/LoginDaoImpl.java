package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dao.LoginDAO;
import com.dbutil.MysqlDbConnection;
import com.exception.BusinessException;
import com.model.User;

public class LoginDaoImpl  implements LoginDAO {

	@Override
	public boolean isValidUser(User user) throws BusinessException {
	boolean b=false;
		try(Connection connection=MysqlDbConnection.getConnection();){
			String sql="select username from login_master where username=? and password=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, user.getUsername());
			preparedStatement.setString(2, user.getPassword());
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()) {
				b=true;
			}else {
				throw new BusinessException("Invalid Username/Password......");
			}
		} catch (ClassNotFoundException | SQLException e) {
			throw new BusinessException("Internal error occured kindly contact SYSADMIN "+e.getMessage());
		}
		return b;
	}

}
