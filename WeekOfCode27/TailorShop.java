import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int[] a = new int[n];
        
        
        int sum = 0;
        Set<Integer> buttons = new HashSet<Integer>();
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            buttons.add((int)Math.ceil((double)a[a_i]/p));
            sum+=(int)Math.ceil((double)a[a_i]/p);
        }
        
        in.close();
        if(buttons.size() == a.length){
        	System.out.println(sum);
        	return;
        }
        else{
        	System.out.println(sum+1);
        }
        
        
    }
}
