package com.learning.baba.puzzlers;

import com.learning.baba.java.ReadFile;

import java.util.Scanner;

/**
 * Created by BADAB1 on 2017-05-16.
 */
public class Oddity {

    private static final String fileName = "src/main/resources/Oddity.txt";

    public static void main(String[] args) {
        System.out.println("Enter Number to find Oddity");
        Scanner scanner = new Scanner(System.in);
        final String inputFromUser = scanner.nextLine();
        System.out.println("Finding whether Number you have entered is Odd or not");
        final boolean isOdd = isOdd(Integer.valueOf(inputFromUser));
        System.out.println("Result for the input Entered [" + inputFromUser +"] is ["+ isOdd +"]");
        System.out.println("If you wonder why u get wrong result for the negative input");
        System.out.println("Read the Explanation Below");
        System.out.println("#################################################################");
        ReadFile.readFile(fileName);
        System.out.println("#################################################################");
    }

    public static boolean isOdd(int i) {
        return i % 2 == 1;
    }
}
