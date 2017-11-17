package com.practice.java8.com.practice.java8.data;

import java.util.Arrays;
import java.util.List;

/**
 * Created by msivasub on 13/11/2017.
 */
public class GlobalData {
    public static final List<String> friends = Arrays.asList("Tome","Harry","Teunis");

    public static final List<Person> personsLIST = Arrays.asList(
            new Person("John",20),
            new Person("Sara",24),
            new Person("Jane",23),
            new Person("Greg",22)
    );
}
