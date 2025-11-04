package com.itschool.session23;

import com.itschool.session22.Child;
import com.itschool.session22.Person;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //sortCustomObjectsInSet();
        //genericsDemo();
        //genericClassDemo();
        sortCustomObjectsInSet();
    }

    private static void genericClassDemo() {
        //              L      M        R                                                L - String   M - Integer   R - Boolean
        GenericClass<String, Integer, Boolean> stringGenericClass = new GenericClass<>("ionutz", 11, true);
        String strVal = stringGenericClass.getLeft(); // since 'left' is a String, retrieve it as String
        Integer middleVal = stringGenericClass.getMiddle(); // 'middle' is an Integer, retrieve it as Integer
        Boolean rightVal = stringGenericClass.getRight(); // 'right' is a Boolean, retrieve it as Boolean
        System.out.println(strVal);

        //             L        M       R                                               L - Person                              M - String    R - Double
        GenericClass<Person, String, Double> integerGenericClass = new GenericClass<>(new Person("ionutz", 22), "ceva", 5.7d);
        Person intVal = integerGenericClass.getLeft(); // 'left' is a Person, retrieve it as Person
        System.out.println(intVal);

        //                  T extends Person (any type that extends Person, including Person. Other types are not accepted)
        GenericLimitedClass<Person> genericLimitedClass = new GenericLimitedClass<>(new Person("ionutz", 22));
        Person personVal = genericLimitedClass.getValue(); // since T is Person (super in the chain), retrieve only as Person
        // Child childVal = genericLimitedClass.getValue(); // won't work, because Person is not a Child (but Child is a Person)

        //                  T extends Person - Child extends Person
        GenericLimitedClass<Child> childGenericLimitedClass = new GenericLimitedClass<>(new Child("gabriel", 10));
        Child child = childGenericLimitedClass.getValue(); // works because T is Child
        Person personChild = childGenericLimitedClass.getValue(); // works because Child is a Person

        //                     T extends Person - String DOES NOT extend Person, thus not allowed, won't compile
        // GenericLimitedClass<String> stringGenericLimitedClass = new GenericLimitedClass<String>("someStr"); // doesn't work
    }

    private static void genericsDemo() {
        List rawList = new ArrayList(); // raw list, not type safe - can add mixed values and have no rules over the contained elements
        rawList.add("ionutz");
        rawList.add(11);
        rawList.add(true);

        String firstEl = (String) rawList.getFirst(); // compiles, works at runtime, but ugly and not type safe (requires casting)
        // String lastEl = (String) list.getLast(); // compiles, but won't work at runtime because the last element is a boolean

        //System.out.println(lastEl);
        //     E
        List<String> stringList = new ArrayList<>(); // List of Strings
        stringList.add("ionutz"); // can add only Strings, because E is String
        stringList.add("gabriel");
        // stringList.add(12); // does not compile - 12 is not a String
        printListElements(stringList); // apply the generic method on a list of Strings

        String firstStrEl = stringList.getFirst(); // retrieve only as String, because E is String
        // Integer firstIntEl = stringList.getFirst(); // does not compile, elements in the list are only of type String

        //     E
        List<Integer> integerList = new ArrayList<>(); // List of Integers... may be list of any E type
        integerList.add(12); // can add only Integers (or primitive int values - unboxing), because E is Integer
        printListElements(integerList); // apply the generic method on a list of Integers

        System.out.println("==================");

        Integer firstIntEl = integerList.getFirst(); // retrieves only as Integer or int, because E is Integer
        int firstElAsPrimitive = integerList.getFirst(); // unboxing works too

        String[] strings = {"ionutz", "gabriel", "baur"};
        Integer[] integers = {1, 2, 3};

        printArrayElements(strings); // apply the generic method on an array of Strings
        System.out.println("=============");
        printArrayElements(integers); // apply the generic method on an array of Integers
    }

    // generic method of type A (any type)     param is an array of type A (array of any Type)
    private static <A> void printArrayElements(A[] array) {
        for (A el : array) {
            System.out.println(el);
        }
    }

    private static <E> void printListElements(List<E> list) {
        for (E el : list) {
            System.out.println(el);
        }
    }

    private static void sortCustomObjectsInSet() {
        //Set<Person> people = new TreeSet<>(); // sorted type must either implement Comparable interface
        // or use a custom Comparator, see below - functional programming paradigm
        Set<Person> people = new TreeSet<>(Comparator.comparing(Person::getName) // sort this TreeSet by comparing the Person names first
                .thenComparing(Person::getAge, Comparator.reverseOrder())); // then compare Person ages in reverse order if Persons have the same name

        Person person1 = new Person("ionutz", 34);
        Person person2 = new Person("gabriel", 50);
        Person person3 = new Person("ionutz", 60);
        Person person4 = new Person("alina", 20);

        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        System.out.println(people);
        // 4 2 6 1 9 - sort the numbers by comparing them with each other
        // 1 2 4 6 9

        //Set<Integer> integerSet = new TreeSet<>(); // works because Integer implements Comparable interface
    }
}
