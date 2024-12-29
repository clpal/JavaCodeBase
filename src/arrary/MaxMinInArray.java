package arrary;

public class MaxMinInArray  {
    public static void main(String[] args) {
        int numbers[] = {6, 1, 3, 5, 7, 4};
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if ( numbers[i]>max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }


    }


