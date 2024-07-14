///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
//Title:           BasicArrayLists
//Course:          CS200 Fall 2022
//
//Author: Teresa Campbell
//Email: tjcampbe@wisc.edu
//Lecturer's Name: Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
//Source or Recipient; Description
//no help
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////
//package org.example;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class has methods to perform some basic operations
 * on Arraylists.
 */
public class BasicArrayLists
{
    /** The main method creates an ArrayList.
     * Reads commands from the input, one at a time
     * and performs 'add' or 'flip'
     * or 'remove' operations on an ArrayList.
     * On 'print' Prints the contents of the ArrayList
     * and exit the program.
     * @param args (unused)
     */
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        ArrayList<String> arrayList = new ArrayList<>();
//        System.out.println("I will give you instructions.");
//        System.out.println("You may add strings to the array by typing add
        //        [string]. You can do this as many times as you want.");
//        System.out.println("You may also manipulate the elements of the
        //        string with the index " +
//                "number of the element(s) and with the keywords remove or
        //                flip. Remove requires " +
//                "one int afterwards (the index to remove). Flip requires
        //                two ints (the index of " +
//                "the elements you would like to flip");
//        System.out.println("When you are finished adding, removing,
        //        and flipping, type 'print'");
//
//        System.out.println("Please enter a command");
        while (true) {
            String command = scnr.next();

            if (command.equals("add")) {
                String stringToAdd = scnr.next();
                arrayList.add(stringToAdd);
//                System.out.println(arrayList);
            } else if (command.equals("remove")) {
                int indexToRemove = scnr.nextInt();
                if (indexToRemove >= 0 && indexToRemove < arrayList.size()) {
                    arrayList.remove(indexToRemove);
//                    System.out.println(arrayList);
                } else {
//                    System.out.println("Invalid index");
                }
            } else if (command.equals("flip")) {
                int index1 = scnr.nextInt();
                int index2 = scnr.nextInt();
                if (index1 >= 0 && index1 < arrayList.size() && index2 >= 0
                        && index2 < arrayList.size()) {
                    String temp = arrayList.get(index1);
                    arrayList.set(index1, arrayList.get(index2));
                    arrayList.set(index2, temp);
//                    System.out.println(arrayList);
                } else {
//                    System.out.println("Invalid indices");
                }
            } else if (command.equals("print")) {

                for (String element : arrayList) {
                    System.out.print(element + " ");
                }
                break;
            } else {
//                System.out.println("Invalid command");
            }
        }

        scnr.close();
    }
}

