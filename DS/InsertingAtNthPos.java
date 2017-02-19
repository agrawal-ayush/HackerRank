package linkedList;

/*
Insert Node at a given position in a linked list 
head can be NULL 
First element in the linked list is at position 0
Node is defined as 
class Node {
   int data;
   Node next;
}
*/
  

Node InsertNth(Node head, int data, int position) {
 // This is a "method-only" submission. 
  // You only need to complete this method. 
  Node current = head;
  Node previous = null;
  
  Node newNode = new Node();
  newNode.data = data;
  newNode.next = null;
  
  
  if(position == 0){
      newNode.next = current;    
      return newNode;
  }
  else{
      for(int i = 0;i<position;i++){
          previous = current;
          current = current.next;
          if(current == null)
              break;
      }
      
      newNode.next = current;
      previous.next = newNode;
      return head;
      
  }
  
  
  
}

