package com.github.cjqcn.uaa.core.util;

import com.github.cjqcn.uaa.core.UAAException;

/**
 * @description: 断言工具
 * @author: chenjinquan
 * @create: 2018-08-27 11:03
 **/
public class AssertUtil {


	public static void notNull(Object o, String errormsg) throws UAAException {
		assertFalse(o != null, errormsg);
	}


	public static void assertTrue(boolean tag, String errormsg) throws UAAException {
		if (tag) {
			assertTrue(tag, new UAAException(errormsg));
		}
	}

	public static void assertFalse(boolean tag, String errormsg) throws UAAException {
		if (!tag) {
			assertFalse(tag, new UAAException(errormsg));
		}
	}


	public static void assertTrue(boolean tag, UAAException ex) throws UAAException {
		if (tag) {
			throw ex;
		}
	}


	public static void assertFalse(boolean tag, UAAException ex) throws UAAException {
		if (!tag) {
			throw ex;
		}
	}
}
