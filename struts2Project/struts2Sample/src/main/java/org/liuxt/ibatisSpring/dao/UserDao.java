package org.liuxt.ibatisSpring.dao;

import java.util.List;

import org.liuxt.ibatisSpring.model.LoginUser;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class UserDao extends SqlMapClientDaoSupport {

	/**
	 * ログインユーザーを追加する。
	 * 
	 * @param loginUser
	 * @throws DaoException
	 */
	public void addLoginUser(LoginUser loginUser) throws DaoException {

	}

	public void DeleteLoginUser(LoginUser loginUser) throws DaoException {

	}

	public void updateLoginUser(LoginUser loginUser) throws DaoException {

	}

	public List<LoginUser> findLoginUser(LoginUser loginUser) throws DaoException {
		return (List<LoginUser>) getSqlMapClientTemplate().queryForList("findLoginUser");
	}
}
