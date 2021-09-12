/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Sabrina Lopez
 */

package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("\nWhat is your age? "); //ask the user's age
        Scanner userAgeInput = new Scanner(System.in); //scan for the user's age
        int userAge = userAgeInput.nextInt();

        //determine whether the user is old enough to legally drive or not
        String legallyDriveResult = (userAge >= 16) ? "\nYou are old enough to legally drive." : "\nYou are not old enough to legally drive.";

        System.out.println(legallyDriveResult); //notify whether the user is able to legally drive or not

    }
}