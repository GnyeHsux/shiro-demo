package com.example.shirodemo.service.impl;

import com.example.shirodemo.dao.UserInfoDao;
import com.example.shirodemo.entity.UserInfo;
import com.example.shirodemo.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoDao userInfoDao;

    @Override
    public UserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        return userInfoDao.findByUsername(username);
    }
}
