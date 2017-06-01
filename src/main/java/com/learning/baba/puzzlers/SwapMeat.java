package com.learning.baba.puzzlers;

import com.learning.baba.java.ReadFile;

public class SwapMeat {

    private static final String FILE_NAME = "src/main/resources/swapmeat.txt";

    public static void main(String[] args) {
        System.out.println("Guess The Output for the following Code");
        int x = 1984;
        int y = 2001;

        x ^= y ^= x ^= y;

        System.out.println("x = " + x + "; y = " + y);
        System.out.println("As per above statement Swapping of the Variables should happen but we get x = 0 and y = 1984");
        System.out.println("##########################################################");
        System.out.println("Read the Explanation here");
        System.out.println("##########################################################");
        ReadFile.readFile(FILE_NAME);
    }
}
