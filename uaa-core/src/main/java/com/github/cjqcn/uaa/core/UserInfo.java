package com.github.cjqcn.uaa.core;

import java.util.Map;

/**
 * @description: 用户信息
 * @author: chenjinquan
 * @create: 2018-08-26 23:44
 **/
public interface UserInfo {
	Object identify();
	Map<String, Object> attributes();
	default Object getAttribute(String attributeName) {
		return attributes().get(attributeName);
	}
}
