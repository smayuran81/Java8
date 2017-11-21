package com.practice.java8.FunctionalInterface;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by msivasub on 21/11/2017.
 */
@FunctionalInterface
public interface BufferedReaderProcessor {
    String process(BufferedReader b) throws IOException;



    default String check(BufferedReader b) throws  IOException {
        return "dummy";
    }
}
