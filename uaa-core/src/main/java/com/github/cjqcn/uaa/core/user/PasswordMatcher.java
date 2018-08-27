package com.github.cjqcn.uaa.core.user;

import com.github.cjqcn.uaa.core.UAAException;

/**
 * @description: 密码匹配器
 * @author: chenjinquan
 * @create: 2018-08-27 10:11
 **/
public interface PasswordMatcher {

	boolean matches(String rawPassword, String encodedPassword) throws UAAException;
}
