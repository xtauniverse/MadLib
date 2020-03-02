package com.company;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        //Phase 1 Declaring
        String userName;
        String vocationOne;
        String adjectiveOne;
        String objectOne;
        String friendName;
        String personOne;
        String adjectiveTwo;
        String animalReal;
        String placeOne;
        String adverbOne;
        String personTwo;
        String vocationTwo;
        String verbOne;
        String nounOne;
        String colorTwo;
        String animalFictional;
        String placeTwo;
        String verbTwo;
        String verbThree;
        String nounTwo;
        String objectTwo;
        String colorOne;

        Scanner keyboard;

        //phase 2 Initializing

        keyboard = new Scanner(System.in);

        System.out.println("Hello! Welcome to MadLibs! What is your username?");
        userName = keyboard.nextLine();
        System.out.println("Hello " + userName + "! Are you ready to play? First enter a job title.");
        vocationOne = keyboard.nextLine();
        System.out.println("Please enter an object.");
        objectOne = keyboard.nextLine();
        System.out.println("Please enter a friend's name.");
        friendName = keyboard.nextLine();
        System.out.println("Please enter a object.");
        objectTwo = keyboard.nextLine();
        System.out.println("Please enter the name of a place.");
        placeOne = keyboard.nextLine();
        System.out.println("Please enter a verb.");
        verbThree = keyboard.nextLine();
        System.out.println("Please enter the name of a fictional animal.");
        animalFictional = keyboard.nextLine();
        System.out.println("Please enter a famous person you know.");
        personOne = keyboard.nextLine();
        System.out.println("Please enter a adjective.");
        adjectiveTwo = keyboard.nextLine();
        System.out.println("Please enter a real animal, plural.");
        animalReal = keyboard.nextLine();
        System.out.println("Please enter a adjective.");
        adjectiveOne = keyboard.nextLine();
        System.out.println("Please enter an adverb.");
        adverbOne = keyboard.nextLine();
        System.out.println("Please enter a famous person you know.");
        personTwo = keyboard.nextLine();
        System.out.println("Please enter a job title.");
        vocationTwo = keyboard.nextLine();
        System.out.println("Please enter a noun.");
        nounTwo = keyboard.nextLine();
        System.out.println("Please enter a color.");
        colorTwo = keyboard.nextLine();
        System.out.println("Please enter a name of a place.");
        placeTwo = keyboard.nextLine();
        System.out.println("Please enter a verb.");
        verbOne = keyboard.nextLine();
        System.out.println("Please enter a verb ending in -ing.");
        verbTwo = keyboard.nextLine();
        System.out.println("Please enter a noun.");
        nounOne = keyboard.nextLine();
        System.out.println("Please enter a color.");
        colorOne = keyboard.nextLine();
        keyboard.close();

        // phase 3 Printing
        System.out.print("   "+ vocationOne +" "+ userName + ", is on a quest to find the " + adjectiveOne + " " + objectOne + ".");
        System.out.println(" The " + objectOne + " has the power to wipe entire cities if used improperly by the wrong hands.");
        System.out.println("But your once good friend, " + friendName + " has been possessed by an evil demon, named " + personOne + "." + " He seeks out to send his army of ");
        System.out.print( adjectiveTwo +" "+ animalReal + " ");
        System.out.println("to find the " + objectOne + " and use it to conquer kingdoms and pillage for his own gain, to take over the Kingdom of " + placeOne + ".");
        System.out.println("The king will greet you and " + verbOne + " his servants to assist by " + verbTwo + " you with their " + nounOne + ".");
        System.out.println("On " + userName + "'s journey, he will find the " + colorOne + " " + animalFictional + ", a mythical beast that will help him find his way to his next ally." );
        System.out.println("He will find the help of the " + adverbOne +" "+personTwo +  ", a legendary " + vocationTwo + " that wields the "+ objectTwo + " and is key to the quest.");
        System.out.print("You " + verbThree + " " + personOne + "'s army to save your friend " + friendName + ", bring peace to " + nounTwo + ", and to the entire country of " + colorTwo +" "+ placeTwo + "!");

    }
}
