package ru.kolyadintseva.Massiv.entity;

import java.util.Arrays;

public class mass1 {
        public static void main(String[] args) {
            int[] array_nums = {5, -3, 2, 1, 7, 11, 12, -4, 1, 10};
            System.out.println("Original Array: "+ Arrays.toString(array_nums));
            int ctr = 0;
            for(int i = 0; i < array_nums.length; i++)
            {
                if(array_nums[i] % 2 == 0)
                    ctr++;
            }
            System.out.println("Четные числа : "+ctr);
        }
    }