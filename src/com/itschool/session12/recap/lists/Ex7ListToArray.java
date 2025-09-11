package com.itschool.session12.recap.lists;

import java.util.Arrays;
import java.util.List;

public class Ex7ListToArray {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        v1(list);
        v2(list);
    }

    private static void v1(List<Integer> list) {
        Integer[] array = list.toArray(new Integer[0]);

        System.out.println(Arrays.toString(array));
    }

    private static void v2(List<Integer> list) {
        Integer[] array = new Integer[list.size()];
        list.toArray(array);

        System.out.println(Arrays.toString(array));
    }
}
