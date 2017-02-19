package linkedList;

/*
Delete Node at a given position in a linked list 
head pointer input could be NULL as well for empty list
Node is defined as 
class Node {
   int data;
   Node next;
}
*/
  // This is a "method-only" submission. 
  // You only need to complete this method. 

Node Delete(Node head, int position) {
// Complete this method
  Node current = head;
  if(position == 0){
      return head.next;
  }
  else{
      while(--position > 0){
          current = current.next;
      }
      
      current.next = current.next.next;
      
      return head;
  }
  
}
