package io.github.bassy.wmoon.app.service;

import io.github.bassy.wmoon.app.model.User;
import io.github.bassy.wmoon.app.repository.DemoRepository;
import io.github.bassy.wmoon.app.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService {

	private final UserRepository userRepository;
	private final DemoRepository demoRepository;

	public DemoService(UserRepository userRepository, DemoRepository demoRepository) {
		this.userRepository = userRepository;
		this.demoRepository = demoRepository;
	}

	public void saveUser(User user) {
		userRepository.insertUser(user);
	}

	public List<User> selectUsers() {
		return userRepository.selectUsers();
	}

	public User selectUser(int id) {
		return userRepository.selectOne(id);
	}
}
