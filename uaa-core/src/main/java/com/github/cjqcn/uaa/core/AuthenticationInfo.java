package com.github.cjqcn.uaa.core;

/**
 * @author chenjinquan
 * @date 2018年8月26日23:41:50
 */
public interface AuthenticationInfo {
    /**
     * 认证结果
     *
     * @return
     * @throws UAAException
     */
    boolean authenticate() throws UAAException;
}
