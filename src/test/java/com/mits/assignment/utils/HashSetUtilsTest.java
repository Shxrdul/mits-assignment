package com.mits.assignment.utils;

import org.junit.Test;
import java.util.Set;
import com.mits.assignment.models.*;

import static org.junit.Assert.*;

public class HashSetUtilsTest {
	
	HashSetUtils hashSetUtils = new HashSetUtils();


    @Test
    public void testEmployee1HashSet() {
    	
    	//Employee POJO without implementing hashcode or equals
    	Set<Employee1> set1 = hashSetUtils.addEmployee1ViaHashSet();
        assertEquals(2, set1.size());
    }
    
    @Test
    public void testEmployee2HashSet() {
    	
    	//Employee POJO implementing only the hashcode method
    	Set<Employee2> set2 = hashSetUtils.addEmployee2ViaHashSet();
        assertEquals(2, set2.size());
    }
    
    @Test
    public void testEmployee3HashSet() {
    	
    	//Employee POJO implementing only the equals method
    	Set<Employee3> set3 = hashSetUtils.addEmployee3ViaHashSet();
        assertEquals(1, set3.size());
    }
	
    @Test
    public void testEmployee4HashSet() {
    	
    	//Employee POJO implementing both hashcode & equals method
    	Set<Employee4> set2 = hashSetUtils.addEmployee4ViaHashSet();
        assertEquals(1, set2.size());
    }
	
}
