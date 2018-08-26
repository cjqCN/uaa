package com.github.cjqcn.uaa.core;

/**
 * @description: 用户容器
 * @author: chenjinquan
 * @create: 2018-08-27 00:03
 **/
public interface UserHolder {
    UserInfo get(Object identify) throws UAAException;
}
