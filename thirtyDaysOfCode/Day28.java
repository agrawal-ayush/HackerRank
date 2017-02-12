package thirtyDaysOfCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Day28 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String namesArray[] = new String[n];
		String emailArray[] = new String[n];
		
		for(int i = 0;i < n;i++){
			namesArray[i] = in.next();
			emailArray[i] = in.next();
		}
		
		in.close();
		List<String> arr = new ArrayList<String>();
		for(int i = 0;i < n;i++){
			if(emailArray[i].contains("@gmail.com"))
				arr.add(namesArray[i]);
		}
		
		Collections.sort(arr);
		for (String s : arr)
			System.out.println(s);
		
	}

}
