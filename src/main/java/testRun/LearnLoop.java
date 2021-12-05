package testRun;

public class LearnLoop {
    //A While loop allows you to execute a statement multiple times and follows this format.
// A while loop uses a Boolean expression thus its only true or false.
// If will only trigger if its true.
// A While Loop must have an exit criteria otherwise it will freeze your computer (x++;)
    // While loop syntax:
    // while(Boolean_expression){
    // //Statements
    // }
    public void WhileLoop()
    // Print numbers from 11 to 20
    {int x = 10;
        while ( x < 20 ){
            System.out.println("Value of x: " + x);
            x++;
        }

    }

//    public void whileloop2(){
//        // Print this batch of string statements multiple times
//        System.out.println("I am in NYC");
//        System.out.println("I live in NYC");
//        System.out.println("I work as an engineer");
//    }

    //For Loop Example
// For loop syntax:
// for(initialization;Boolean_expression; update)
// {
// // Statements
// }
    public void forLoop(){
        // Print numbers from 11 to 20
        for(int y = 10; y <= 20; y++){
            //I can print the below string 10 times by adding the below println
            //    System.out.println("I am in NYC");
            // Or I can print numerical values
            System.out.println("Value of y: " + y);
        }
    }

    //Do--While Loop Syntax
    // do{
    //   //Statements
    //   }while(Boolean_expression);

    // Do-While Loop example
// Similar to a while loop, but it's guaranteed to run at least one time.
    public void DoWhileLoop()
    {
        // Print 20 through 30
        int z = 20;
        do {
            System.out.println("Value of z is: " + z );
            z++;
        }while(z < 31 );
    }

    public void forLoop1(){
        for(int a = 10; a < 20; a = a + 3){
            System.out.println("This is for loop Value" + a);
        }
    }
}



