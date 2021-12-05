package testRun;

public class LearnStringMethods {
    //How to find the position index value of any word in a string
    public void learnIndexOff() {
        String myStr = "Hello planet earth, you are a great planet. Dividing an int by another planet int returns an int result. To get an accurate average planet, we first cast sum to double. Java Array has a length field which stores the number of elements in the array";
        System.out.println(myStr.indexOf("to"));
//This print line allows us to skip over the 1st planet & find the next planet
        System.out.println(myStr.indexOf("to", 15));
//If the search String is unable to find then it will return -1
        System.out.println(myStr.indexOf("practice"));

// How to get the total count of a string. Bellow its counting the empty spaces.
        String spaceCount = "            ";
        System.out.println("Length of Empty String: " + spaceCount.length());

// I left off at 57min of Day 1 of week 2 Java

    }


    public void splitArray() {
        String fruits = "apple, orange, pear, grape, asian pear, pineapple, banana";
        String[] fruitName = fruits.split(",");
        for (String names : fruitName) {
            System.out.println("Fruit name is: " + names);
        }

    }






}
