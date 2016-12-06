package javahackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SockMerchant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n = 9;
        int c[] = {10,20,20,10, 10, 30, 50, 10, 20};
        int freq[] = new int[101];
        Set<Integer> undefined = new HashSet<Integer>();
        for(int i=0; i < n; i++){
        	freq[c[i]]++;
        	undefined.add(c[i]);
        }
        int count = 0;
        
        for (Iterator iterator = undefined.iterator(); iterator.hasNext();) {
			Integer integer  = (Integer) iterator.next();
			if(freq[integer]/2>=1){
				count = count +freq[integer]/2; 
				
				System.out.println(freq[integer]);
			}
			
		}
        
        System.out.println(count);

        
        

       
        
	}

}
