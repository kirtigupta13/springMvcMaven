package io.egen.pojoClasses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserModel model;

	public List<User> findAll() {

		return model.findAll();
	}

	public User findOne(String id) {
		User existingUser = model.findOne(id);
		if (existingUser == null) {

		}
		return existingUser;
	}

	public User create(User user) {
		User existingUser = model.findByEmail(user.getEmail());
		if (existingUser != null) {

		}
		return existingUser;
	}

	public User update(User user, String id) {
		User existingUser = model.findOne(id);
		if (existingUser == null) {

		}
		return model.update(user, id);
	}

	public void delete(String id) {
		User existingUser = model.findOne(id);
		if (existingUser == null) {

		}
		model.delete(id);
	}

}
