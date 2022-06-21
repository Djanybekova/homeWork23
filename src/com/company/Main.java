package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();


        for (int i = 0; i < 10; i++) {
            arrayList.add(random.nextInt(0,2));
            Collections.sort(arrayList);
            linkedList.add(random.nextInt(0,2));
            Collections.sort(linkedList);
        }

        System.out.println(arrayList);
        System.out.println(linkedList);

    }
}
