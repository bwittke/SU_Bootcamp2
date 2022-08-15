package bwittke_p2;

import java.io.File;  // File class
import java.io.FileNotFoundException; // Imported to handle errors
import java.util.Scanner; // Scanner class
import java.util.Collections;

/**
 *
 * * @version 1.0
 *
 * @author  Bridget Wittke
 * ADD DESCRIPTION
 *
 */

public class SecretMessage {
    /**
     * ADD DESCRIPTION
     *
     */
    public static void main(String[] args)
            throws java.io.FileNotFoundException
    {
        //CONSTANTS/VARIABLES
        String fileName;
        String playAgain;
        // Scanner object to read the NAME of the file and 'Play Again'
        Scanner general = new Scanner(System.in);
        // Scanner object to read the CONTENTS of the file
       // Scanner fileRead = new Scanner(System.in);

        // Create MessageDecoder object
        MessageDecoder messageDecoder = new MessageDecoder();


        System.out.println("This program reads an encoded message " +
                "from a file supplied by the user and displays " +
                "the contents of the message before it was encoded.");
        do {
            System.out.println("Enter the file name that contains the secret" +
                    " message: ");
            fileName = general.nextLine();
            File file = new File(fileName); // Create file object

            String secretMessage;
            String line;
            String letter;
            int index;
            Scanner lineRead = new Scanner(file);
            while (lineRead.hasNextLine())
            {
                line = lineRead.nextLine();
                Scanner fileRead = new Scanner(line);


                    if (line.charAt(0) == ' ')
                    {
                        letter = " ";
                    }
                    else
                    {
                        letter = fileRead.next();
                    }
                    index = fileRead.nextInt();
                    messageDecoder.add(letter, index);
                    //lineRead.nextLine();


               // lineRead.nextLine();
                //fileRead.close();
                //secretMessage = messageDecoder.display();
            }


            // Scanner object to read the CONTENTS of the file
            /*Scanner fileRead = new Scanner(file);


            //String[] lineSection;
            String letter;
           // String newLine;
            int index;
            String line;

            // Loop to read all contents of the file
            while (fileRead.hasNext())
            {
                //letter = fileRead.nextLine();
               // lineSection =
                letter = fileRead.next();
                //fileRead.next();
               // line.split(" ");
                index = fileRead.nextInt();
                //break;
                messageDecoder.add(letter, index);
                //fileRead.nextLine();

                //letter = lineSection[0];
                //index = Integer.parseInt(lineSection[1]);
//                //int number = fileRead.nextInt();
//                String letter = fileRead.next();
//                int number = fileRead.nextInt();
                //line = fileRead.nextLine();
               // messageDecoder.add(letter, index);

                //break;*/

//
//
            //messageDecoder.sortList();
           secretMessage = messageDecoder.display();

            /**
             * Call methods from Message Decoder class
             */
            System.out.println("Your decoded message is: " + secretMessage ); // + input from MessageDecoder
            System.out.println("Would you like to read another file " +
                    "with a secret message? Type 'y' for yes and any " +
                    "other key to exit the program.");
            playAgain = general.nextLine();

        } while (playAgain == "y");
        System.out.println("Thank you for using the Message Decoder! " +
                "Have a great day!");

    }

    }



