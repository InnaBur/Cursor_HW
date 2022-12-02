package com.cursor.HW6;

import java.util.ArrayList;

/**
 * This class implements methods for Doubly Linked List
 * (Methods: addFirst, addLast, size, isEmpty)
 */
public class DoublyLinkedList {

    class Node {
        public String st;
        public Node next;
        public Node prev;
        public double number;
    }

    Node head;
    Node end;

    public void addFirst(String st) {
        Node newHead = new Node();
        newHead.st = st;
        newHead.next = head;
        newHead.prev = null;
        if (head != null) {
            head.prev = newHead;
        }
        head = newHead;
        if (end == null) {
            end = newHead;
        }
    }

    public void addLast(String st) {
        Node last = new Node();
        last.st = st;
        last.next = null;
        last.prev = end;
        if (end != null) {
            end.next = last;
        }
        end = last;
        if (head == null) {
            head = last;
        }
    }

    ArrayList array = new ArrayList<>();

    /**
     * In the method values of the list are
     * added into array list
     * and then array list is printed
     */
    public void printList() {
        DoublyLinkedList.Node temp = head;
        while (temp != null) {

            array.add(temp.st);

            temp = temp.next;
        }
        System.out.println(array);
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    /**
     * In the method size of the list is calculated
     */
    public int size() {
        int count = 0;
        DoublyLinkedList.Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }
}
