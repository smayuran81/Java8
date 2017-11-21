package com.practice.java8.BehaviourParameterization;

import com.practice.java8.BehaviourParameterization.Formatter.PersonFormatter;
import com.practice.java8.FunctionalInterface.BufferedReaderProcessor;
import com.practice.java8.com.practice.java8.data.GlobalData;
import com.practice.java8.com.practice.java8.data.Person;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created by msivasub on 20/11/2017.
 */
public class Behavior {


    Function<Person, String> printPersonName = p-> p.getName();

    public static List<Person>  filterPersons(List<Person> personList, PersonPredicate personPredicate) {
        List<Person> result = new ArrayList<>();
        for(Person person: personList) {
            if(personPredicate.test(person)) {
                result.add(person);

            }
        }
        return result;
    }

    public static void prettyPrintPerson(List<Person> person, PersonFormatter formatter) {
        for(Person person1: person) {
            String output = formatter.accept(person1);
        }
    }

    public static void compareIntegerExample() {

        Integer number1=100;
        Integer number2=200;


    }

    public static Callable<String> fetch() {
        return () -> "Tricky Example";
    }

    public static Consumer<String> printValue = s -> System.out.print(s);


    public static String processFile(BufferedReaderProcessor p) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        return p.process(br);

    }


    Function<BufferedReader, String> f =
            (BufferedReader b) -> {
                try {
                    return b.readLine();
                }
                catch(IOException e) {
                    throw new RuntimeException(e);
                }
            };
    public static void main(String[] args) throws ExecutionException, InterruptedException, IOException {
        List<Person> person = GlobalData.personsLIST;
         //filterPersons(person, p -> 20 <= p.getAge());
         person.sort((p1,p2) -> Integer.compare(p1.getAge(),p2.getAge()));
        Consumer<Person> c = System.out::println;
        person.stream().forEach(c);
        filterPersons(person, p -> 20 <= p.getAge());
        ExecutorService executor = Executors.newFixedThreadPool(10);
        Future<String> future=executor.submit(fetch());
        printValue.accept(future.get());
        executor.shutdown();
        String oneLine = processFile(br -> br.readLine());
        String twoLine = processFile(br -> br.readLine()+br.readLine());


    }
}
