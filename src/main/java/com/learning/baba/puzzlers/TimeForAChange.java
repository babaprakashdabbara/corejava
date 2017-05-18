package com.learning.baba.puzzlers;

import com.learning.baba.java.ReadFile;

public class TimeForAChange {

    private static final String fileName = "src/main/resources/TimeForAChange.txt";

    public static void main(String[] args) {

        System.out.println("Guess The Result Below");
        System.out.println(2.00 - 1.10);
        System.out.println("If you wonder why u get wrong result");
        System.out.println("Read the Explanation Below");
        System.out.println("#################################################################");
        ReadFile.readFile(fileName);
        System.out.println("#################################################################");
    }
}
