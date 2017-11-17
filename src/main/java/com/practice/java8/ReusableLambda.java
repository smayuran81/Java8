package com.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by msivasub on 13/11/2017.
 */
public class ReusableLambda {

    final List<String> friends = Arrays.asList("Tome","Harry","Teunis");

    final List<String> persons = Arrays.asList("harry", "yank","harry");

    //This leads to duplicate
    final Predicate<String> startWithN = name -> name.startsWith("N");

    //Higher order fundtion to avoid duplication
    public static Predicate<String> checkIfStartsWIth(final String letter){
        return name-> name.startsWith(letter);//letter will
    }

    final Function<String, Predicate<String>> startWithLetter = (String letter)-> {
      Predicate<String> checkStarts =(String name) -> name.startsWith(letter);
      return checkStarts;
    };


    //types removed and java compiler will infer it
    final Function<String, Predicate<String>> startWithLetterCompact = letter -> {
        return name -> name.startsWith(letter);
    };





    final long countFriendsStartN = friends.stream().filter(startWithN).count();
    final long countPersonStartN = persons.stream().filter(startWithN).count();




}
