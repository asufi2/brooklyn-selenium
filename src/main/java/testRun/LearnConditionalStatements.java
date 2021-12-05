package testRun;

public class LearnConditionalStatements {

    // How to use Conditional Statements
// If Statement
// If the condition is true then perform conditional code and if the condition is false do then something else
// If Condition Syntax
// if(Booelean_expression){
// // Statements will execute if the Boolean expression is true
// }
    public void IfStatements() {
        int c = 10;
        // If c value is less than 20 then print the value
        if (c < 20) {
            System.out.println("This is if statement");
        }

    }

    // How to If Else Statements
// If Else Statement
// If statement can be follow by an optional else statment, which executes when the Boolean expression is false
// If Else Syntax
// if(Booelean_expression){
// // Executes when the Boolean expression is true
// }else{
// // Executes when the Boolean expression is false
// }
    public void IfElseStatements(int b) {
        // If b value is less than 20 then print the value
        if (b < 31) {
            System.out.println("This is If Else true Statement");
        } else {
            System.out.println("This is If Else false Statement");
        }
    }
    // How to create Nested If Statements
//
// It is always legal to nest if-else statements which means you can use one if or else if statement inside another if or else if statement
// Nested If Syntax
// if(Booelean_expression 1){
// // Executes when the Boolean expression 1 is true
// if(Booelean_expression 2){
// // Executes when the Boolean expression 2 is true
// }
    public void nestIfStatements() {

        int a = 30;
        int d = 10;
        // If b value is less than 20 then print the value
        if (  a < 40) {
            if ( d < 35 ) {
                System.out.println("a = " + a + " and d = " + d);
            }
        }
    }
    // How to write a switch Statement
// Breaks in Switch statements helps saves time.
// A switch statement allows a variable to be tested for equality against a list of values.
// Each value is called a case, and the variable being switched on is checked for each case.
// *Code runs until it finds the grade then hits a break if it doesn't find the grade it will go on otherwise stop at the break.
// Print results based on the grade
    public void switchStatement(char grade){
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
            case 'C':
                System.out.println("Well Done");
                break;
            case 'D':
                System.out.println("You Passed");
                break;
            case 'F':
                System.out.println("You Failed");
                break;
            default:
                System.out.println("Invalid grade: " + grade);
        }
    }

// How to use If Else Condition
// This is similar to the switch statement

    public void printGrades (char grade){
        if(grade == 'A') {
            System.out.println("Excellent");
        } else if (grade == 'B') {
            System.out.println("Well done");
        } else if (grade == 'C') {
            System.out.println("Well done");
        } else if (grade == 'D') {
            System.out.println("You Passed");
        } else if (grade == 'F') {
            System.out.println("Better try again");
        } else {
            System.out.println("Invalid grade");
        }
        System.out.println("Your grade is: " + grade);
    }

// Conditional Operator (?:)
// There are few other operators supported by Java Language
// Conditional operator is also known as the ternary operator.  This operator
// consists of three operands and is used to evaluate Boolean expressions.
// The goal of the operator is to decide, which value should be assigned to the variable.
// The operator is written as -
// variable x = (Boolean_expression) ? value if true : value if false

    public void conditionalOperators()
    {
        int a, b;
        a = 10;
        //True condition
        b = (a == 1) ? 20: 30;
        System.out.println("This is Conditional Operator true.  Value of b is: " + b);
        //False condition
        b = (a == 10) ? 20: 30;
        System.out.println("This is Conditional Operator false.  Value of b is: " + b);
    }





}