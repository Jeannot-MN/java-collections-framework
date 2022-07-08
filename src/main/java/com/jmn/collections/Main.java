package com.jmn.collections;

public class Main {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("Hello1");
        list.add("Hello2");
        list.add("Hello3");
        list.add("Hello4");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
