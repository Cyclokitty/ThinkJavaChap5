package com.cyclokitty;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        guessMyNumber();
    }

    // Guess my Number Game
    // tell user if her guess is too low or too high
    public static void guessMyNumber() {
        Scanner scan = new Scanner(System.in);
        //int answer = 52;
        int answer = randomNumPicker();
        // uncomment line below to avoid guessing forever for testing.
        //System.out.println(answer);
        int playerGuess = 0;
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("Can you guess it?");

        while (playerGuess != answer) {
            System.out.print("Type a number: ");
            playerGuess = scan.nextInt();
            if (playerGuess == answer) {
                System.out.println("You got it!");
                break;
            } else {
                System.out.print("Try again.");
            }
        }
    }

    // use the this to get a random number fro  1 - 100
    public static int randomNumPicker() {
        Random random = new Random();
        return  random.nextInt(100) + 1;
    }
}
