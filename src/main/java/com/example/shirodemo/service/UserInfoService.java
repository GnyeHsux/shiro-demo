package com.example.shirodemo.service;

import com.example.shirodemo.entity.UserInfo;

public interface UserInfoService {
    /**
     * 通过username查找用户信息;
     */
    UserInfo findByUsername(String username);
}
