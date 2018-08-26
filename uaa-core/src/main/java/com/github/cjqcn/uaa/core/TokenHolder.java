package com.github.cjqcn.uaa.core;

/**
 * @description: token
 * @author: chenjinquan
 * @create: 2018-08-26 23:48
 **/
public interface TokenHolder {

    void put(Object token, UserInfo userInfo) throws UAAException;

    boolean verify(Object token) throws UAAException;

    UserInfo getUserInfo(Object token) throws UAAException;

    Object refresh(Object token) throws UAAException;

}
