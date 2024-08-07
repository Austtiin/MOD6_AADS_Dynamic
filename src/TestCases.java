//TestCases.java
//This will be our test cases class

//Austin Stephens
//Rasmussen University
//COT4530C
//Professor Kumar
//Module 06


//logic for test cases
//Test case 1: n = 10
//Expected: 55
//Recursive: 55
//Dynamic: 55

public class TestCases {
    // void because we are not returning anything / utilizing this as a helper method
    public static void runTests() {
        // test values per instructions
        int[] testValues = {10, 50, 70};
        // we can utilize any number of test values

        // For each test value, run the recursive and dynamic programming solutions
        for (int n : testValues) {
            // start and end time for each test
            long startTime, endTime, duration;

            try {
                // Test recursive solution
                startTime = System.nanoTime();
                long resultRecursive = Fibonacci.RecursiveFib(n);
                endTime = System.nanoTime();

                // change the duration to milliseconds then print the results
                duration = (endTime - startTime) / 1_000_000;
                System.out.println("Recursive Fibonacci of " + n + " is " + resultRecursive + " (Time: " + duration + " ms)");

                // test dynamic solution
                startTime = System.nanoTime();
                long resultDynamic = FibonacciDynamic.fiboDynamic(n);
                endTime = System.nanoTime();

                // change the duration to milliseconds then print the results
                duration = (endTime - startTime) / 1_000_000;
                System.out.println("Dynamic Fibonacci of " + n + " is " + resultDynamic + " (Time: " + duration + " ms)");

                // compare the results
                // if the results are the same, the test passed
                if (resultRecursive == resultDynamic) {
                    System.out.println("Test passed\n\n");
                } else {
                    System.out.println("Test failed\n\n");
                }
            } catch (Exception e) {
                System.out.println("An error occurred while testing Fibonacci of " + n + ": " + e.getMessage());
            }
        }
    }
}



