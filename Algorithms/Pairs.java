package algorithms;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		double array[] = new double[n];
		Set<Double> s = new TreeSet<Double>();
		for(int i=0;i<n;i++){
			array[i] = in.nextInt();
			s.add(array[i]);
		}
		
		int count= 0;
		for (int i = 0; i < n; i++) {
			if(s.contains(array[i]+ k))
				count++;
			
			
			
			
//			Map<Integer, Integer> m1 = new HashMap<Integer,Integer>();  
//			for (int j = i+1; j < n; j++) {
//				if(Math.abs(array[i] - array[j]) == k){
////					System.out.println(array[i]+" "+array[j]);
//					count++;
//				}
//			}
			
		}
		
		System.out.println(count);
		
		in.close();
		

	}

}
