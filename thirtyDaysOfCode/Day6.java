package thirtyDaysOfCode;

import java.util.*;


public class Day6 {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		String[] list = new String[testCases];
		for(int i = 0;i<testCases;i++){
			list[i] = in.next();
			
		}
		in.close();

		for(int i =0;i<testCases;i++){
			String input = list[i];
			String evenStr = "";
			String oddStr = "";
			for(int j =0;j<input.length();j+=2){
				evenStr += input.charAt(j);
			}
			
			for(int j =1;j<input.length();j+=2){
				oddStr += input.charAt(j);
			}

			System.out.println(evenStr +" "+ oddStr);
		}
	}
}

