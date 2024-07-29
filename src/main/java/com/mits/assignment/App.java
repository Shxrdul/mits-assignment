package com.mits.assignment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import com.mits.assignment.utils.*;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Thread myThreads[] = new Thread[4];
    	
    	for(int i=0; i<4; i++)
    	{
    		myThreads[i] = new Thread(new Counter());
    	    myThreads[i].start();
    	}
    	
    	
    	for (int j=0; j<4; j++) 
    	{
    	    try {
				myThreads[j].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
    	}
    	
    	Thread t5  = new Thread(new Counter());
    	t5.start();
    	
    	
    	TreeSetUtils treeSetUtils = new TreeSetUtils();
		treeSetUtils.addEmployee5ViaTreeSet();
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		System.out.println(list.stream().map(i -> i*i).toList());
		System.out.println(list.stream().filter(i -> i%2==0).map(i -> i*i).toList());
		
		String s;
		try(BufferedReader br = new BufferedReader(new FileReader("Hello.txt"));)
		{
	      while ( (s = br.readLine()) != null) {
	         String[] words = s.split("[^a-zA-Z0-9]+");
	         for(String word : words){
	           System.out.println(word);
	         }
	      }
	    }catch (FileNotFoundException ex){
	         System.out.println(ex);
	    }
	    catch (IOException ex){
	        System.out.println(ex);
	    }
		
    }
}
