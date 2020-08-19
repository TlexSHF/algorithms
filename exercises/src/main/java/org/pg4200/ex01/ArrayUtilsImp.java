package org.pg4200.ex01;

public class ArrayUtilsImp implements ArrayUtils{

    @Override
    public int min(int[] array) throws IllegalArgumentException {
        checkArray(array);

        int min = array[0];

        for(int i = 0; i < array.length; i++){

            if(min > array[i]){
                min = array[i];
            }
        }

        return min;
    }

    @Override
    public int max(int[] array) throws IllegalArgumentException {
        checkArray(array);

        int max = array[0];

        for(int i = 0; i < array.length; i++){

            if(max < array[i]){
                max = array[i];
            }
        }

        return max;
    }

    @Override
    public double mean(int[] array) throws IllegalArgumentException {
        checkArray(array);

        double total = 0;

        for(int i = 0; i < array.length; i++){
            total += array[i];
        }

        return total / array.length;
    }


    private void checkArray(int[] array) {
        if(array == null || array.length == 0){
            throw new IllegalArgumentException();
        }
    }
}
