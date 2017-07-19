package com.din.ecom.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.din.ecom.dao.UserRepository;
import com.din.ecom.domain.User;
import com.din.ecom.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User addUser(User user) {
		User saveduser = null;
		try {
			if (user != null) {
				user.setUserCreationDate(new Date());
				saveduser = userRepository.save(user);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return saveduser;
	}

	@Override
	public User getUserById(int id) {
		Integer userId = Integer.valueOf(id);
		User user = userRepository.findOne(userId);
		return user;
	}

	@Override
	public List<User> getUserAllUser() {
		List<User> allListedUser=userRepository.findAll();
		return allListedUser;
	}

}
