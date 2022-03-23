package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array1 = {4,23,67,832,5,0};
        int[] array2 = {4,5,12,4,3,5,4,1,1,4,5,3};
        array1 = plusArr(array1,array2);
        for (int i = 0; i<array1.length;i++){
            System.out.print(array1[i]+",");
        }

    }
    static int[] plusArr(int[] arr1,int[] arr2){
        int[] newArray = new int[arr1.length+arr2.length];
        for (int i=0;i<arr1.length;i++){
            newArray[i]=arr1[i];
        }
        for (int i =0;i<arr2.length;i++){
            newArray[arr1.length+i]=arr2[i];
        }
        return newArray;
    }
}
