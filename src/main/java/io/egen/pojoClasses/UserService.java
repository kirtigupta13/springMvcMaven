package io.egen.pojoClasses;

import java.util.List;

public interface UserService {
	public List<User> findAll();

	public User findOne(String id);

	public User create(User user);

	public User update(User user, String id);

	public void delete(String id);

}
