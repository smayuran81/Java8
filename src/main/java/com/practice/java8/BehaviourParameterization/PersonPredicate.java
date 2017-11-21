package com.practice.java8.BehaviourParameterization;

import com.practice.java8.com.practice.java8.data.Person;

/**
 * Created by msivasub on 20/11/2017.
 */
public interface PersonPredicate {

    public Boolean test(Person person);
}
