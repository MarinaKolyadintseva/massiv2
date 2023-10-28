package ru.kolyadintseva.Massiv.service;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class ArrayService {

    public void evenNumbers() {

        int[] array_nums = {5, -3, 2, 1, 7, 11, 12, -4, 1, 10};
        System.out.println("Original Array: " + Arrays.toString(array_nums));
        int ctr = 0;
        for (int i = 0; i < array_nums.length; i++) {
            if (array_nums[i] % 2 == 0)
                ctr++;
        }
        System.out.println("Четные числа : " + ctr);
    }

    public void oddNumbers() {
        int[] array_nums = {5, -3, 2, 1, 7, 11, 12, -4, 1, 10};
        System.out.println("Original Array: " + Arrays.toString(array_nums));
        int ctr = 0;
        for (int i = 0; i < array_nums.length; i++) {
            if (array_nums[i] % 2 == 0)
                ctr++;
        }
        System.out.println("Нечетные числа  : " + (array_nums.length - ctr));
    }

    public void primeNumbers() {
        int count = -3;
        int n = 10;
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        Date startTime = new Date();
        for (int i = 11; i <= n; i += 2) {
            if (sumNumbers(i)) {
                count++;
                numbers.add(i);
            }
        }
        Date finishTime = new Date();
        long ct = finishTime.getTime() - startTime.getTime();
        System.out.println("Время вычислений: " + ct + "ms");
        System.out.println("Количество простых чисел: " + count);
        System.out.print(numbers);

    }

    static boolean sumNumbers(int a) {
        int p = 0;
        if ((a % 2 == 0) || (a % 10 == 5)) {
            return false;
        } else {
            for (int j = 3; j <= Math.sqrt(a); j += 2) {
                if (a % j == 0) {
                    p += 1;
                    break;
                }
            }
        }
        if (p > 0) {
            return false;
        } else return true;
    }

    public void differenceOfNumbers() {
        int myArray[] = {5, -3, 2, 1, 7, 11, 12, -4, 1, 10};
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }
        System.out.println(sum);
    }

    public void quantity0() {
        {
            int[] arr = new int[]{5, -3, 2, 1, 7, 11, 12, -4, 1, 10};
            int res = 0;
            for (int i = 0; i < arr.length; i++) {
                res += (i % 2 != 0) ? -arr[i] : arr[i];
            }
            System.out.println("res = " + res);
        }
    }
}


