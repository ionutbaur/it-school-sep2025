package com.itschool.session22;

import java.util.Objects;

public record PersonRecord(String name, int age) {

    // not needed if we want the default (all properties in equals and hashcode), but we can still provide a custom impl if we want
    /*@Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        PersonRecord that = (PersonRecord) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }*/
}
