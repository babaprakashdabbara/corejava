package com.learning.baba.java.concepts;

import java.io.Console;

public class Lambdas {

    public static void main(String[] args) {
        final Console console = System.console();

        final String line1 = console.readLine();

        final int result = new LengthComparator().compare("First", "Second");
        System.out.println("Result Of Comparision" + result);

        //System.out.println("Result Of Comparision" + ("First", "Second")-> Integer.compare());
    }
}
