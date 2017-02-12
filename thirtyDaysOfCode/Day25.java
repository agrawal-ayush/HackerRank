package thirtyDaysOfCode;

import java.util.Scanner;

public class Day25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0;i<n;i++){
			arr[i] = in.nextInt();
		}
		
		for(int i : arr){
			int flag = 0; 
			for(int k = 2;k<=i/2;k++){
				if(i%k == 0){
					flag = 0;
				}
				else{
					flag = 1;
				}
			}
			
			if(flag == 1){
				System.out.println("Prime");
			}
			else
				System.out.println("Not prime");
			
		}

	}

}
