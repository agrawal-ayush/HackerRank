package thirtyDaysOfCode;

import java.util.Scanner;

public class Day10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		String binary = "";
		while(n > 0){
			binary = n%2 + binary;
			n = n/2;
		}
		
		int maxConsecutiveOneNum = 0;
		int consecutiveOneNum = 0;
		for (int i = 0; i < binary.length(); i++) {
			if (binary.charAt(i) == '1') {
				consecutiveOneNum++;
				maxConsecutiveOneNum = Math.max(maxConsecutiveOneNum, consecutiveOneNum);
			} else {
				consecutiveOneNum = 0;
			}
		}
		System.out.println(maxConsecutiveOneNum);

	}

}
