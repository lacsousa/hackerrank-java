package br.com.hr.datastructures.linkedlists;

import java.util.Scanner;

public class PrintLinkedList {

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    SinglyLinkedList llist = new SinglyLinkedList();

    int llistCount = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int i = 0; i < llistCount; i++) {
      int llistItem = scanner.nextInt();
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
      llist.insertNode(llistItem);
    }

    printLinkedList(llist.head);
    scanner.close();

  }

  static class Node {
    public int data;
    public Node next;

    public Node(int nodeData) {
      this.data = nodeData;
      this.next = null;
    }
  }


  static class SinglyLinkedList {
    public Node head;

    public SinglyLinkedList() {
      this.head = null;
    }

    public void insertNode(int nodeData) {
      if (head == null) {
        head = new Node(nodeData);
        System.out.println(" Inseriu no head: " + this.head.data);
      }

      Node current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = new Node(nodeData);
      System.out.println(" Inseriu no final da LinkedList : " + current.next.data);
    }
  }

  static void printLinkedList(Node head) {
    while (head != null) {
      System.out.println(head.data);
      head = head.next;
    }
  }
}
