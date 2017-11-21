package com.practice.java8.BehaviourParameterization;

import com.practice.java8.com.practice.java8.data.Person;

/**
 * Created by msivasub on 20/11/2017.
 */
public class ApplyAgePredicate implements PersonPredicate {

    private int checkAge;

    @Override
    public Boolean test(Person person) {
        if(person.getAge()>20) {
            return true;
        }

        return  false;
    }
}
