package com.gc.factory;

import java.util.List;

import com.gc.helper.CacheManager;
import com.gc.model.Employee;
import com.gc.model.User;
import com.gc.utility.CacheUtility;

public class MainClass {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		try {
			CacheManager.loadCache("user", CacheUtility.getCacheLoader("user"));
			CacheManager.loadCache("emp", CacheUtility.getCacheLoader("emp"));
			
			System.out.println("First call of user data : \n");

			List<User> ulist = CacheManager.getData("user", "user");
			for (User user : ulist) {
				System.out.println();
				System.out.println("User id : " + user.getUserId());
				System.out.println("User name : " + user.getUserName());
			}
			System.out.println();
			System.out.println("First call of employee data : \n");

			List<Employee> elist = CacheManager.getData("emp", "emp");
			for (Employee employee : elist) {
				System.out.println();
				System.out.println("Employee id : " + employee.getEmpId());
				System.out.println("Employee name : " + employee.getEmpName());
			}
			System.out.println();

			// second invocation, data will be returned from cache
			System.out.println("Second call of user data : ");
			List<User> ulist2 = CacheManager.getData("user", "user");
			for (User user : ulist2) {
				System.out.println();
				System.out.println("User id : " + user.getUserId());
				System.out.println("User name : " + user.getUserName());
			}
			System.out.println("Second call of employee data : ");
			List<Employee> elist2 = CacheManager.getData("emp", "emp");
			for (Employee employee : elist2) {
				System.out.println();
				System.out.println("Employee id : " + employee.getEmpId());
				System.out.println("Employee name : " + employee.getEmpName());
			}
			System.out.println();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}