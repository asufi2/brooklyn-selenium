package testRun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LearnArray {
    // This is an example of an Array
// An array is used to store a collection of data, but it is often more useful to think of an array as a collection of variables of the same type.
// Instead of declaring individual variables, such as number0, number1,...., and number99, you declare one array variable such as numbers and use number[0], number[1],...., number[99] to represent individual variables.
// Syntax of Array:
// dataType[] nameOfArray; // preferred way
// Example:
// String[]myList; // preferred way
    public void LeanArray() {
        String[] statesName = {"Florida", "California", "Georgia", "Texas", "New York"};
        for (int i = 0; i < statesName.length; i++) {
            System.out.println("Array state name is: " + statesName[i]);
        }
    }

    // Another way to do the above as a while loop
    public void stringWhileArray() {
        String[] statesName = {"Florida", "California", "Georgia", "Texas", "New York"};
        int index = 0;
        while (index < statesName.length) {
            System.out.println("Array via While Loop, State name is: " + statesName[index]);
            index++;
        }
//  This line can turn this into a For Loop
//        for (int index = 0; index < statesName.length;index++)
    }

    //How to Sort in an Array
    public void sortArray() {
        String[] sortStatesName = {"Florida", "California", "Georgia", "Texas", "New York"};
        //Ascending order
        Arrays.sort(sortStatesName);
        //Descending Order
        // Arrays.sort(sortStatesName, Collections.reverseOrder());
        System.out.println(Arrays.toString((sortStatesName)));
    }


// What is List?
// List is also one kind of Array but the big difference with Array is in List you can add value, remove value, modify value anytime you want to without replacing existing value.
// Example, lets say you have a list with value, "Florida", "California", "Texas" and you want to add few more states into the same list then you can
// add easily do that but in Array if you do that then you need to remember the array location which can lead to erroneous situation.

    public void listArray() {
        List<String> lists = new ArrayList<>();

        lists.add("One");
        lists.add("Two");
        lists.add("Three");
        lists.add("Four");

        //System.out.Println(lists);

//        for(String list : lists){
//            System.out.println("Printed value of list is: " + list);
//        }

        for (int i = 0; i < lists.size(); i++) {
            System.out.println("Print value of list in For loop Array is: " + lists.get(i));
        }

// How to remove from the list and add new ones then printing out the whole new list
        lists.remove("Two");
        lists.add("Five");

//        for (String list : lists) {
        System.out.println(lists);
    }
    List<String> list;
    String[] array;

    //Creating Array
    public void convertArrayToList() {
        //array & list are globally set outside the method, and thus we write this way
        array = new String[]{"Jave", "Python", "Php", "Ruby", "C++"};
        System.out.println("Printing Array: " + Arrays.toString(array));
        //Converting Array to List
        list = new ArrayList<>();
        for(String language : array) {
            list.add(language);
        }

        System.out.println("Printing List: " + list);

        list.add("Visual Basic");
        list.add("VBScript");

        System.out.println("Printing List after adding new languages: " + list);
    }

    public void convertListToArray() {
        array = list.toArray(new String[list.size()]);
        System.out.println("Printing Array : " + Arrays.toString(array));

    }


}


// Homework Problem 1

//    public void setArrayJoin() {
//
//        int[] array1 = {1, 3, 5, 7, 9};
//        int[] array2 = {2, 4, 6, 8, 10};
//        int[] arrayJoin = (array1).push(array2);
//
//        {
//            System.out.println("Homework Problem 1 is: " + arrayJoin);
//        }
//    }

