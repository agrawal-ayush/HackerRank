package algorithms;

import java.util.Scanner;

public class JavaRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        in.close();
//		String s = "666.666.23.23";
//		System.out.println(s.matches("([0-9]){1,3}.([0-9]){1,3}.([0-9]){1,3}.([0-9]){1,3}"));
		

	}

}

class MyRegex{
	String pattern="(\\d{1,2}|[01]\\d{2}|2[0-5]\\d)\\.(\\d{1,2}|[01]\\d{2}|2[0-5]\\d)\\.(\\d{1,2}|[01]\\d{2}|2[0-5]\\d)\\.(\\d{1,2}|[01]\\d{2}|2[0-5]\\d)";
}
