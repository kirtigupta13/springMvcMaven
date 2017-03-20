package io.egen.pojoClasses;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository //Instead of component
public class UserModelImpl implements UserModel{

	
	public List<User> findAll() {
		List<User> list = new ArrayList<User>();
		User user1 = new User();
		user1.setEmail("k@gmail.com");
		User user2 = new User();
		user2.setEmail("n@gmail.com");
		User user3 = new User();
		user3.setEmail("s@gmail.com");
		list.add(user1);
		list.add(user2);
		list.add(user3);
		return list;
	}

	public User findOne(String id) {
		
		return null;
	}

	public User findByEmail(String email) {
		
		return null;
	}

	public User create(User user) {
		
		return null;
	}

	public User update(User user, String id) {
		
		return null;
	}

	public void delete(String id) {
		
		
	}

	}
