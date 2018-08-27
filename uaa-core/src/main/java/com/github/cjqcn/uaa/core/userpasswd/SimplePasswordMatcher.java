package com.github.cjqcn.uaa.core.userpasswd;


import com.github.cjqcn.uaa.core.UAAException;

import static com.github.cjqcn.uaa.core.util.StringUtil.isBlank;

/**
 * @description: 简单编码器
 * @author: chenjinquan
 * @create: 2018-08-27 10:14
 **/
public class SimplePasswordMatcher implements PasswordMatcher {
	@Override
	public boolean matches(String rawPassword, String encodedPassword) throws UAAException {
		if (isBlank(rawPassword)) {
			throw new UAAException("密码为空字符串");
		}
		return rawPassword.equals(encodedPassword);
	}

	public static SimplePasswordMatcher get() {
		return InternalHolder.simplePasswordMatcher;
	}

	private SimplePasswordMatcher() {
	}

	private static class InternalHolder {
		static final SimplePasswordMatcher simplePasswordMatcher = new SimplePasswordMatcher();
	}

}
