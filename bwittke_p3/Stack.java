package bwittke_p3;

import java.io.*;
import java.util.*;
import java.util.NoSuchElementException;

public class Stack<E> {

    // Linked list implementation
    private class Node<A>
    {
        public A value; // value of node
        Node<A> next; // reference node to link

        /**
         * The constructor takes in a value and assigns it a null node link.
         * @param value Value to be added to a node
         * @param next Reference node to link
         */
        Node (A value, Node<A> next)
        {
            this.value = value;
            this.next = next;
        }
    }

    // Top of stack
    private Node<E> top;

    /**
     * Stack constructor
     */
    public Stack()
    {
        top = null;
    }

    /** Push method adds a new item to the stack
     * @param value is the item to be pushed to the stack
     */
    public void push(E value)
    {
        top = new Node<E>(value, top);
    }

    /** Pop method removes an item from the top of the stack.
     * @return returnValue   The new item at the top of the stack.
     * @exception EmptyStackException when the stack is empty.
     */
    public E pop()
    {
        if (empty())
            throw new NoSuchElementException("Error, stack is empty");
        else
        {
            E returnValue = top.value;
            top = top.next;
            return returnValue;
        }
    }

    /** Peek method returns the top value on the stack.
     * @return value at top of stack
     * @exception EmptyStackException when the stack is empty.
     */
    public E peek()
    {
        if (empty())
            throw new IllegalArgumentException("Error, stack is empty");
        else
        {
            return top.value;
        }
    }


    /** Checks for empty stack.
     * @return true if empty, false if not.
     */
    public boolean empty()
    {
        return top == null;
    }






}
