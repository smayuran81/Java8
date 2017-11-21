package com.practice.java8.BehaviourParameterization.Formatter;

import com.practice.java8.com.practice.java8.data.Person;

/**
 * Created by msivasub on 20/11/2017.
 */
public class PersogAgeFormatter implements PersonFormatter {
    @Override
    public String accept(Person p) {
        String chracteristic = p.getAge()>20 ?"old" : "young";
        return "A " + chracteristic +" " + p.getName()+ " person";
    }
}
