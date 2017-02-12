package thirtyDaysOfCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8 {

	public static void main(String []argh){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<String,Integer> m1 = new HashMap<>();
		for(int i = 0; i < n; i++){
			String name = in.next();
			int phone = in.nextInt();
			// Write code here
			m1.put(name, phone);

		}
		while(in.hasNext()){
			String s = in.next();
			// Write code here
			if(m1.get(s)!= null){
				System.out.println(s+"="+m1.get(s));
			}
			else{
				System.out.println("Not found");
			}
		}
		in.close();
	}

}
