package com.nunoRest.Repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.nunoRest.Model.User;

@Repository
public interface IUserRepository {
	List <User> getAll();
	void add(User user);
	void update(User user);
	void delete(User user);
	User getById(Long id);
}
