package com.practice.java8;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by msivasub on 13/11/2017.
 * Stream API has many methods which are useful to work with collections
 */
public class PickingAnElement {

    final Function<String,Predicate<String>> pickFirstFunction = letter -> (name) -> name.startsWith(letter);


    public  void pickName(final List<String> names, final String startingLetter) {

        final Optional<String> foundName = names.stream().filter(pickFirstFunction.apply("t")).findFirst();

        System.out.println(String.format("A name starting with %s: %s",startingLetter,foundName.orElse("No Name Found")));
    }




}
