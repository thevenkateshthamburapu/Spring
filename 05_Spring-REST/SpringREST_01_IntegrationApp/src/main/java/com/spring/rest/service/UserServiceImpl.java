package com.spring.rest.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.spring.rest.domain.User;

@Service(value = "service")
public class UserServiceImpl implements UserService {

	public static Map<Integer, User> userData = new HashMap<Integer, User>();

	@Override
	public boolean add(User user) {
		if (userData.containsKey(user.getUserId())) {
			return false;
		} else {
			userData.put(user.getUserId(), user);
			return true;
		}

	}

	@Override
	public User get(String uid) {
		if (userData.containsKey(Integer.parseInt(uid))) {
			return userData.get(Integer.parseInt(uid));
		}
		return null;
	}

	@Override
	public boolean update(String uid, User user) {
		//System.out.println(user);
		if (userData.containsKey(Integer.parseInt(uid))) {
			userData.put(Integer.parseInt(uid), user);
			//System.out.println(user);
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(String uid) {
		if (userData.containsKey(Integer.parseInt(uid))) {
			//System.out.println("------------");
			userData.remove(userData.get(Integer.parseInt(uid)));
			return true;
		}
		return false;
	}

}
