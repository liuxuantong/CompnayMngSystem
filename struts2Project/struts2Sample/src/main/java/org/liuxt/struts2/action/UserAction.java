package org.liuxt.struts2.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.ServletActionContext;
import org.liuxt.ibatisSpring.model.LoginUser;
import org.liuxt.ibatisSpring.service.UserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<LoginUser> {

	private static final long serialVersionUID = -6659925652584240539L;

	private LoginUser loginUser = new LoginUser();
	private List<LoginUser> userList = new ArrayList<LoginUser>();
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public LoginUser getModel() {
		return loginUser;
	}
	
	/**
	 * To save or update user.
	 * @return String
	 */
	public String saveOrUpdate() throws Exception
	{	
		if(StringUtils.isEmpty(loginUser.getUserId())){
			userService.insertLoginUser(loginUser);
		}else {
			userService.updateLoginUser(loginUser);
		}
		return SUCCESS;
	}
	
	/**
	 * To list all users.
	 * @return String
	 */
	public String list() throws Exception
	{
		LoginUser queryUser = new LoginUser();
		userList = userService.findLoginUser(queryUser);
		return SUCCESS;
	}
	
	/**
	 * To delete a user.
	 * @return String
	 */
	public String delete() throws Exception
	{
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get( ServletActionContext.HTTP_REQUEST);
		LoginUser queryUser = new LoginUser();
		String userId = request.getParameter("userId");
		queryUser.setUserId(userId);
		userService.DeleteLoginUser(queryUser);
		return SUCCESS;
	}
	
	/**
	 * To list a single user by Id.
	 * @return String
	 */
	public String edit() throws Exception
	{
		userService.updateLoginUser(loginUser);
		return SUCCESS;
	}

	public LoginUser getLoginUser() {
		return loginUser;
	}

	public void setLoginUser(LoginUser loginUser) {
		this.loginUser = loginUser;
	}

	public List<LoginUser> getUserList() {
		return userList;
	}



}