package com.itschool.session22;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        customObjectClassDemo();
        //customObjectRecordDemo();
    }

    private static void customObjectRecordDemo() {
        Set<PersonRecord> personRecords = new HashSet<>();

        PersonRecord person1 = new PersonRecord("ionutz", 39);
        PersonRecord person2 = new PersonRecord("gabriel", 50);
        PersonRecord person3 = new PersonRecord("ionutz", 34);

        personRecords.add(person1);
        personRecords.add(person2);
        personRecords.add(person3);

        System.out.println(personRecords);
        System.out.println(personRecords.size());
    }

    private static void customObjectClassDemo() {
        Set<Person> people = new HashSet<>();

        Person person1 = new Person("ionutz", 34);
        Person person2 = new Person("gabriel", 50);
        Person person3 = new Person("ionutz", 34);

        Person person4 = null;
        // System.out.println(person4.equals(null)); // error - cannot invoke any method on a null object - person4 is null
        System.out.println(person1.equals(null)); // always returns false for a non-null object on which we apply 'equals(null)'

        people.add(person1);
        people.add(person2);
        people.add(person3);

        System.out.println(people);
        System.out.println(people.size());

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);

        boolean listContainsIonutz34 = personList.contains(person3);
        System.out.println(listContainsIonutz34);

        System.out.println("person1 hashcode: " + person1.hashCode());
        System.out.println("person2 hashcode: " + person2.hashCode());
        System.out.println("person3 hashcode: " + person3.hashCode());
    }
}
