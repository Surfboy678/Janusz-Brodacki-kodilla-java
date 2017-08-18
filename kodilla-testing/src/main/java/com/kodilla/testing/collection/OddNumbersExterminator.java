package com.kodilla.testing.collection;
import java.util.ArrayList;
import java.util.Random;

public class OddNumbersExterminator {

    ArrayList<Integer> list = new ArrayList<Integer>();

    public void exterminate(ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                list.add(numbers.get(i));
            }
        }
        System.out.println("List size:" + numbers.size());
        System.out.println("Even numbers:"+ list.size());
    }

    public ArrayList<Integer> getEvenNumbers() {
        return list;
    }
}