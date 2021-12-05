package testRun;

import testRun.*;

import java.util.Arrays;
import java.util.Random;

public class Execute {
    public static void main(String [] args){
        Week1 objHW1 = new Week1();
        objHW1.intVariables();
        objHW1.printText();
        objHW1.boolVariables();
        objHW1.charVariables();
        objHW1.floatVariables();
        objHW1.strVariables();
//This is the method value of the method parameter in Class: Week1
        int numbers = objHW1.addNumbers(23,34);
        System.out.println("Total is: " + numbers);

//This is While Loop Array
        LearnLoop loop = new LearnLoop();
        loop.WhileLoop();

//This is For Loop Array
        LearnLoop loop1 = new LearnLoop();
        loop1.forLoop();

//This is For Do-While Loop Arry
        LearnLoop loop2 = new LearnLoop();
        loop2.DoWhileLoop();

//This is for If Condition
        LearnConditionalStatements ifCondition = new LearnConditionalStatements();
        ifCondition.IfStatements();

//This is for If Else Condition
        LearnConditionalStatements statement = new LearnConditionalStatements();
        statement.IfElseStatements(40);

//This is for Nested If Statement
        LearnConditionalStatements nestIfStatement = new LearnConditionalStatements();
        nestIfStatement.nestIfStatements();

//This is for Switch If Statement
        LearnConditionalStatements switchStatement = new LearnConditionalStatements();
        switchStatement.switchStatement('K');

// This is a Conditional Operator Example
        LearnConditionalStatements conditionalOperator = new LearnConditionalStatements();
        conditionalOperator.conditionalOperators();

// This is an Array
        LearnArray stringArray = new LearnArray();
        stringArray.LeanArray();

// This is a While Loop Array
        LearnArray stringWhileArray = new LearnArray();
        stringWhileArray.stringWhileArray();

// This is a Sorting an Array
        LearnArray sortArray = new LearnArray();
        sortArray.sortArray();

// This is a List Array
        LearnArray listArray = new LearnArray();
        listArray.listArray();

// This is Converting Array to List
        LearnArray learnArray = new LearnArray();
        learnArray.convertArrayToList();
// This is converting that list back to Array after making changes to the list.
        learnArray.convertListToArray();

// This is String Method
        LearnStringMethods methods = new LearnStringMethods();
        methods.learnIndexOff();

//This is to split an array by ","
        LearnStringMethods split = new LearnStringMethods();
        split.splitArray();

// This is Homework Problem 1
        homeWork homeHW1 = new homeWork();
        int [] a = {1,2,3};
        int [] b = {2,3,4};

        homeHW1.arrayFirstElement(new int[]{1, 2, 3}, new int[]{2, 3, 4});
        System.out.println(Arrays.toString(homeHW1.arrayFirstElement(new int[]{1, 2, 3}, new int[]{2, 3, 4})));


// This will allow us to generate a random #

        //create an instance of Random class
        Random rand = new Random();

        //Generate random integers in range 0 to 999
        int rand_int1 = rand.nextInt(1000);
        int rand_int2 = rand.nextInt(1000);

        //Print random integers
        System.out.println("Random Integers: " + rand_int1);
        System.out.println("Random Integers: " + rand_int2);

        //Generate random doubles
        double rand_dub1 = rand.nextDouble();
        double rand_dub2 = rand.nextDouble();

        //Print random doubles
        System.out.println("Random Doubles: " + rand_dub1);
        System.out.println("Random Doubles " + rand_dub2);

// This is me retrying HW1 Problem 1
        HW hw1 = new HW();
        int [] c = {1,3,5,7};
        int [] d = {2,4,6,8};
        System.out.println("Problem 1 answer is: " + Arrays.toString(hw1.arrayFirstElement(c,d)));

// This is me trying HW1 Problem 2
        HW hw1b = new HW();
        int [] e = {1,2,3,4,5,6,7,8};
        System.out.println("Problem 2 answer is: " + Arrays.toString(hw1b.arrayMiddle(e)));

        // This is me trying HW1 Problem 3
        HW hw1c = new HW();
        int [] f = {1,2,3,4,5,6,7,8};
        System.out.println("Summation answer: " + (hw1c.arraySummation(f)));

//    LearnLoop learnLoop = new LearnLoop();
//    learnLoop.forLoop1();

//        {
//      int a = 123;
//      int b = 456;
//      String str1 = Integer.toString(a);
//      String str2 = Integer.toString(b);
//      System.out.println("String str1 = " + str1);
//      System.out.println("String str2 is: " + str2);
//      System.out.println(str1 + str2);
//        }


        //This is a method argument.  In order to call this we used the sumValue for class addNumbers
        // int sumValue = objHW1.addNumbers();
        //  System.out.println("Calling another method: " + sumValue);

    }


    //     System.out.println("Hello World!");
    //     System.out.println("Leaning java in Class!");



    private static void returnText() {

    }
}
