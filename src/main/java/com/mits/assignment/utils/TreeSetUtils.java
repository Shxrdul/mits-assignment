package com.mits.assignment.utils;

import java.util.Set;
import java.util.TreeSet;


import com.mits.assignment.models.Employee5;

public class TreeSetUtils {

	public void addEmployee5ViaTreeSet() 
	{
		Set<Employee5> set5 = new TreeSet<Employee5>();
		set5.add(new Employee5("001", "John", "Doe"));
		set5.add(new Employee5("002", "Jane", "Doe"));
		
		
		for(Employee5 emp: set5)
		{
			System.out.println(emp);
		}
		
	}
	
}
