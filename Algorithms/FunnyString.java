package javahackerrank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FunnyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Integer t = sc.nextInt();

		List<String> stringList = new ArrayList<String>();
		for(int i =0;i<t;i++){
			String s = sc.next();
			stringList.add(s);
		}

		sc.close();

		for (String string : stringList) {

			String A = string;

			String B = "";
			for(int i=0;i<A.length();i++){
				B+=A.substring(A.length()-i-1,A.length()-i);
			}

			Boolean flag = false;

			int length = A.length();
			for(int i = 1;i<length;i++){
				if(Math.abs((int)A.charAt(i) - (int)A.charAt(i-1)) == Math.abs((int)B.charAt(i) - (int)B.charAt(i-1))){
					flag = true;
				}
				else {
					flag = false;
					break;
				}
				

			}

			if(flag){
				System.out.println("Funny");
			}
			else{
				System.out.println("Not Funny");
			}
		}



	}

}
