package com.github.cjqcn.uaa.core.util;

/**
 * @description: 字符串工具
 * @author: chenjinquan
 * @create: 2018-08-27 10:19
 **/
public class StringUtil {

	public static boolean isBlank(String str) {
		return str == null || str.trim().length() == 0;
	}

	public static String getStrNotIgnoreNull(Object o) {
		if (o != null) {
			return o.toString();
		}
		return null;
	}

}
