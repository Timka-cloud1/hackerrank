package dataStructures.linked_list.Insert_node;

import dataStructures.linked_list.print_linked_list.PrintLinkedList;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class InsertNode {
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
        SinglyLinkedListNode list = head;
        while (list.next != null) {
            System.out.println(list.data);
            list = list.next;
        }

        System.out.println(list.data);

    }

    /** solve*/
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        if(llist == null) {
            llist = new SinglyLinkedListNode(data);
            return llist;
        }
        SinglyLinkedListNode listData = new SinglyLinkedListNode(data);

        listData.next = llist;
        llist = listData;

       return llist;

    }
    /** solve*/

    /** solve*/
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
//        if(head == null) {
//            head = new SinglyLinkedListNode(data);
//            return head;
//        }
//        int counter = 0;
//        SinglyLinkedListNode list = head;
//        while (list != null) {
//            list = list.next;
//            counter++;
//        }
//        list = head;
//        for (int i = 0; i < counter - 1; i++) {
//            list = list.next;
//        }
//
//        list.next = new SinglyLinkedListNode(data);
//
//        return head;


        SinglyLinkedListNode temp = head;
        if(temp == null){
            head = new SinglyLinkedListNode(data);
            return head;
        }
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new SinglyLinkedListNode(data);
        return head;


    }
    /** solve*/

    /** solve*/
    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        SinglyLinkedListNode temp = llist;
        if(temp == null){
            return null;
        }
        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }
        SinglyLinkedListNode list = temp.next;
        temp.next = new SinglyLinkedListNode(data);
        temp = llist;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = list;
        return llist;

//        if (llist == null) return null;
//
//        SinglyLinkedListNode temp = new SinglyLinkedListNode(data);
//        if (position == 0) {
//            temp.next = llist;
//            return temp;
//        }
//        SinglyLinkedListNode p = llist;
//        for (int i = 0; i< position-1; i++) {
//            p = p.next;
//        }
//        SinglyLinkedListNode next = p.next;
//        p.next = temp;
//        temp.next = next;
//        return llist;


    }
    /** solve*/

    /** solve*/
    public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
        Stack<Integer> stack = new Stack<>();
        SinglyLinkedListNode list = llist;
        while (list != null) {
            stack.push(list.data);
            list = list.next;
        }
        list = llist;
        while (list != null) {
            list.data = stack.pop();
            list = list.next;
        }


        return llist;

    }
    /** solve*/

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        SinglyLinkedList llist = new SinglyLinkedList();

        llist.insertNode(5);
        llist.insertNode(6);
        llist.insertNode(7);
        llist.insertNode(8);
        SinglyLinkedListNode reverse = reverse(llist.head);
          printLinkedList(reverse);


        scanner.close();
    }
}


