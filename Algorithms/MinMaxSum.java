package javahackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MinMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        
        List<Long> intList = new ArrayList<Long>();
        intList.add(a);
        intList.add(b);
        intList.add(c);
        intList.add(d);
        intList.add(e);
        
        Collections.sort(intList);
        
        int largest = 0;
        int smallest = 0;
        for(int i =1;i<intList.size();i++){
        	largest+=intList.get(i);
        }
        
        for(int i =0;i<intList.size()-1;i++){
        	smallest+=intList.get(i);
        }
        
        System.out.println(largest+" "+smallest);

	}

}
