package com.arraylist1;

import java.util.ArrayList;
import java.util.Comparator;

public class ExampleArrayListMethods {

	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<>();
//		add() -> inserts the element to the ArrayList
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		number.add(5);
		System.out.println("add()\noutput for 'number' : "+ number);
		System.out.println();
		ArrayList<Integer> number1 = new ArrayList<>();
//		addAll() -> adds all elements of a collection to ArrayList
//		syntax:
//		-------
//		add all elements from number to number1
		number1.addAll(number);
		System.out.println("addAll()\noutput for 'number1' : "+ number1);
		System.out.println();
//		clear() -> removes all the elements from arraylist
		number1.clear();
		System.out.println("clear()\noutput for 'number1' : "+ number1);
//		(ArrayList<Integer>) - converts value returned by clone() into an arraylist of Integer type (To learn more, visit Java Typecasting)
		ArrayList<Integer> cloneNumber = (ArrayList<Integer>)number.clone();
        System.out.println("clone()\noutput for 'number' " + cloneNumber);
//        number.clone() - returns a copy of the object number
        System.out.println("clone()\noutput for 'number'" + number.clone());
        System.out.println();
//       contains() -> checks if the element is present in the arraylist, it will return only true or false
        System.out.println("contains()\noutput for 'number' : "+number.contains(3));
        System.out.println();
//        get() -> returns the element present in the specified index
        System.out.println("get()\noutput for 'number' : "+number.get(2));
        System.out.println();
//        indexOf() -> returns the position of the specified element
        System.out.println("indexOf()\noutput for 'number' : "+number.indexOf(4));
        System.out.println();
//        removeAll() -> removes multiple elements from the arraylist
        ArrayList<Integer> number2 = new ArrayList<>();
        number2.add(2);
        number2.add(4);
        number.removeAll(number2);
        System.out.println("number2 : "+number2);
        System.out.println("removeAll()\noutput for 'number' : "+number);
        System.out.println();
//        remove() -> removes the single element from the arraylist
        System.out.println("remove()\noutput for 'number' : "+number.remove(1));
        System.out.println();
//        size() -> returns the length of an arraylist
        System.out.println(number);
        System.out.println("size()\noutput for 'number' : "+number.size());
        System.out.println();
//        isEmpty() -> checks if the arraylist is empty
        System.out.println("isEmpty()\noutput for 'number' : "+number.isEmpty());
        System.out.println();
        number.add(2);
        number.add(4);
        number.add(6);
        System.out.println(number);
//        subList() -> returns a portion of the arraylist
        System.out.println("subList()\noutput for 'number' : "+number.subList(2, 5));
        System.out.println();
//        set() -> replace the single element from an arraylist
        number.set(3, 9);
        System.out.println("set()\noutput for 'number' : "+number);
        System.out.println();
//        Sort() -> sorts the arraylist according to specified order
//        The sort() method sorts the elements in an arraylist according to the specified order.
        number.sort(Comparator.naturalOrder());
        System.out.println("sort(Comparator.naturalOrder())\noutput for 'number' : "+number);
        number.sort(Comparator.reverseOrder());
        System.out.println("sort(Comparator.reverseOrder())\noutput for 'number' : "+number);
        System.out.println();
//        toArray() -> converts an arraylist to an array
        number2.add(2);
        number2.add(3);
        System.out.println(number2);
        number2.toArray();
        for(Integer integer :number2) {
        	System.out.println("toArray()\noutput for 'number2' : "+integer);
        }
        System.out.println();
//        toString() -> converts the arraylist into a String
        System.out.println("toString()\noutput for 'number1' : "+number2.toString());
        System.out.println();
        
	}

}
