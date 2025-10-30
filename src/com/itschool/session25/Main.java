package com.itschool.session25;

import com.itschool.session22.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        //collectDemo();
        //traditionalFiltering();
        //functionalFiltering();
        mappingDemo();
    }

    private static void mappingDemo() {
        List<String> names = List.of("ionutz", "gabriel", "baur", "ionutz");

        List<Integer> lengths = names.stream() // get a stream of the list's elements (Strings)
                .map(str -> str.length()) // transform/map the stream Strings to their length (int/Integer)
                .toList(); // accumulate the mapped elements of the stream into a List
        System.out.println(lengths);

        List<Person> people = new ArrayList<>();
        Person p1 = new Person("ionutz", 18);
        Person p2 = new Person("kid", 5);
        Person p3 = new Person("kid2", 15);
        Person p4 = new Person("gabriel", 25);
        Person p5 = new Person("baur", 34);

        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);

        // average of adults age
        double avg = people.stream() // get a stream of the list's elements (Person objects) - stream of 'Person' elements
                .mapToDouble(person -> person.getAge()) // map each person to their age, age as 'double' - now the stream is of 'double' elements
                .filter(age -> age >= 18) // adult means 18+, so we filter to keep only age >=18 in the stream (age is 'double')
                .average() // make the average of the ages (doubles) in the stream, returns an OptionalDouble object
                .getAsDouble(); // retrieve the value of the above OptionalDouble object as a double
                //.orElse(0d);

        System.out.println(avg);
    }

    private static void functionalFiltering() {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        List<Integer> evenList = list.stream() // get a stream of the list's elements
                .filter(element -> element % 2 == 0) // keep/filter only the even elements in the stream
                .toList(); // accumulate the elements of the stream into a List

        System.out.println(evenList);

        List<String> list2 = new ArrayList<>();
        list2.add(null);
        list2.add(null);
    }

    private static void traditionalFiltering() {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        List<Integer> evenList = new ArrayList<>();
        for (int element : list) {
            if (element % 2 == 0) {
                evenList.add(element);
            }
        }

        System.out.println(evenList);
    }

    private static void collectDemo() {
        List<String> names = List.of("ionutz", "gabriel", "baur", "ionutz");
        Set<String> namesSet = names.stream() // get a stream of the list's elements
                .collect(Collectors.toSet()); // collect the elements from the stream to a Set

        System.out.println(namesSet);
    }
}
