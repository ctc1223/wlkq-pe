package com.wlkq.pe.service;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;
import com.wlkq.pe.bean.PecUser;

public interface PecUserService {

	PecUser checkUserByLogin(Map<String, Object> userMap);

	boolean checkUser(String loginacct);

	int saveUser(PecUser user);

	List<PecUser> getUserList();

	

	PecUser getUserByloginacct(String loginacct);

	boolean deleteUserByloginacct(long id);

	int updateUser(PecUser user);

	PageInfo<PecUser> userListPage(Map<String, Object> paramMap);

	

}
