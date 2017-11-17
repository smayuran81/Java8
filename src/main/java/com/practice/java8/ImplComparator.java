package com.practice.java8;

import com.practice.java8.com.practice.java8.data.GlobalData;
import com.practice.java8.com.practice.java8.data.Person;
import jdk.nashorn.internal.objects.Global;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by msivasub on 14/11/2017.
 *
 * key here is how easily multiple comparators are used.
 */
public class ImplComparator {

    Comparator<Person> compareAscending =(person1, person2) -> person1.ageDifference(person2);


    Comparator<Person> compareDescneding = compareAscending.reversed();

    List<Person> ascendingAge = GlobalData.personsLIST.stream()
                                .sorted((person1,person2) -> person1.ageDifference(person2))
                                .collect(Collectors.toList());


    List<Person> sortedByName = GlobalData.personsLIST.stream()
                                    .sorted((person1, person2) ->
                                    person1.getName().compareTo(person2.getName()))
                                    .collect(Collectors.toList());

    final Function<Person, String> byName = person -> person.getName();

    final Function<Person,Integer> byAge = person -> person.getAge();

    public void test() {
        GlobalData.personsLIST.stream()
                .min(Person::ageDifference)
                .ifPresent(youngest -> System.out.println("Youngers: " + youngest));

        GlobalData.personsLIST.stream()
                .sorted(Comparator.comparing(byName).thenComparing(byAge))
                .collect(Collectors.toList());


    }
}
