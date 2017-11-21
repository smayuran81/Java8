package com.practice.java8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by msivasub on 17/11/2017.
 */
public class StreamCheckTest {


    @Test
    public void testStream() {
        StreamCheck st = new StreamCheck();
        List<String> str = new ArrayList<>();
        str.add("green");
        for(String s: str) {
            StreamCheck.filterApple(str, s1 -> "green".equals(s1));
        }
    }
}
