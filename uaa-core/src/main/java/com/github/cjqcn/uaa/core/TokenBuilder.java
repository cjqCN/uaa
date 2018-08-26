package com.github.cjqcn.uaa.core;

/**
 * @description: Token生成器
 * @author: chenjinquan
 * @create: 2018-08-26 23:47
 **/
public interface TokenBuilder {
    Object token(UserInfo userInfo) throws UAAException;
}
