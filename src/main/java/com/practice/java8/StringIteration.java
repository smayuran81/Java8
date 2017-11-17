package com.practice.java8;

/**
 * Created by msivasub on 14/11/2017.
 */
public class StringIteration {

    public void stringIteration(){
        final String str = "W00t";

        str.chars().forEach(ch -> System.out.println(ch));
        str.chars().forEach(StringIteration::printChar);

        str.chars().mapToObj(ch -> Character.valueOf((char)ch))
                .forEach(System.out::println);

    }


    public static void main(String[] args) {
        StringIteration stringIteration =  new StringIteration();
        stringIteration.stringIteration();

    }


    private static void printChar(int aChar) {
        System.out.println((char)(aChar));
    }


}
