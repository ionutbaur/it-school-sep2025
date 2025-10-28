package com.itschool.session24;

public class Main {

    public static void main(String[] args) {
        //traditional();
        //anonymousClass();
        lambda();
    }

    private static void lambda() {
        // given two Strings named 'a' and 'b' as inputs,
        //                                     f(a,b) -> a.length() + b.length()
        SimpleOperation simpleOperation = (a, b) -> a.length() + b.length(); // impl of functional interface (sumOfStringsLength method)
        int result = simpleOperation.sumOfStringsLength("ionutz", "baur"); // apply the above implemented method
        System.out.println(result);
    }

    private static void anonymousClass() {
        SimpleOperation simpleOperation = new SimpleOperation() { // no class impl - anonymous
            @Override
            public int sumOfStringsLength(String a, String b) { // forced impl of the methods directly here
                return a.length() + b.length();
            }

            /*@Override
            public String someMethod(int param) {
                return "altceva";
            }*/
        };

        int result = simpleOperation.sumOfStringsLength("ionutz", "baur"); // apply the above implemented method
        System.out.println(result);
    }

    private static void traditional() {
        SimpleOperation simpleOperation = new SimpleOperationImpl(); // classic impl through concrete class
        int result = simpleOperation.sumOfStringsLength("ionutz", "baur"); // apply the interface method
        System.out.println(result);
    }
}
