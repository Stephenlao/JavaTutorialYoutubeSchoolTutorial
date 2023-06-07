package com.example.javaTutorial;
//  import the arrayList line 3
import java.util.ArrayList;

//  import the comparator line 6
import java.util.Comparator;
public class arrayLists {
    public static void main(String[] args) {
        // called the variable in arrayLists like line 6
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(5);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);


        // when using arrayList we need to call the variable
        // that have created then called its method

        // remove the index only
        numbers.remove(2);

        // remove the integer 4
        numbers.remove(Integer.valueOf(4));

        // clear all the arraylists
        numbers.clear();


        // in order to using sort, need to
        // call the parameter name Comparator
        // which should be import 'java.util.Comparator'

        // sort in asc
        numbers.sort(Comparator.naturalOrder());

        // sort in desc
        numbers.sort(Comparator.reverseOrder());


        //  return boolean, checking the values exists in arrayLists or not
        System.out.println(numbers.contains(Integer.valueOf(5)));


        // return boolean, check whether arrayLists empty or not
        System.out.println(numbers.isEmpty());

        System.out.println(numbers.toString());


        // for loop in arrayLists
        numbers.forEach(number -> {
            numbers.set(numbers.indexOf(number), number * 2)
            ;
        });

        // return the value of specific index (index 2: 5)
//        System.out.println(numbers.get(2)); // 5
        System.out.println(numbers.toString());



    }
}
