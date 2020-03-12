package com.nunoRest.Service;

import java.util.List;

import com.nunoRest.Model.User;

public interface IUserService {
	List <User> getAll();
	void add(User user);
	void update(User user);
	void delete(User user);
	User getById(Long id);
}
