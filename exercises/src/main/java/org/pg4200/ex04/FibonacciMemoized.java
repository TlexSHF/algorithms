package org.pg4200.ex04;

public class FibonacciMemoized implements Fibonacci{

    @Override
    public int compute(int n) throws IllegalArgumentException {

        int[] array = new int[n];
        

    }

    public int fibonacci(int n) {
        if()

            if(n == 0) {
                return 0;
            } else if(n == 1) {
                return 1;
            } else {
                return compute(n - 2) + compute(n - 1);
            }
    }

}
