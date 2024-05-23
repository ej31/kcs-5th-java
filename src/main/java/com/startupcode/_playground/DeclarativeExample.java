package com.startupcode._playground;

import java.util.Arrays;
import java.util.List;

public class DeclarativeExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Root", "이영희", "박영수", "김영수", "이철수");

        List<String> result = names.stream()
                .map(String::toLowerCase)
                .filter(name -> name.startsWith("Root"))
                .map(String::toUpperCase)
                .toList();
        result.forEach(System.out::println);
    }
}