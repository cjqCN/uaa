package com.github.cjqcn.uaa.core.user;

import com.github.cjqcn.uaa.core.AuthenticationInfo;
import com.github.cjqcn.uaa.core.UAAException;
import com.github.cjqcn.uaa.core.UserHolder;
import com.github.cjqcn.uaa.core.UserInfo;

import static com.github.cjqcn.uaa.core.util.AssertUtil.assertTrue;
import static com.github.cjqcn.uaa.core.util.AssertUtil.notNull;
import static com.github.cjqcn.uaa.core.util.StringUtil.isBlank;
import static com.github.cjqcn.uaa.core.util.UserInfoHelper.getPassword;

/**
 * @description: 用户名、密码验证信息
 * @author: chenjinquan
 * @create: 2018-08-27 00:01
 **/
public class UsernamePasswordAuthenticationInfo implements AuthenticationInfo {

	protected UsernamePassword usernamePassword;

	protected UserHolder userHolder;

	protected PasswordMatcher passwordMatcher;

	public UsernamePasswordAuthenticationInfo(UsernamePassword usernamePassword, UserHolder userHolder,
											  PasswordMatcher passwordMatcher) {
		super();
		this.usernamePassword = usernamePassword;
		this.userHolder = userHolder;
		this.passwordMatcher = passwordMatcher;
	}

	@Override
	public boolean authenticate() throws UAAException {
		verify();
		String username = usernamePassword.getUsername();
		UserInfo userInfo = userHolder.get(username);
		if (userInfo == null) {
			throw new UAAException("用户名为" + username + "的用户不存在");
		}
		String userInfoPassword = getPassword(userInfo);
		return passwordMatcher.matches(usernamePassword.getPassword(), userInfoPassword);
	}

	private void verify() throws UAAException {
		notNull(usernamePassword, "UsernamePassword 不能为 null");
		notNull(userHolder, "userHolder 不能为 null");
		assertTrue(isBlank(usernamePassword.getUsername()), "username 不能为空");
		if (passwordMatcher == null) {
			passwordMatcher = SimplePasswordMatcher.get();
		}
	}
}
