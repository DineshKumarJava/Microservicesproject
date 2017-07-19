package com.din.ecom.service;

import java.util.List;

import com.din.ecom.domain.User;

public interface UserService {
	public User addUser(User user);
	public User getUserById(int id);
	public List<User> getUserAllUser();

}
