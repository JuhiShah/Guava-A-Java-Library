package com.gc.dao;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.gc.model.Employee;
import com.gc.model.User;

public class GuavaDao {

	@SuppressWarnings("rawtypes")
	public static List getListByKey(String key) {

		Map<String, List> map = new HashMap<>();
		if (key.equalsIgnoreCase("user")) {

			User user1 = new User(1, "user1");
			User user2 = new User(2, "user2");
			User user3 = new User(3, "user3");
			User user4 = new User(4, "user4");

			map.put("user", Arrays.asList(user1, user2, user3, user4));

			System.out.println("User list loaded in cache of key : " + key);

		}
		if (key.equalsIgnoreCase("emp")) {

			Employee employee1 = new Employee(1, "employee1");
			Employee employee2 = new Employee(2, "employee2");
			Employee employee3 = new Employee(3, "employee3");
			Employee employee4 = new Employee(4, "employee4");

			map.put("emp", Arrays.asList(employee1, employee2, employee3, employee4));

			System.out.println("User list loaded in cache of key : " + key);
		}
		return map.get(key);

	}
}
