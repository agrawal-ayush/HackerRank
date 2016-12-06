package javahackerrank;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "mnh";
		String B = "java";
		
		System.out.println(A.length() + B.length());
		if(A.compareTo(B) > 0)
			System.out.println("Yes");
		else
			System.out.println("No");
			
		
		System.out.println(A.substring(0, 1).toUpperCase().concat(A.substring(1)) + " " + B.substring(0, 1).toUpperCase().concat(B.substring(1)));
		

	}

}
