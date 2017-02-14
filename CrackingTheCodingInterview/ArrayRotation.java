package CrackingTheCodingInterview;
import java.util.Scanner;



public class ArrayRotation {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        for(int i : rotateArray(a,k))
        	System.out.println(i);
        in.close();
    }
	
	public static int[] rotateArray(int[] arr, int k){
		
		while(k > 0){
			int temp = arr[0];
			for(int i = 0; i < arr.length -1; i++){
				arr[i] = arr[i+1];
			}
			
			arr[arr.length - 1] = temp;
			k--;
		}
		
		return arr;
		
	}

}
