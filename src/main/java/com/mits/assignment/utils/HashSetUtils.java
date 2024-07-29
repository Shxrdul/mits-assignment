package com.mits.assignment.utils;

import java.util.HashSet;
import java.util.Set;

import com.mits.assignment.models.*;

public class HashSetUtils {
	
	public Set<Employee1> addEmployee1ViaHashSet() 
    {
		Set<Employee1> set1 = new HashSet<Employee1>();
        set1.add(new Employee1("001", "John", "Doe"));
        set1.add(new Employee1("001", "John", "Doe")); 
        return set1;
    }
	
	public Set<Employee2> addEmployee2ViaHashSet() 
    {
		Set<Employee2> set2 = new HashSet<Employee2>();
        set2.add(new Employee2("002", "John", "Doe"));
        set2.add(new Employee2("002", "John", "Doe")); 
        return set2;
    }
	
	public Set<Employee3> addEmployee3ViaHashSet() 
    {
		Set<Employee3> set3 = new HashSet<Employee3>();
        set3.add(new Employee3("003", "John", "Doe"));
        set3.add(new Employee3("003", "John", "Doe")); 
        return set3;
    }
	
	public Set<Employee4> addEmployee4ViaHashSet() 
    {
		Set<Employee4> set4 = new HashSet<Employee4>();
        set4.add(new Employee4("004", "John", "Doe"));
        set4.add(new Employee4("004", "John", "Doe")); 
        return set4;
    }
	

}
