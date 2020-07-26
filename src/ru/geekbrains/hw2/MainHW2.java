package ru.geekbrains.hw2;

import java.util.Arrays;

public class MainHW2 {
    //задание №1
    public static void main(String[] args) {
        int [] arr = {1, 0, 1, 1, 1, 0, 1, 0, 0, 1};
        changeArray(arr);
        System.out.println(Arrays.toString(arr));
     //задание №2
        int [] arrNumbers = new int [8];
        arrNumbers [0] = 0;
        for(int i = 1; i < arrNumbers.length; i++){
            arrNumbers [i] = arrNumbers [(i - 1)] + 3;
        }
        System.out.println(Arrays.toString(arrNumbers));
     //задание №3
        int [] arrCheckNumber = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < arrCheckNumber.length; i++){
            if(arrCheckNumber [i] < 6){
                arrCheckNumber [i] = arrCheckNumber [i]* 2;
            }
        }
        System.out.println(Arrays.toString(arrCheckNumber));

     //задание №4
        int [][] arrMultiArray = new int [5][5];
        arrRighting(arrMultiArray);


    }

    private static void changeArray(int [] arr) {
        for (int i = 0; i < arr.length; i++ ){
            if(arr [i] == 0){
                arr [i] = 1;
            } else {
                arr [i] = 0;
            }
        }
    }

    private static void arrRighting (int [][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++ ){
                if(i == j || i + j == 4){
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
                System.out.printf("%5d", arr[i][j]);
            }
            System.out.println();
        }

    }
}
