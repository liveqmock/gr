package com.cyou.gr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cyou.gr.dao.UserMapper;
import com.cyou.gr.entity.User;
import com.cyou.gr.service.UserManageService;
@Transactional
@Service
public class UserManageServiceImpl implements UserManageService {
    @Autowired
    private UserMapper userMapper;
	@Override
	public void updateEmp(User e) throws Exception {
		userMapper.updateByPrimaryKey(e);
	}

}
