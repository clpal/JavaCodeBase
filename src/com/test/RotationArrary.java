package com.test;

public class RotationArrary {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
         int k=3;
        for (int i = 0; i < k ; i++) {
            for (int j = 0; j < arr.length ; j++) {
               // if (j>0 && j< arr.length) {

                       arr[j+1]=arr[j];

                             k++;


                //}
                System.out.printf(""+arr);
            }

        }
    }


}
