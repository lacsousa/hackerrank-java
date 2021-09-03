package br.com.hr.datastructures.linkedlists;

import java.util.Arrays;
import java.util.List;

public class InsertAtTailLinkedList {

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

    public SinglyLinkedList() {
      this.head = null;
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

  static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {

    SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

    if (head == null) {
      head = newNode;
      return head;
    }

    SinglyLinkedListNode current = head;
    while (current.next != null) {
      current = current.next;
    }

    current.next = newNode;

    return head;
  }

  public static void main(String[] args) {

    SinglyLinkedList llist = new SinglyLinkedList();
    List<Integer> insertList = Arrays.asList(16, 13, 5, 10, 50);

    for (Integer i : insertList) {
      SinglyLinkedListNode llist_head = insertNodeAtTail(llist.head, i);

      llist.head = llist_head;
     
    }

    printLinkedList(llist.head);
  }

}
