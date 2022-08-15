package bwittke_p2;

/**
 The LList class is used to create a linked list of integers. This class
 also contains methods to check if the list is empty, add an integer to
 the end of the list, sort the list in ascending order, and display the
 contents of the list to the console.
 */

public class MessageDecoder {
    /**
     * The private Node class stores an element
     * of the list and references the next node.
     */

    private class Node {
        String letter;
        int letterIndex;
        Node next;

        /**
         * Constructor.
         *
         * @param let   The letter to be stored
         * @param letI Number indicating placement of character
         * @param n   Reference to the next node.
         */

        Node(String let, int letI, Node n) {
            letter = let;
            letterIndex = letI;
            next = n;
        }

        /**
         * Constructor.
         *
         * @param letI Number indicating placement of character
         * @param let   The letter to be stored
         */

        Node(String let, int letI) {
            // Call the other (sister) constructor.
            this(let, letI, null);
        }
    }

    private Node first;  // Head of list
    private Node last;   // Tail of list, where new ints are added

    /**
     * Linked List Constructor.
     */

    public MessageDecoder() {
        first = null;
        last = null;
    }

    /**
     * "isEmpty" checks to see
     * if the list is empty.
     *
     * @return true if list is empty,
     * false if not.
     */

    public boolean isEmpty() {
        return first == null;
    }


    /**
     * The "add" method adds an integer to
     * the end (tail) of the list.
     *
     * @param i Value to be added to the
     *          end of the list.
     *          @param i Value to be added to the
     *      *          end of the list.
     */

    public void add(String letter, int i) {
        if (isEmpty()) {
            first = new Node(letter, i);
            last = first;
        } else {
            // Add to end of existing list
            last.next = new Node(letter, i);
            last = last.next;
        }
    }


    /**
     * The "sortList" method sorts the nodes from a list in ascending order
     */

    public void sortList()
    {
        Node current = first;
        Node index = null;
        int temp;

        if (first == null)
        {
            return;
        }
        else
        {
            while (current != null)
            {
                index = current.next;

                while (index != null)
                {
                    if (current.letterIndex > index.letterIndex)
                    {
                        temp = current.letterIndex;
                        current.letterIndex = index.letterIndex;
                        index.letterIndex = temp;
                    }
                    index = index.next;
                }
                current = current.next;

            }
        }

    }

    /**
     * The "display" method prints the contents of the linked list.
     */

    public String display() {
        Node current = first;
       // while(current != null) {
            //return current.letter;
            //current = current.next;
       // }
        return current.letter;
        //System.out.println();
    }

    /**
     * The "removeDuplicates" eliminates repeating integers
     * to ensure there is not more than one of each integer in
     * a list.
     */

   /* public void removeDuplicates(LList inputFile) {
        Node current = first;
        Node index = null;
        Node temp = null;
        if (first == null)
        {
            return;
        }
        else
        {
            while (current != null)
            {
                temp = current;
                index = current.next;
                while (index != null)
                {
                    if (current.value == index.value)
                    {
                        temp.next = index.next;
                    }
                    else
                    {
                        temp = index;
                    }
                    index = index.next;
                }
                current = current.next;
            }

        }

    }*/
}


/*import java.io.*;
import java.util.Scanner;

public class MessageDecoder {
    String file;
    private Node first;  // first element in list
    private Node last;   // last element in list

    public MessageDecoder(String file){
        first = null;

        // Constructor
    }

    public String getPlainTextMessage(){
        /// Define method
    }

    private void readFile(String fileName) throws FileNotFoundException {
        // File object and new scanner object to read file contents
        File file = new File(fileName);
        Scanner inputFile = new Scanner(file);
        while (inputFile.hasNextLine()){
            String line = inputFile.nextLine();

            // parse the line and create nodes
        }

    }



    private class Node
    {
        int data, index;
        char letter;
        Node next;
        *//**
         * * Constructor.
          * @param letter  Character in the file
         *  @param index   Placement of character in file
         *      *//*

        Node(char letter, int index, Node n)
        {
            this.letter = letter;
            this.index = index;
            this.next = n;
        }

        public Node(String data)
        {

        }
    }

    public void addNode(String data)
    {
        // Create new node
        Node newNode = new Node(data);

        // Checks if the list is empty.
        if (first == null) {

            first = newNode;
            last = newNode;

            // point the tail to head node.
            last.next = first;
        }
        else {
            newNode.next = first;

            last.next = newNode;

            first = newNode;
        }
    }

    public void sortList()
    {
        Node current = first, ind = null;

        int temp;

        if (first == null)
        {
            return;
        }
        else
        {
            while (current != null)
            {
                ind = current.next;
                while (ind != null) {
                    // If current node's data is greater
                    // than index's node data, swap the data
                    // between them
                    if (current.index > ind.index) {
                        temp = current.index;
                        current.index = ind.index;
                        ind.index = temp;
                    }

                    ind = ind.next;
                }
                current = current.next;
            }

        }

    }

}*/



