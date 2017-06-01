package com.learning.baba.puzzlers;

import com.learning.baba.java.ReadFile;

public class MultiCast {

    private static final String FILE_NAME = "src/main/resources/multicast.txt";

    public static void main(String[] args) {
        System.out.println("Guess the Out put for the below code");
        System.out.println((int) (char) (byte) -1);
        System.out.println("Expected Out put for this programe is -1 but we get 65535");
        System.out.println("Read the explanation here");
        ReadFile.readFile(FILE_NAME);
    }
}
