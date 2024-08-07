//FibonacciDynamic.java
//This will be our dynamic programming solution class


//Austin Stephens
//Rasmussen University
//COT4530C
//Professor Kumar
//Module 06

//Logic for dynamic solution
public class FibonacciDynamic {
    public static long fiboDynamic(int n) {

        //if n is less than or equal to 1, return n
        //this is the base case
        if (n <= 1) {
            return n;
        }

        //initialize variables
        //a is 0, b is 1, c is the sum of a and b
        long a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        //return b which is the sum of a and b
        return b;
    }
}