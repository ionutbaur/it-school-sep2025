package com.itschool.session24;

import com.itschool.session22.Person;

import java.util.List;
import java.util.function.Predicate;

public class MainForPredefinedFunctions {

    public static void main(String[] args) {
        //functionDemo();
        predicateDemo();
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

    private static void functionDemo() {
        // f(x) = x * x // x = 5 -> 25

        // f(x,y) = x + y // (x = 5, y = 10) -> 15

        // f(a1,a2) = a1.getWeight() + a2.getWeight())
    }
}
