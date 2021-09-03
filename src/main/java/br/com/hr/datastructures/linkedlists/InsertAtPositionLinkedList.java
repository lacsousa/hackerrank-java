package br.com.hr.datastructures.linkedlists;

import java.util.Arrays;
import java.util.List;

public class InsertAtPositionLinkedList {

  public static void main(String[] args) {
    SinglyLinkedList llist = new SinglyLinkedList();
    List<Integer> llistCount = Arrays.asList(16, 13, 5, 10);
    for (Integer i : llistCount) {
      llist.insertNode(i);
    }

    insertNodeAtPosition(llist.head, 1, 2);

    printLinkedList(llist.head);
  }


  static class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
      this.data = nodeData;
      this.next = null;
    }
  }



  static class SinglyLinkedList {
    public SinglyLinkedListNode head;
    public SinglyLinkedListNode tail;

    public SinglyLinkedList() {
      this.head = null;
      this.tail = null;
    }

    public void insertNode(int nodeData) {
      SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

      if (this.head == null) {
        this.head = node;
      } else {
        this.tail.next = node;
      }

      this.tail = node;
    }
  }
  

  static void printLinkedList(SinglyLinkedListNode head) {
    if (head == null)
      System.exit(0);

    SinglyLinkedListNode current = head;

    System.out.println(head.data);

    while (current.next != null) {
      current = current.next;
      System.out.println(current.data);
    }
  }


  static void insertNodeAtPosition(SinglyLinkedListNode head, int newElem, int insert_position) {

    if (head == null) {
      return; // lista vazia
    }

    int p = 0;
    SinglyLinkedListNode newElement = new SinglyLinkedListNode(newElem);
    SinglyLinkedListNode current = head;
    SinglyLinkedListNode previous = current;
    while (p++ != insert_position) {
      previous = current;
      current = current.next;
    }
    previous.next = newElement;
    newElement.next = current;

  }
}
