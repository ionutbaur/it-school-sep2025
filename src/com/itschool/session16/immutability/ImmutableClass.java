package com.itschool.session16.immutability;

public final class ImmutableClass {

    private final String field1;
    private final String field2;

    public ImmutableClass(String field1, String field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public String getField1() {
        return field1;
    }

    /*private void setField1(String field1) {
        this.field1 = field1;
    }*/

    public String getField2() {
        return field2;
    }

    /*private void setField2(String field2) {
        this.field2 = field2;
    }*/

    public void printFields() {
        /*setField1("itschool");
        setField2("curs");*/
        System.out.println(field1);
        System.out.println(field2);
    }

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "field1='" + field1 + '\'' +
                ", field2='" + field2 + '\'' +
                '}';
    }
}
