package thirtyDaysOfCode;

import java.util.Scanner;

public class Day13 {
	public static void main(String []args)
	   {
	      Scanner sc=new Scanner(System.in);
	      String title=sc.nextLine();
	      String author=sc.nextLine();
	      int price=sc.nextInt();
	      Book new_novel=new MyBook(title,author,price);
	      new_novel.display();
	      
	     sc.close();
	  
	      
	   }

}

abstract class Book
{
    String title;
    String author;
    Book(String t,String a){
        title=t;
        author=a;
    }
    abstract void display();


}

class MyBook extends Book{
	int price;
	MyBook(String t, String a, int price) {
		super(t, a);
		// TODO Auto-generated constructor stub
		this.price = price;
		
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Title: "+super.title);
		System.out.println("Author: "+super.author);
		System.out.println("Price: "+this.price);
		
		
	}
	
}