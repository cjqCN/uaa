package com.github.cjqcn.uaa.core.util;

import com.github.cjqcn.uaa.core.UserInfo;

import static com.github.cjqcn.uaa.core.util.StringUtil.getStrNotIgnoreNull;

/**
 * @description: 用户信息工具
 * @author: chenjinquan
 * @create: 2018-08-27 11:32
 **/
public class UserInfoHelper {

	public static final String PASSWORD = "password";

	public static String getPassword(UserInfo userInfo) {
		Object pwdObj = userInfo.getAttribute(PASSWORD);
		return getStrNotIgnoreNull(pwdObj);
	}

	public static void setPassword(UserInfo userInfo, String password) {
		userInfo.attributes().put(PASSWORD, password);
	}

}
