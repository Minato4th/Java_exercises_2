package com.endava.util;

import java.util.Random;

public class ArrayProcessor {
    Random random;
    int[] array;

    public ArrayProcessor() {
        random = new Random();
        array = new int[10];
        generateNewArrayNumbers();
    }

    public void generateNewArrayNumbers(){
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
    }

    public void showArrayNumbers(){
        for (int number : array) {
            System.out.print(number + " ");
        }
    }

    public void checkNumbers(){
        boolean one = true;
        boolean four = true;
        for (int numbers : array) {
            if (numbers == 1) {
                one = false;
            } else if (numbers == 4){
                four = false;
            }
        }
        System.out.println("There is no 1 " + one + ", and no 4 " + four);
    }

    public boolean checkCondition(){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1){
                return checkEnd(i);
            }
        }
        return false;
    }

    private boolean checkEnd(int start){
        for (int i = start; i < array.length; i++) {
            if (array[i] == 2){
                return true;
            }
        }
        return false;
    }

    public void countEven(){
        int count = 0;
        for (int number : array) {
            if (number % 2 == 0){
                count++;
            }
        }
        System.out.println("Count of even numbers = " + count);
    }
}
