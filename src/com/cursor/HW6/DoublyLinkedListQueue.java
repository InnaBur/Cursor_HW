package com.cursor.HW6;

import java.util.ArrayList;

/**
 * This class implements methods for Doubly Linked List
 * based Queue ( Methods: enqueue, dequeue, size, isEmpty )
 */
public class DoublyLinkedListQueue {

    class Node {
        public double number;
        public Node next;
    }

    private Node head;
    private Node end;

    public int size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    ArrayList arr = new ArrayList<>();

    /**
     * In the method values of the list are
     * added into array list
     * and then array list is printed
     */
    public void printArrayList() {
        DoublyLinkedListQueue.Node temp = head;
        while (temp != null) {
            arr.add(temp.number);
            temp = temp.next;
        }
        System.out.println(arr);
    }

    public void printList() {
        DoublyLinkedListQueue.Node temp = head;
        while (temp != null) {
            System.out.println(temp.number);
            temp = temp.next;
        }
    }

    /**
     * In this method values are added to the end of the list
     */
    public void enqueue(double number) {
        Node oldEnd = end;
        end = new Node();
        end.number = number;
        end.next = null;
        if (head == null) {
            head = end;
        } else {
            oldEnd.next = end;
        }
        System.out.println(number + " was added");
    }

    /**
     * The method allows to remove an element from the beginning
     * (LIFO)
     */
    public void dequeue() {
        double num = head.number;
        head = head.next;
        if (head == null) {
            end = null;
        }
        System.out.println(num + " was removed");
    }


}
