package bwittke_lab7;

import java.util.NoSuchElementException;

/**
 * This is the RenderQueue class for the L-System program.
 *
 * @author  Bridget Wittke
 * @version 1.0
 */

public class RenderQueue {

    /**
     * Implementation of the queue is a doubly-linked list.
     */

    public class Node {
        /**
         * Queue element.
         */
        public RenderPoint data;
        /**
         * Next queue element
         */
        public Node next;
        /**
         * Previous queue element
         */
        public Node prev;


        /**
         * Constructor of Node in queue list
         * @param data
         * @param next
         * @param prev
         */
        public Node(RenderPoint data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    private Node head;  // top of queue
    private Node tail; // bottom of queue

    /**
     * Create a new empty queue
     */
    public RenderQueue() {
        head = null;
        tail = null;
    }

    /**
     The enqueue method adds a value
     to the queue.
     @param point The RenderPoint object to be added
     to the queue.
     */

    public void enqueue(RenderPoint point)
    {
        if (tail != null)
        {
            tail.next = new Node(point, null, null);
            tail = tail.next;
        }
        else
        {
            tail = new Node(point, null, null);
            head = tail;
        }
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

    /**
     The dequeue method removes and returns
     the item at the front of the queue.
     @return item at front of queue.
     @exception NoSuchElementException When
     the queue is empty.
     */

    public RenderCommand dequeue()
    {
        if (empty())
            throw new NoSuchElementException("Error: Queue is empty.");
        else
        {
            RenderPoint current = head.data;
            head = head.next;
            if (head == null) tail = null;
            RenderCommand enumCommand;

           // return value???;
        }
    }

    /**
     The toString method concatenates all strings
     in the queue to give a string representation
     of the contents of the queue.
     @return string representation of this queue.
     */

    public String toString()
    {
        StringBuilder sBuilder = new StringBuilder();

        // Walk down the list and append all values
        Node p = head;
        while (p != null)
        {
            sBuilder.append(p.data + " ");
            p = p.next;
        }
        return sBuilder.toString();
    }

    /**
     The copy method makes a clone of the
     existing Queue
     @return duplicate of queue
     */

    public RenderQueue copy()
    {
        RenderQueue current = new RenderQueue();
        RenderQueue copy = current;
        return copy;

    }

















}
