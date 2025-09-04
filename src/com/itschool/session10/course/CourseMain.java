package com.itschool.session10.course;

public class CourseMain {

    public static void main(String[] args) {
        boolean primitiveBool = true;
        Boolean objectBool = true;

        int a = 1;
        int b = 2;
        int sum = a + b;

        // int nullInt = null; won't work

        Integer objectNumber = 2; // autoboxing : primitive 2 -> Integer obj

        Integer intNumObj = Integer.valueOf(objectNumber);
        int intNumPrimitive = intNumObj; //auto-unboxing: obj -> int primitive

        Integer nullInteger = null;

        System.out.println(a);
        System.out.println(objectNumber);
        System.out.println(nullInteger);

        String objectNumberAsString = objectNumber.toString();
        System.out.println("Object number as a String is: " + objectNumberAsString);

        String numberAsString = nullInteger.toString();
        System.out.println(numberAsString);

        Byte byteObj = 1;
    }
}
