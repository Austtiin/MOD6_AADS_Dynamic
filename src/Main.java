//main.java
//This will be our main class to the program

//Austin Stephens
//Rasmussen University
//COT4530C
//Professor Kumar
//Module 06

//Instructions
//Write a Java program that determines, given a number n, the nth Fibonacci number.
// Provide two solutions, one that implements a recursive algorithm and another that implements a dynamic programming solution.
// For your test cases set n = 10, n= 50 and n = 70 and monitor the performance.
// Report on your findings noting how your results compare to the known big O for each of the algorithms.

//We will have four classes in this program
//Main.java
//Fibonacci.java
//FibonacciDynamic.java
//TestCases.java

//Main.java will be the main class that will run the program
//Fibonacci.java will be the class that will have the recursive algorithm
//FibonacciDynamic.java will be the class that will have the dynamic programming solution
//TestCases.java will be the class that will have the test cases

//We separate the classes to make the program more organized and easier to read

//logic for main class
//Main class will run the program

public class Main {
    public static void main(String[] args) {

        //Start the program
        System.out.println("Starting program...");

        //Test numbers before running the test cases
        try {
            System.out.println("Setup / System Test: Fibonacci of 10: " + Fibonacci.RecursiveFib(10));
        } catch (Exception e) {
            System.out.println("An error occurred testing Fibonacci: " + e.getMessage());
        }finally {
            System.out.println("Completed testing Fibonacci of 10\n\n");
        }

        //Run the test cases, try catch block to catch any exceptions
        try {
            TestCases.runTests();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        //exit the program
        System.out.println("Exiting program...");
        System.exit(0);
    }
}