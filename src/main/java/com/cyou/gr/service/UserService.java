package com.cyou.gr.service;

import java.util.List;

import com.cyou.gr.entity.User;
import com.cyou.gr.entity.vo.UserVo;


public interface UserService {
    public User selectUserByName(String name) throws Exception;
    /**
     * 查询用户列表
     * @return
     * @throws Exception
     */
	public List<UserVo> selectUserList() throws Exception;
	/**
	 * 添加账户
	 * @param uv
	 * @throws Exception
	 */
	public void saveOrUpdateUser(UserVo uv) throws Exception;
}
