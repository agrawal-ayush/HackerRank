package WeekOfCode27;

import java.util.Scanner;

public class DrawingBook {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        // your code goes here
        in.close();
        int totalSheets = (n%2 == 0) ? (n/2) : (n/2+1);
		int startFrom = ((p <= totalSheets )? 1 : n );
		int count = 0;
		if(p == 1 || p==n || (p == (n-1) && (n%2) == 1)){
			System.out.println(count);
			return;
		}
		
		
		if( p <= totalSheets && n%2 == 0){
			for(int i = startFrom;i<p;i+=2){
				
				count+=1;
			}
			System.out.print(count);
			return;
		}
		
		else if( p <= totalSheets && n%2 == 1){
			for(int i = startFrom;i<p;i+=2){
				
				count+=1;
			}
			System.out.print(count);
			return;
		}
		
		else if( p > totalSheets && n%2 == 0){
			for(int i = startFrom;i>p;i-=2){
				
				count+=1;
			}
			System.out.print(count);
			return;
		}
		
		else if( p > totalSheets && n%2 == 1){
			for(int i = startFrom;i>p;i-=2){
				
				count+=1;
			}
			System.out.print(count);
			return;
		}

}
}
