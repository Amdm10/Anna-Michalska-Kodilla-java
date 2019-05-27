package com.kodilla.testing.collection;
import java.util.ArrayList;

public class OddNumbersExterminator {

    ArrayList<Integer> even;

    public OddNumbersExterminator() {
        even = new ArrayList<Integer>();
    }

    public void exterminate(ArrayList<Integer> numbers) {
        for(int i=0;i<numbers.size();i++)
            if (numbers.get(i) % 2 == 0) {
                even.add(numbers.get(i));
            }
    }
}
