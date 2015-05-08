package org.liuxt.ibatisSpring.service;

import java.util.List;

import org.liuxt.ibatisSpring.dao.DaoException;
import org.liuxt.ibatisSpring.model.LoginUser;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface UserService {
	/**ログインユーザーを追加する。
	 * @param loginUser
	 * @throws DaoException
	 */
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void insertLoginUser(LoginUser loginUser) throws ServiceException;

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void DeleteLoginUser(LoginUser loginUser) throws ServiceException;

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void updateLoginUser(LoginUser loginUser) throws ServiceException;
	
	public List<LoginUser> findLoginUser(LoginUser loginUser) throws ServiceException;
	
}
