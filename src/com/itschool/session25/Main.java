package com.itschool.session25;

import com.itschool.session22.Person;

import java.util.*;
import java.util.function.DoublePredicate;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Main {

    public static void main(String[] args) {
        //collectDemo();
        //traditionalFiltering();
        //functionalFiltering();
        //mappingDemo();
        //arrayAsStream();
        sortedDemo();
    }

    private static void sortedDemo() {
        List<String> names = List.of("ionutz", "gabriel", "baur", "ionutz");
        List<String> sorted = names.stream()
                .sorted(Comparator.comparing(s -> s.length()))
                .toList();

        System.out.println(sorted);
    }

    private static void arrayAsStream() {
        String[] names = {"z", "alin", "ionutzaaaa", "gabriel", "baur"};

        Set<Integer> lengths = Arrays.stream(names)
                .map(str -> str.length())
                .collect(Collectors.toCollection(LinkedHashSet::new));
                //.collect(Collectors.toSet());
        System.out.println(lengths);
    }

    private static Collector toLinkedHashSet() {
        return Collectors.toCollection(() -> new LinkedHashSet<>());
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

        // hack to reuse the declared stream without consuming/closing it - supply it lazy with a Supplier
        Supplier<DoubleStream> doubleStream = () -> people.stream()
                //.mapToDouble(person -> person.getAge())
                .mapToDouble(Person::getAge) // reference the method getAge from Person class - same as above commented
                .filter(age -> age >= 18);

        OptionalDouble avgAsOptionalDouble = doubleStream.get() // retrieve the declared stream from Supplier
                .average(); // work with the stream
        //.getAsDouble();
        double avg = avgAsOptionalDouble.getAsDouble();

        double sum = doubleStream.get() // retrieve again the declared stream from Supplier (but actually creates lazy a new stream)
                .sum(); // work with the stream
        System.out.println(sum);

        // adults age condition
        DoublePredicate adultPredicate = age -> age >= 18;

        // children age condition
        DoublePredicate childrenPredicate = age -> age < 18;
        //      f(doublePredicate) -> double - a function receiving a DoublePredicate as input and returning a Double
        Function<DoublePredicate, Double> functionAvg = doublePredicate -> people.stream() // get a stream of the list's elements (Person objects) - stream of 'Person' elements
                .mapToDouble(Person::getAge) // map each person to their age, age as 'double' - now the stream is of 'double' elements
                .filter(doublePredicate) // filter by the input condition (age is 'double')
                .average() // make the average of the ages (doubles) in the stream, returns an OptionalDouble object
                //.getAsDouble(); // retrieve the value of the above OptionalDouble object as a double
                .orElse(0d); // default value if nothing to compute the average on

        // apply the function for children age condition
        double childAvg = functionAvg.apply(childrenPredicate); // childrenPredicate gets injected in the above filter operation
        System.out.println(childAvg);

        // apply the function for adults age condition
        double adultAvg = functionAvg.apply(adultPredicate); // adultPredicate gets injected in the above filter operation
        System.out.println(adultAvg);

        // average of adults age
        double childrenAvg = people.stream() // get a stream of the list's elements (Person objects) - stream of 'Person' elements
                .mapToDouble(person -> person.getAge()) // map each person to their age, age as 'double' - now the stream is of 'double' elements
                .filter(age -> age < 18) // adult means 18+, so we filter to keep only age >=18 in the stream (age is 'double')
                .average() // make the average of the ages (doubles) in the stream, returns an OptionalDouble object
                .getAsDouble();

        System.out.println(childrenAvg);
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
