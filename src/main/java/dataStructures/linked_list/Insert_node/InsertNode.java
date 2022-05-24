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
        if(head == null) {
            return;
        }
        SinglyLinkedListNode list = head;
        while (list.next != null) {
            System.out.println(list.data);
            list = list.next;
        }

        System.out.println(list.data);

    }

    /**
     * solve
     */
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        if (llist == null) {
            llist = new SinglyLinkedListNode(data);
            return llist;
        }
        SinglyLinkedListNode listData = new SinglyLinkedListNode(data);

        listData.next = llist;
        llist = listData;

        return llist;

    }
    /** solve*/

    /**
     * solve
     */
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
        if (temp == null) {
            head = new SinglyLinkedListNode(data);
            return head;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new SinglyLinkedListNode(data);
        return head;


    }
    /** solve*/

    /**
     * solve
     */
    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        SinglyLinkedListNode temp = llist;
        if (temp == null) {
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

    /**
     * solve
     */
    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
//        SinglyLinkedListNode list = llist;
//        for (int i = 0; i < position - 1; i++) {
//            list = list.next;
//        }
//        list = list.next.next;
//        SinglyLinkedListNode temp = list;
//        list = llist;
//        for (int i = 0; i < position - 1; i++) {
//            list = list.next;
//        }
//        list.next = temp;
//        return llist;

        if (position == 0) {
            llist = llist.next;
            return llist;
        }
        SinglyLinkedListNode list = llist;
        for (int i = 0; i < position - 1; i++) {
            list = list.next;
        }
        list.next = list.next.next;
        return llist;

    }

    /** solve*/

    /**
     * solve
     */
    public static int getNode(SinglyLinkedListNode llist, int positionFromTail) {
        SinglyLinkedListNode list = llist;
        int counter = 0;
        while (list != null) {
            list = list.next;
            counter++;
        }
        int position = counter - positionFromTail;
        list = llist;
        for (int i = 0; i < position - 1; i++) {
            list = list.next;
        }


        return list.data;

    }
    /**solve*/

    /**
     * solve
     */
    public static void reversePrint(SinglyLinkedListNode llist) {
        SinglyLinkedListNode list = llist;
        Stack<Integer> stack = new Stack<>();
        while (list != null) {
            stack.push(list.data);
            list = list.next;
        }

        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.pop());
            i -= 1;
        }

    }

    /**
     * solve
     */


    /**
     * solve
     */
    public static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if(head1 == null && head2 == null) {
            return null;
        }
        SinglyLinkedListNode list;
        if (head1 == null) {
            head1 = head2;
        } else {
            list = head1;
            while (list.next != null) {
                list = list.next;
            }
            list.next = head2;
        }
        boolean flag = true; // bubble sort
        while (flag) {
            flag = false;
            list = head1;
            while (list.next != null) {
                if (list.data > list.next.data) {
                    int temp = list.data;
                    list.data = list.next.data;
                    list.next.data = temp;
                    flag = true;
                }
                list = list.next;

            }
        }

        return head1;
    }


    /**
     * solve
     */


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        SinglyLinkedList head = new SinglyLinkedList();

        head.insertNode(9);
        head.insertNode(10);
        head.insertNode(11);
        SinglyLinkedList head2 = new SinglyLinkedList();

        head2.insertNode(3);
        head2.insertNode(1);
        head2.insertNode(11);
        head2.insertNode(15);
        head2.insertNode(18);
        head2.insertNode(1);
        head2.insertNode(0);

        SinglyLinkedListNode singlyLinkedListNode = mergeLists(head.head, head2.head);
        printLinkedList(singlyLinkedListNode);
//        llist.insertNode(9);
//        llist.insertNode(10);
//        llist.insertNode(11);
        //    reversePrint(llist.head);
        //int res = getNode(llist.head, 2);
//        printLinkedList(res);
//        System.out.println(res);
//

        scanner.close();
    }
}


