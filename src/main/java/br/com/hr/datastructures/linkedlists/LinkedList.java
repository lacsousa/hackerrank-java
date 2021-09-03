package br.com.hr.datastructures.linkedlists;

public class LinkedList { 

  Node head;

  public void append(int data){

    if (head == null){
      head = new Node(data);
      return;
    }

    Node current = head;
    while (current.next != null) { 
      current = current.next;
    }
    current.next = new Node(data);
  }
  

  public void prepend(int data) { //adicionar no início
    Node newHead = new Node(data);
    newHead.next = head;
    head = newHead;
  }  


  public void deleteWithValue(int data){

      if (head == null) { 
        return;
      }

      if (head.data == data) { 
        head = head.next;
        return;
      }

      Node current = head; 
      while ( current.next != null) { 
        if(current.next.data == data){
          current.next = current.next.next;
          return;
        }
        current = current.next;
      }
  }


  public class Node {
    int data;
    Node next;
  
    public Node(int pData) { 
      this.data = pData;
    }
  } 


}
