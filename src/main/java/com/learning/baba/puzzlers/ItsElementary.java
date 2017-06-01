package com.learning.baba.puzzlers;

import com.learning.baba.java.ReadFile;

public class ItsElementary {

    private static final String FILE_NAME = "src/main/resources/itselementary.txt";

    public static void main(String[] args) {
        System.out.println("Guess The Output for the following Code");
        System.out.println(12345 + 5432l);
        System.out.println("Read the Explanation for this Puzzle Below");
        System.out.println("##########################################################");
        ReadFile.readFile(FILE_NAME);
    }
}
