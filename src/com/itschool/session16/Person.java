package com.itschool.session16;

public sealed class Person permits Student, Professor {
    
    protected int age;
    protected String name;
}
