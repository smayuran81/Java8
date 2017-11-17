package com.practice.java8;

import com.practice.java8.com.practice.java8.data.GlobalData;

import java.util.Optional;

/**
 * Created by msivasub on 13/11/2017.
 */
public class ReducingCollectionToSingleValue {

    public void maptoInt() {
        int total = GlobalData.friends.stream().mapToInt(name -> name.length()).sum();
        System.out.println(total);
    }


    final Optional<String> aLongName = GlobalData.friends.stream().reduce((name1,name2) -> name1.length()>= name2.length() ? name1:name2);
}

