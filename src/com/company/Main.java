package com.company;

import java.util.Scanner;
import java.util.Random;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("enter the number of sides of your dice please");
        int sides = input.nextInt();
        System.out.println("how many times would you like to throw your dice?");
        int dicethrow = input.nextInt();
        for (int i = 0; i < dicethrow; i++) {
            int newrandom = random.nextInt((sides - 1) + 1) + 1;
            System.out.println(newrandom);


                HashMap<String, String> tally = new HashMap<String, String>();

                System.out.println(tally);
            }
        }
    }
