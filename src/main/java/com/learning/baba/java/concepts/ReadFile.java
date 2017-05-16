package com.learning.baba.java.concepts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by BADAB1 on 2017-05-16.
 */
public class ReadFile {

    public static void readFile(String fileName) {
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Unable to Read Explanation File");
        }
    }
}
