package javahackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String S = "welcometojava";
        int length = 3;
        
        List<String> arrayList = new ArrayList<String>();
        
        for(int i =0;i<(S.length()-length+1);i++){
            
            arrayList.add(S.substring(i,i+length));
        }
        
        Collections.sort(arrayList);
        
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(arrayList.size()-1));
        
        
        
        
    }

}
