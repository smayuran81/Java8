package com.practice.java8.lambda;

import java.util.function.IntConsumer;

/**
 * Created by msivasub on 20/11/2017.
 */
public class LambdaPractice {

    Runnable r1 = () -> System.out.println("Hello world 1");

    Runnable r2 = new Runnable() {
        @Override
        public void run() {
            System.out.println("hello world 2");
        }
    };

    public static void process(Runnable r) {
        r.run();
    }

    public void test(){
        process(r1);
        process(r2);

    }
}
