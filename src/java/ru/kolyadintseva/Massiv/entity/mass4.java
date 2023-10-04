package ru.kolyadintseva.Massiv.entity;

public class mass4 {
    public static void main (String[] args) {
        int myArray[] = {5, -3, 2, 1, 7, 11, 12, -4, 1, 10};
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }
        System.out.println(sum);
    }
}
