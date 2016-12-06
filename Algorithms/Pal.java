package javahackerrank;

public class Pal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "masdam";
		Boolean b = false;
		int l = A.length();
		for (int i = 0; i <= l/2; i++) {
			if(A.charAt(i) == A.charAt(l-i-1)){
				b = true;
			}	
			else
				b = false;
		}
		
		if(b)
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
