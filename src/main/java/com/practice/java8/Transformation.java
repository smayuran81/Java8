package com.practice.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by msivasub on 09/11/2017.
 */
public class Transformation {

    final List<String> names = new ArrayList<>();


    public Transformation(){
        names.add("mayuran1");
        names.add("mayuran1");
        names.add("mayuran1");
        names.add("mayuran1");
    }


    private void transformNames(){

        final List<String> upperCaseNames = new ArrayList<String>();
        Consumer<String> upperCaseNameConverter= name -> upperCaseNames.add(name.toUpperCase());
        upperCaseNames.forEach(upperCaseNameConverter);
    }

    //map => transform input collection into a new output collection
    private void transformNamesWithLambda(){

            names.stream().map(name -> name.toUpperCase())
                    .forEach(name -> System.out.print(name+""));
            System.out.println();

        /**if lambda expressions merely pass their parameters through, we can replace them with method references.
            However, we can’t use this convenience if we have to manipulate parameters before sending them as
            arguments or tinker with the call’s results before returning them.**/
            names.stream()
                    .map(String::toUpperCase)
                    .forEach(System.out::println);
    }


}
