package br.com.hr.datastructures.linkedlists;

import java.util.Scanner;

public class InsertHeadLinkedList {

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    SinglyLinkedList llist = new SinglyLinkedList();

    System.out.println("Quantos elementos? ");
    int llistCount = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    System.out.println("Digite os elementos da LinkedList: ");
    for (int i = 0; i < llistCount; i++) {
      int llistItem = scanner.nextInt();
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
      llist.insertNodeAtHead(llistItem);
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

    public void insertNodeAtHead(int nodeData) {

      Node newHead = new Node(nodeData);
      newHead.next = head;
      head = newHead;
      
     System.out.println(" Inseriu no início da LinkedList : " + head.data);
    }
  }

  static void printLinkedList(Node head) {
    while (head != null) {
      System.out.println(head.data);
      head = head.next;
    }
  }
}
