package ru.kolyadintseva.Massiv.entity;

public class mass5 {
    public static void main(String[]args)
    {
        int [] arr = new int[]{5, -3, 2, 1, 7, 11, 12, -4, 1, 10};
        int res = 0;
        for(int i=0; i<arr.length; i++) {
            res += (i%2 != 0)? -arr[i] : arr[i];
        }
        System.out.println("res = "+res);
    }
}



