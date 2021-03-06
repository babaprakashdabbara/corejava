package com.learning.baba.puzzlers;

import com.learning.baba.java.ReadFile;

public class TheJoyOfHex {

    private static final String FILE_NAME = "src/main/resources/thejoyofhex.txt";

    public static void main(String[] args) {
        System.out.println("Guess The Output of the following programme");
        System.out.println(Long.toHexString(0x100000000L + 0xcafebabe));
        System.out.println("Expected Output For this Program is 1cafebabe" );
        System.out.println("Read the Explanation for this Puzzle Below");
        System.out.println("##########################################################");
        ReadFile.readFile(FILE_NAME);
    }
}
