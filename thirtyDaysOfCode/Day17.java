package thirtyDaysOfCode;

import java.util.Scanner;

public class Day17 {
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int T=in.nextInt();
		while(T-->0)
		{
			int n = in.nextInt();
			int p = in.nextInt();
			Calculator myCalculator = new Calculator();
			try
			{
				int ans=myCalculator.power(n,p);
				System.out.println(ans);

			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		
		in.close();

	}
}


class Calculator{
	int power(int n,int p) throws Exception{
		int result = 0;

		if(n > 0 && p > 0){
			result =  (int)Math.pow(n,p);
		}
		else{
			throw new Exception("n and p should be non-negative");
		}

		return result;
	} 
}

