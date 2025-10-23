package com.itschool.session23;

import com.itschool.session22.Person;
//                               T can be only Person or subtypes of Person (e.g. Child)
public class GenericLimitedClass<T extends Person> {

    private T value;

    public GenericLimitedClass(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
