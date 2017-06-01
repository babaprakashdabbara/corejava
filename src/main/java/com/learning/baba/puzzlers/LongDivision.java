package com.learning.baba.puzzlers;

import com.learning.baba.java.ReadFile;

/**
 * Created by BADAB1 on 2017-05-23.
 */
public class LongDivision {

    private static final String FILE_NAME = "src/main/resources/longdivision.txt";

    public static void main(String[] args) {
        System.out.println("Guess The Output for the following Code");
        final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
        final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
        System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);
        System.out.println("Expected Output For this Program is 1000" );

        System.out.println("But Here First we get NumericOverFlow");
        System.out.println("Read the Explanation for this Puzzle Below");
        System.out.println("##########################################################");
        ReadFile.readFile(FILE_NAME);
    }
}
