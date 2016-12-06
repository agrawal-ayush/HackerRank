package javahackerrank;

public class MarExplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "SOSSOT";

		char[] a = S.toCharArray();
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if((i%3 == 0)& a[i]=='S'){
				
			}
			else if((i%3 == 1)&a[i]=='O'){

			}
			else if((i%3 == 2)&a[i]=='S'){

			}
			else{
				count = count + 1;
				System.out.println(a[i]+" "+i);
			}
			
		}
		
		System.out.println(count);
		
		

	}

}
