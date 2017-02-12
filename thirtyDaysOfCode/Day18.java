package thirtyDaysOfCode;

import java.util.Scanner;

public class Day18 {
	
	char stack[] = new char[100];
	char queue[] = new char[100];
	int top = -1;
	int front = 0;
	int rear = -1;
	
	private char dequeueCharacter() {
		// TODO Auto-generated method stub
		
		return queue[front++];
	}

	private char popCharacter() {
		// TODO Auto-generated method stub
		return stack[top--];
	}

	private void enqueueCharacter(char c) {
		// TODO Auto-generated method stub
		queue[++rear] = c;
		
	}

	private void pushCharacter(char c) {
		// TODO Auto-generated method stub	
		top= top+1;
		stack[top] = c;
	}
	
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();
        
        
        
        // Create a Solution object:
        Day18 p = new Day18();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }

}
