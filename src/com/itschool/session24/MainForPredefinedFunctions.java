package com.itschool.session24;

import com.itschool.session22.Person;

import java.util.List;
import java.util.function.*;

public class MainForPredefinedFunctions {

    private static int num1 = 30;
    private static int num2 = 50;

    public static void main(String[] args) {
        functionDemo();
        //supplierDemo();
        //consumerDemo();
        //predicateDemo();
    }

    private static void functionDemo() {
        //        input   result
        //          T       R                       f(x) = x * x // x = 5 -> 25
        Function<Integer, Integer> myFunction = x -> x * x; // same as below UnaryOperator
        Integer result = myFunction.apply(5);
        System.out.println(result);

        UnaryOperator<Integer> myUnaryOperator = x -> x * x; // a Function with input and result of same type
        myUnaryOperator.apply(4);

        //         T        R                      f(String) = length of string
        Function<String, Integer> strIntFunction = str -> str.length();
        Integer strLength = strIntFunction.apply("ionutz");
        System.out.println(strLength);

        //                                                      f(x,y) = x + y // (x = 5, y = 10) -> 15
        BiFunction<String, Double, Integer> myBiFunction = (x, y) -> (int) (x.length() + y); // a grade 2 function - x is String, y is Double, the result is Integer
        Integer result2 = myBiFunction.apply("ionutz", 20.4);
        System.out.println(result2);

        // f(a1,a2) = a1.getWeight() + a2.getWeight())
    }

    private static void supplierDemo() {
        Supplier<Integer> integerSupplier = () -> num1 + num2;
        Integer integerObj = integerSupplier.get();
        int integerPrimitive = integerSupplier.get();

        System.out.println(integerObj);
        System.out.println(integerPrimitive);
    }

    private static void consumerDemo() {
        Consumer<Integer> integerConsumer = (num) -> someMethod(num);
        integerConsumer.accept(10);

        Consumer<Integer> integerConsumer2 = num -> anotherMethod(num);

        consumerMethod(integerConsumer); // pass any Consumer<Integer> as param, that may reference even methods (see above)

        List<String> list = List.of("ionutz", "gabriel");
        list.forEach(s -> System.out.println("The string is: " + s));
    }

    private static void consumerMethod(Consumer<Integer> consumer) {
        System.out.println("tralllaaa");
        consumer.accept(5);
    }

    private static void someMethod(Integer number) {
        System.out.println("The number from someMethod is: " + number);
    }

    private static void anotherMethod(Integer number) {
        System.out.println("The number of anotherMethod is: " + number);
    }

    private boolean test(int number) {
        return number % 2 == 0;
    }

    private static void predicateDemo() {
        //                                  f(number) -> is number even? (result is a boolean true or false)
        Predicate<Integer> predicate = number -> number % 2 == 0; // impl of Predicate's functional interface ('test' method )
        boolean isEven = predicate.test(5); // apply the above implemented method - we are testing the number 5
        System.out.println(isEven);

        //                                      f(person) -> is length of person's name higher than 7?
        Predicate<Person> personPredicate = person -> person.getName().length() > 7;
        Person person = new Person("ionutzgabriel", 34);
        boolean result = personPredicate.test(person); // we are testing the above Person obj with the implemented logic
        System.out.println(result);

        //                                          f(List<String>) -> boolean result returned by 'myMethod'
        Predicate<List<String>> listPredicate = strings -> myMethod(strings);
        boolean isListOk = listPredicate.test(List.of("el1", "el2")); // test some list
    }

    private static boolean myMethod(List<String> strings) {
        for (String str: strings) {
            if (str.length() > 10) {
                return true;
            }
        }

        return false;
    }

}
