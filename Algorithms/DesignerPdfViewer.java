package algorithms;

import java.util.Scanner;

public class DesignerPdfViewer {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        in.close();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int max = 0;
        int val = 0;
        for(int i = 0; i < word.length() ; i++ ){
        	val = h[alphabet.indexOf(word.charAt(i))];
        	max = Math.max(val, max);
        	
        }
        
        System.out.println(word.length() * max);
        
        
        
    }

}
