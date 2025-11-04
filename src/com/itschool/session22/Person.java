package com.itschool.session22;

import java.util.Objects;

// no need to implement Comparable if using a Comparator
public class Person /*implements Comparable<Person>*/ {

    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }
    // we say it is the same Person if it has the same age and name ^^ (above 'equals()' method),
    // and if is identified as the same in memory (has the same hashcode - below 'hashCode()' method)
    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    /**
     * implementation for {@link Comparable#compareTo(Object)} - see its javadoc
     */
    // unnecessary when sorting with a Comparator
    /*@Override
    public int compareTo(Person that) { // criteria of comparing Person objects in order to sort them
        int result = this.name.compareTo(that.name); // compare this with that - natural (ascending) order
        if (result == 0) { // same name, then compare the ages
            return Integer.compare(that.age, this.age); // compare that with this - reversed (descending) order
        }

        return result; // negative value: less than, positive value: greater than, 0: equal
    }*/
}
