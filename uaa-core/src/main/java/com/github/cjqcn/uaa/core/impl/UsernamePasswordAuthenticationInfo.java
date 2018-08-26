package com.github.cjqcn.uaa.core.impl;

import com.github.cjqcn.uaa.core.AuthenticationInfo;
import com.github.cjqcn.uaa.core.UAAException;
import com.github.cjqcn.uaa.core.UserHolder;
import com.github.cjqcn.uaa.core.UserInfo;

/**
 * @description: 用户名、密码验证信息
 * @author: chenjinquan
 * @create: 2018-08-27 00:01
 **/
public class UsernamePasswordAuthenticationInfo implements AuthenticationInfo {

    protected UsernamePassword usernamePassword;

    protected UserHolder userHolder;

    public UsernamePasswordAuthenticationInfo(UsernamePassword usernamePassword, UserHolder userHolder) {
        super();
        this.usernamePassword = usernamePassword;
        this.userHolder = userHolder;
    }


    @Override
    public boolean authenticate() throws UAAException {
        String username = usernamePassword.getUsername();
        UserInfo userInfo = userHolder.get(username);
        if (userInfo == null) {
            throw new UAAException("用户名为" + username + "的用户不存在");
        }

        return false;
    }
}
