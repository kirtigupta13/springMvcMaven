package io.egen.pojoClasses;

import java.util.List;

public interface UserModel {
	public List<User> findAll();

	public User findOne(String id);

	public User findByEmail(String email);

	public User create(User user);

	public User update(User user, String id);

	public void delete(String id);
}
