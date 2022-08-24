package bwittke_p3;

import java.util.NoSuchElementException;

/**
 * This is the Queue class for P3
 *
 * @author  Bridget Wittke
 * @version 1.0
 */

public class Queue<E> {

    /**
     * Implementation of the queue is a doubly-linked list.
     */

    public class Node<A> {
        /**
         * Queue element.
         */
        public A data;
        /**
         * Next queue element
         */
        public Node<A> next;
        /**
         * Previous queue element
         */
        @SuppressWarnings("unused")
        public Node<A> prev;


        /**
         * Constructor of Node in queue list
         * @param data
         * @param next
         * @param prev
         */
        public Node(A data, Node<A> next, Node<A> prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    private Node<E> head;  // top of queue
    private Node<E> tail; // bottom of queue

    /**
     * Create a new empty queue
     */
    public Queue() {
        head = null;
        tail = null;
    }

    /**
     The enqueue method adds a value
     to the queue.
     @param direction Value to be added
     to the queue.
     */

    public void enqueue(E direction)
    {
        if (empty())
        {
            tail= new Node<E>(direction, null, null);
            head = tail;
        }
        else
        {
            tail.next = new Node<E>(direction, null, null);
            tail = tail.next;
        }
    }

    /**
     The dequeue method removes and returns
     the item at the front of the queue.
     @return item at front of queue.
     @throws NoSuchElementException When
     the queue is empty.
     */

    public E dequeue()
    {
        if (empty())
            throw new NoSuchElementException("Error: Queue is empty.");
        else
        {
            E returnValue = (E) head.data;
            if (head.next != null)
            {
                head = head.next;
                head.prev = null;
            } else {
                head = null;
            }
            return returnValue;

        }
    }


    /**
     The peek method returns the value at the front of the
     queue but does not remove it.
     @return value of item at front of queue.
     @throws NoSuchElementException When
     the queue is empty.
     */

    public E peek()
    {
        if (empty())
            throw new IllegalArgumentException("Error, queue is empty");
        else
            return (E) head.data;
    }


    /**
     The empty method checks to see if
     the queue is empty.
     @return true if queue
     is empty.
     */

    public boolean empty()
    {
        return head == null;
    }



}







