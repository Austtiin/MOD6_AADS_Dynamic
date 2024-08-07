//Fibonacci.java
//This will be our recursive algorithm class

//Austin Stephens
//Rasmussen University
//COT4530C
//Professor Kumar
//Module 06

//Logic for recursive algorithm
public class Fibonacci {
    public static long RecursiveFib(int n) {

        //Simple base case
        if (n <= 1) {
            return n;
        }

        //we just return the sum of the two previous numbers
        return RecursiveFib(n - 1) + RecursiveFib(n - 2);
    }
}