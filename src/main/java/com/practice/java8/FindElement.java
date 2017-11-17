package com.practice.java8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by msivasub on 09/11/2017.
 */
public class FindElement {

    final List<String> names = new ArrayList<>();

    public FindElement(){
        names.add("myexample");
        names.add("myexample");
        names.add("myexample");
        names.add("nyexample");

    }

    /**
     * Map method returns collection of the same size where as the filter method may or may not
     */
    private void findElement() {
        final List<String> startWithN = names.stream().filter(name ->  name.startsWith("N")).collect(Collectors.toList());
    }
}
