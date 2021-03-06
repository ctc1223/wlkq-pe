package com.wlkq.pe.service.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.generator.codegen.ibatis2.model.ExampleGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageInfo;
import com.wlkq.pe.bean.PecUser;
import com.wlkq.pe.bean.PecUserExample;
import com.wlkq.pe.mapper.PecUserMapper;
import com.wlkq.pe.service.PecUserService;
import com.wlkq.pe.util.Const;
import com.wlkq.pe.util.LoginException;
import com.wlkq.pe.util.MD5Util;


@Service
public class PecUserServiceImpl implements PecUserService {
	@Autowired
	private PecUserMapper userMapper;
	Logger log =LoggerFactory.getLogger(PecUserServiceImpl.class);

	@Override
	public PecUser checkUserByLogin(Map<String, Object> userMap) {
		String loginacct =(String) userMap.get("loginacct");
		String userpswd =(String) userMap.get("userpswd");
		
		/*log.debug("账号========{}",loginacct);
		log.debug("密码========{}",userpswd);*/
		PecUserExample example = new PecUserExample();
		example.createCriteria().andLoginacctEqualTo(loginacct);
		List<PecUser> userList = userMapper.selectByExample(example);
		if(userList.size() ==0 || userList == null) {
			throw new LoginException(Const.LOGIN_LOGINACCT_ERROR);
		}else {
			PecUser pecUser = userList.get(0);
			String userpswd2 = pecUser.getUserpswd();
			log.debug("密码========{}",userpswd2);
			if(StringUtils.isEmpty(loginacct) || pecUser.getUserpswd().equals(MD5Util.digest(userpswd))==false) {
				throw new LoginException(Const.LOGIN_USERPSWD_ERROR);
			}
			return pecUser;
		}
	}

	@Override
	public boolean checkUser(String loginacct) {
		PecUserExample example = new PecUserExample();
		example.createCriteria().andLoginacctEqualTo(loginacct);
		List<PecUser> userList = userMapper.selectByExample(example);
		if(userList.size() ==0 || userList == null) {
			throw new LoginException(Const.LOGIN_LOGINACCT_ERROR);
	}
		return true;

}

	@Override
	public int saveUser(PecUser user) {
		try {
			user.setUserpswd(MD5Util.digest(user.getUserpswd()));
			return userMapper.insertSelective(user);
		} catch (Exception e) {
			return 0;
		}
		
	}

	@Override
	public List<PecUser> getUserList() {
		PecUserExample example = new PecUserExample(); 
		List<PecUser> userList = userMapper.selectByExample(example);
		return userList;
	}

	

	@Override
	public PecUser getUserByloginacct(String loginacct) {
		PecUserExample example = new PecUserExample();
		example.createCriteria().andLoginacctEqualTo(loginacct);
		List<PecUser> userList = userMapper.selectByExample(example);
		if(userList.size() ==0 || userList == null) {
			return null;
		
	}else {
		return userList.get(0);
	}
		


	}

	@Override
	public boolean deleteUserByloginacct(long id) {
		int i = userMapper.deleteByPrimaryKey(id);
		if(i>0) {
			
			return true;
		}else {
			return false;
		}
	}

	@Override
	public int updateUser(PecUser user) {
		PecUserExample example = new PecUserExample();
		return userMapper.updateByExample(user, example);
		
	}

	@Override
	public PageInfo<PecUser> userListPage(Map<String, Object> paramMap) {
		String condition =(String)paramMap.get("condition");
		List<PecUser> list =null;
		if(StringUtils.isEmpty(condition)) {
			list= userMapper.selectByExample(null);
		}else {
			PecUserExample example = new PecUserExample();
			example.createCriteria().andLoginacctLike("%"+condition+"%");
			list = userMapper.selectByExample(example);
		}
		PageInfo<PecUser> pageMap =new  PageInfo<PecUser>(list ,5);
		return pageMap;
		
	}
}
