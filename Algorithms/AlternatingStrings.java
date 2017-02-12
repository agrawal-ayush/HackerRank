package algorithms;

import java.util.Scanner;

public class AlternatingStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		String arr[] = new String[t];
		for(int k = 0; k < t; k++){
			arr[k] = in.next();
		}

		in.close();
		for(int k = 0; k < t; k++){
			String s = arr[k];
			char s1 = s.charAt(0);
			int count = 0;
			for(int i = 1; i < s.length(); i++){

				if(s1 == s.charAt(i)){
					count++;
				}

				s1 = s.charAt(i);
			}

			System.out.println(count);
		}

	}

}
