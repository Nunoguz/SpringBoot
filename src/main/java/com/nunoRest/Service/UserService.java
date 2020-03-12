package com.nunoRest.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nunoRest.Model.User;
import com.nunoRest.Repository.IUserRepository;

@Service
public class UserService implements IUserService {

	private IUserRepository userRepository;
	
	@Autowired
	public UserService(IUserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	@Transactional
	public List<User> getAll() {
		return this.userRepository.getAll();
	}

	@Override
	@Transactional 
	public void add(User user) {
		// Ekleme yapmadan önceki kontroller - kurallar yazılır
		this.userRepository.add(user);	
	}

	@Override
	@Transactional
	public void update(User user) {
		this.userRepository.update(user);
	}

	@Override
	@Transactional
	public void delete(User user) {
		this.userRepository.delete(user);
	}

	@Override
	public User getById(Long id) {
		return this.userRepository.getById(id);
	}
	
}
