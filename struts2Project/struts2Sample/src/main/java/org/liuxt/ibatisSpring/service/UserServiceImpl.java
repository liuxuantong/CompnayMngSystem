package org.liuxt.ibatisSpring.service;

import java.util.List;

import org.liuxt.ibatisSpring.dao.UserDao;
import org.liuxt.ibatisSpring.model.LoginUser;


public class UserServiceImpl implements UserService {

	UserDao userDao;
	
	public void setUserDao(UserDao loginUserDao) {
		this.userDao = loginUserDao;
	}

	public void insertLoginUser(LoginUser loginUser) throws ServiceException {
		
		try {
			userDao.addLoginUser(loginUser);
			//logic 処理
			Integer.parseInt("a1");			
		}catch(Exception e ) {
			throw new ServiceException(e);
		}
	}

	public void DeleteLoginUser(LoginUser loginUser) throws ServiceException {

	}

	public void updateLoginUser(LoginUser loginUser) throws ServiceException {
	}

	public List<LoginUser> findLoginUser(LoginUser loginUser)
			throws ServiceException {
		return this.userDao.findLoginUser(loginUser);
	}

}
