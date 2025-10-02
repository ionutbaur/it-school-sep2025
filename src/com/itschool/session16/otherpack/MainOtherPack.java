package com.itschool.session16.otherpack;

public class MainOtherPack {

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = s1;
        s2 = "ionutz";

        System.out.println(s1);
        System.out.println(s2);

        StringBuilder stringBuilder1 = new StringBuilder("azor");
        StringBuilder stringBuilder2 = stringBuilder1;
        stringBuilder2 = new StringBuilder("grivei");

        System.out.println(stringBuilder1);
        System.out.println(stringBuilder2);

        KeyValuePair keyValuePair1 = new KeyValuePair("key1", "value1");
        KeyValuePair keyValuePair2 = keyValuePair1;
        keyValuePair2.setKey("key3");
        keyValuePair2.setValue("value3");

        System.out.println(keyValuePair1);
        System.out.println("=============");
        System.out.println(keyValuePair2);

    }
}
