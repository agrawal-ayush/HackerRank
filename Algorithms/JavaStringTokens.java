package algorithms;

import java.util.Scanner;

public class JavaStringTokens {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        if(s.trim().length() == 0){
            System.out.println(0);
        }
        else{
            String s1[] = s.trim().split("[\\s!,?._'@]+");
            System.out.println(s1.length);
            for(String i : s1){
                System.out.println(i);
            }
        }
        
        scan.close();
    }

}
