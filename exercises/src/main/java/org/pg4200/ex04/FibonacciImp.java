package org.pg4200.ex04;

public class FibonacciImp implements Fibonacci{

    @Override
    public int compute(int n) throws IllegalArgumentException {

        if(n == 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        } else {
            return compute(n - 2) + compute(n - 1);
        }
    }
}
