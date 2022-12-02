package com.cursor.HW6;

/** This class implements methods for Singly Linked List
 * ( Methods: push, pop, top, size, isEmpty )
 */
public class SinglyLinkedList {
    class Node {
        public int val;
        public Node next;

    }
    private Node head;

    /** In the method checks if the list is empty
     */
    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    /** In the method elements are added to the list
     */
    public void push(int val) {
        Node newHead = new Node();
        newHead.val = val;
        newHead.next = head;
        head = newHead;
    }

    /** In the method elements are removed to the list
     */
    public int pop() {
        int temp = head.val;
        head = head.next;
        return temp;
    }

    public void top() {
        System.out.println(head.val);
    }

    /** In the method size of the list is calculated
     */
    public int size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }


    /** In the method values of the list are printing
     */
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

}
//push, pop, top, size, isEmpty
