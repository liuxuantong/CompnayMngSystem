package org.liuxt.struts2.action;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.liuxt.ibatisSpring.model.LoginUser;
import org.liuxt.ibatisSpring.service.UserService;
import org.liuxt.ibatisSpring.service.UserServiceImpl;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements
		ModelDriven<LoginUser> {

	private static final long serialVersionUID = 1L;
	private LoginUser loginUser = new LoginUser();

	public LoginAction() {
	}

	public String execute() throws Exception {
		UserService userService = new UserServiceImpl();
		List<LoginUser> userList = userService.findLoginUser(loginUser);
		if (userList == null || userList.size() == 0) {
			return INPUT;
		}
		return SUCCESS;
	}

	public void validate() {
		if (StringUtils.isEmpty(loginUser.getUserId())) {
			addFieldError("userName", "User Name is required");
		}
		if (StringUtils.isEmpty(loginUser.getPassword())) {
			addFieldError("password", "パスワードを入力してください。");
		}
	}

	public LoginUser getLoginUser() {
		return loginUser;
	}

	public void setLoginUser(LoginUser loginUser) {
		this.loginUser = loginUser;
	}

	@Override
	public LoginUser getModel() {
		return loginUser;
	}

}