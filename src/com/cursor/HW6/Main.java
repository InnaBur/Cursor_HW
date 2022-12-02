package com.cursor.HW6;

import java.util.LinkedList;

/**
 * The class creates Singly Linked List, Doubly Linked List and Doubly Linked List (Queuq)
 *  and basic operations are performed with lists
 */
public class Main {
    public static void main(String[] args) {

        /* Creating new Singly Linked List, Doubly Linked List
         * and Doubly LinkedList based Queue   */
        SinglyLinkedList singlyLL = new SinglyLinkedList();
        DoublyLinkedList doubLL = new DoublyLinkedList();
        DoublyLinkedListQueue que = new DoublyLinkedListQueue();

        /** operations with Singly Linked List
         * (isEmpty, size, push, pop, top and print)
         */
        System.out.println(singlyLL.isEmpty());

        singlyLL.push(12);
        singlyLL.push(333);
        singlyLL.push(100);
        singlyLL.push(77);

        System.out.println("Is the single list empty?");
        System.out.println(singlyLL.isEmpty());

        System.out.println("Single list size is: " + singlyLL.size());
        singlyLL.printList();
        System.out.println("Pop element: " + singlyLL.pop());
        singlyLL.pop();
        System.out.println("Single list after removing an element: ");
        singlyLL.printList();
        System.out.println("Now single list size is: " + singlyLL.size());
        System.out.println("Top of the single list: ");
        singlyLL.top();

        /** operations with Doubly Linked List
         * (isEmpty, size, addFirst, addLast, and print as arraylist)
         */
        System.out.println("Is the double list empty?");
        System.out.println(doubLL.isEmpty());
        System.out.println("Double list size is: " + doubLL.size());

        doubLL.addFirst("April");
        doubLL.addFirst("March");
        doubLL.addFirst("February");
        doubLL.addLast("December");
        doubLL.addFirst("January");

        System.out.println("Doubly Linked List is: ");
        doubLL.printList();
        System.out.println("Now double list size is: " + doubLL.size());

        /** operations with Doubly LinkedList based Queue (LIFO)
         * (isEmpty, size, enqueue, dequeue and print)
         */
        System.out.println("Is the queue list empty?");
        System.out.println(que.isEmpty());
        System.out.println("Queue list size is: " + que.size());

        que.enqueue(0.5);
        que.dequeue();
        que.enqueue(0.9);
        que.enqueue(1.7);
        que.enqueue(2.0);
        que.dequeue();
        System.out.println("Doubly Linked List (QUEUE) is: ");
        que.printArrayList();
        System.out.println("Now queue list size is: " + que.size());

    }
}