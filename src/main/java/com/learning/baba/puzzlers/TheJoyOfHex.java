package com.learning.baba.puzzlers;

public class TheJoyOfHex {

    public static void main(String[] args) {
        System.out.println("Guess The Output of the following programme");
        System.out.println(Long.toHexString(0x100000000L + 0xcafebabe));
    }
}
