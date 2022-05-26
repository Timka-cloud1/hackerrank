package dataStructures.linked_list.Insert_node;

import dataStructures.linked_list.print_linked_list.PrintLinkedList;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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

    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode temp1=head1;
        SinglyLinkedListNode temp2=head2;
        List<SinglyLinkedListNode>list=new ArrayList<SinglyLinkedListNode>();
        while(temp1!=null){
            list.add(temp1);
            temp1=temp1.next;
        }
        while(temp2!=null){
            if(list.contains(temp2)){
                break;
            }
            temp2=temp2.next;
        }
        return temp2.data;

    }



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        int tests = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int testsItr = 0; testsItr < tests; testsItr++) {
            int index = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            SinglyLinkedList llist1 = new SinglyLinkedList();

            int llist1Count = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llist1Count; i++) {
                int llist1Item = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist1.insertNode(llist1Item);
            }

            SinglyLinkedList llist2 = new SinglyLinkedList();

            int llist2Count = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llist2Count; i++) {
                int llist2Item = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist2.insertNode(llist2Item);
            }

            SinglyLinkedListNode ptr1 = llist1.head;
            SinglyLinkedListNode ptr2 = llist2.head;

            for (int i = 0; i < llist1Count; i++) {
                if (i < index) {
                    ptr1 = ptr1.next;
                }
            }

            for (int i = 0; i < llist2Count; i++) {
                if (i != llist2Count-1) {
                    ptr2 = ptr2.next;
                }
            }

            ptr2.next = ptr1;

            int result = findMergeNode(llist1.head, llist2.head);
            System.out.println(result);

        }



        scanner.close();
    }

//    public static void main(String[] args) throws IOException {
//
//        SinglyLinkedList head = new SinglyLinkedList();
//
//        head.insertNode(1);
//        head.insertNode(2);
//        head.insertNode(3);
//
//        SinglyLinkedList head2 = new SinglyLinkedList();
//
//
//        head2.insertNode(1);
//        head2.insertNode(2);
//        head2.insertNode(3);
//        System.out.println(findMergeNode(head.head, head2.head));
////        SinglyLinkedListNode singlyLinkedListNode = mergeLists(head.head, head2.head);
////        printLinkedList(singlyLinkedListNode);
////        llist.insertNode(9);
////        llist.insertNode(10);
////        llist.insertNode(11);
//        //    reversePrint(llist.head);
//        //int res = getNode(llist.head, 2);
////        printLinkedList(res);
////        System.out.println(res);
////
//
//        scanner.close();
//    }
}


