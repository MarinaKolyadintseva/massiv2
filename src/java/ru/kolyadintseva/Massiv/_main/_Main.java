package ru.kolyadintseva.Massiv._main;


import ru.kolyadintseva.Massiv.service.ArrayService;

public class _Main {
    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();
        arrayService.evenNumbers();
        ArrayService arrayService1 = new ArrayService();
        arrayService1.oddNumbers();
        ArrayService arrayService2 = new ArrayService();
        arrayService2.primeNumbers();
        ArrayService arrayService3 = new ArrayService();
        arrayService3.differenceOfNumbers();
        ArrayService arrayService4 = new ArrayService();
        arrayService4.quantity0();
    }
}
