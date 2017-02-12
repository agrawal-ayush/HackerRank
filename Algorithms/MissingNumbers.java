package algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class MissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int arr1[] = new int[1000010];
		for(int i = 0;i<n;i++){
			arr1[in.nextInt()]++;
		}
		
		
		int m = in.nextInt();
		int arr2[] = new int[1000010];
		Set<Integer> s = new HashSet<Integer>();
		List<Integer> l = new ArrayList<Integer>();
		for(int i = 0;i<m;i++){
			int e = in.nextInt();
			arr2[e]++;
			s.add(e);
		}
		
		in.close();
		
		for (@SuppressWarnings("rawtypes")
		Iterator iterator = s.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			if(arr2[integer] - arr1[integer] > 0){
				l.add(integer);
			}
			
		}
		
		Collections.sort(l);
		
		for(int i : l){
			System.out.print(i + " ");
		}

	}

}
