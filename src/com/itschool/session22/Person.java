package com.itschool.session22;

import java.util.Objects;

public class Person {

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
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
