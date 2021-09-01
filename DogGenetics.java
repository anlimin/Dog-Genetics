package com.sg.foundations.flowcontrol.arrays;

import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String dogName;
        Random random = new Random();
        int breed1 = random.nextInt(100) + 1;
        int breed2 = random.nextInt(100 - breed1) + 1;
        int breed3 = random.nextInt(100 - breed1 - breed2) + 1;
        int breed4 = random.nextInt(100 - breed1 - breed2 - breed3) + 1;
        int breed5 = 100 - breed1 - breed2 - breed3 - breed4;
        System.out.print("What is your dog's name? ");
        dogName = in.next();
        System.out.println("Well then, I have this highly reliable report on " + dogName +
                "'s prestigious background right here.");
        System.out.println();
        System.out.println(dogName + " is:");
        System.out.println();

        System.out.println(breed1 + "% St. Bernard");
        System.out.println(breed2 + "% Chihuahua");
        System.out.println(breed3 + "% Dramatic RedNosed Asian Pug");
        System.out.println(breed4 + "% Common Cur");
        System.out.println(breed5 + "% King Doberman");
        System.out.println();
        System.out.println("Wow, that's QUITE the dog!");
    }
}
