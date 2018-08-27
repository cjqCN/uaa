package com.github.cjqcn.uaa.core.token;

import com.github.cjqcn.uaa.core.TokenHolder;
import com.github.cjqcn.uaa.core.UAAException;
import com.github.cjqcn.uaa.core.UserInfo;

/**
 * @description: 内置token容器
 * @author: chenjinquan
 * @create: 2018-08-27 11:56
 **/
public class InternalTokenHolder implements TokenHolder {
	@Override
	public void put(Object token, UserInfo userInfo) throws UAAException {

	}

	@Override
	public boolean verify(Object token) throws UAAException {
		return false;
	}

	@Override
	public UserInfo getUserInfo(Object token) throws UAAException {
		return null;
	}

	@Override
	public Object refresh(Object token) throws UAAException {
		return null;
	}
}
