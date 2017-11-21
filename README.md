# Java8
behavior parameterization is a useful pattern to easily adapt to changing requirements. This pattern lets you encapsulate a behavior (a piece of code) and parameterize the behavior of methods by passing and using these behaviors you create (for example, different predicates for an Apple)

Behavior parameterization is the ability for a method to take multiple different behaviors as parameters and use them internally to accomplish different behaviors.
Behavior parameterization lets you make your code more adaptive to changing requirements and saves on engineering efforts in the future.



**`Valida and invlalid lambdas`**

(parameters) -> expression

(parameters) -> { statements; }


1.  () -> {}

This takes no argument as input and returns nothing. This is equivalent to methood with empty body
 
 
2.  () -> "Raoul"

This doesnt take any input but returns string as output

3.  () -> {return "Mario";}

This doesnt take any input but returns a string as output

4.  (Integer i) -> return "Alan" + i;

This returns statment and it is not  valida
unless {return "Alan" +i;}

5.  (String s) -> {"Iron Man";}

`Valid Functional Interfaces`

**_Valid functional interface should have only one abstract method or should declare one of them default to have a valid functional interface_** 

1. public interface Adder{
    int add(int a, int b);
}

2. public interface SmartAdder extends Adder{
    int add(double a, double b);
}


3. public interface Nothing{
}


****Constructing Lambdas and using them****

behavior parameterization is important, Functional interface can used to pass behaviour.
@FunctionalInterface
public interface BufferedReaderProcessor {
    String process(BufferedReader b) throws IOException;
}


This can be used as an argument to the new processFile method


**Executing the behaviour**

Any lambdas of the form BufferedReader -> String can be passed as arguments, because 
they match the signature of the process method defined in the Buffered-ReaderProcessor interface

You now need only a way to execute the code represented by the lambda inside the body of processFile.
You can therefore call the method process on the
 resulting BufferedReaderProcessor object inside the processFile body to perform the processing:


**Throwing exceptions in lambda**

There are two options
 
 1. Define your own functional interface that declares the checked exception or wrap the lambda with a try catch block
 2. But if you are using functional interface then look at the sample use in Behavior.java
 
 
 **Using local variables**
 
 int portNumber = 1337;
 Runnable r = () -> System.out.println(portNumber);
 
 how ever this variable needs to be final or effectively final. This is because
 lambda gets a copy of the variable instead of the variable it self.
 
 local variable lives on a stack and the variable could have been deallocated
 
 **Method Reference usage**
 
 (args) -> ClassName.staticMethod(args) => ClassName::staticMethod
 
 (arg0,rest) -> arg0.instanceMethod(rest)  arg0 is of type className
 className::instanceMethod
 