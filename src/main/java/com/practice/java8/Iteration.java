package com.practice.java8;

        import java.math.BigDecimal;
        import java.util.Arrays;
        import java.util.List;
        import java.util.function.*;

/**
 * Created by msivasub on 08/11/2017.
 */
public class Iteration {



    final List<BigDecimal> prices = Arrays.asList(new BigDecimal("10"), new BigDecimal("20"),new BigDecimal("30"), new BigDecimal("40"),new BigDecimal(40));

    private void testSteamMapFilter() {
        prices.stream().filter(price->price.compareTo(BigDecimal.valueOf(20))>0).map(price -> price.multiply(BigDecimal.valueOf(0.9))).reduce(BigDecimal.ZERO,BigDecimal::add);

    }

    public Iteration() {

    }


    public Iteration(int numeber) {

    }

    /**
     * We invoked the forEach on the friends collection and passed an anonymous instance of Consumer to it.
     * The forEach method will invoke the accept method of the given Consumer for each element in the collection and let it do whatever it wants with it
     */
    private void foreEach() {
        prices.forEach(new Consumer<BigDecimal>() {
            @Override
            public void accept(BigDecimal price) {
                System.out.println(price);

            }
        });
    }

    Function<String, Integer> stringToInteger =
            (String s) -> Integer.parseInt(s);

    Supplier<Iteration> s1 = Iteration::new;

    Function<Integer,Iteration> iterationNew = Iteration::new;

    Function<String, Integer> stringToIntegerMethodReference = Integer::parseInt;

    private void forEachWithLambda() {
        prices.forEach((final BigDecimal price) -> System.out.println(price));

        //inferred parameters are not final. compiler determines price parameter as a string type based on the context
        // it looks up the signature  of the called method
        prices.forEach((price) -> System.out.println(price));

        //method reference
        prices.forEach(System.out::println);
    }



}
