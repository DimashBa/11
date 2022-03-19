package ru.geekbrains.lesson_2;

public class HomeWork {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

        public static void checkSumSign() {
            int a = 5;
            int b = 6;
            int c = a + b;
            if (c <= 0) System.out.println("Сумма положительная");
            else System.out.println("Сумма отрицательная");
            System.out.println();
    }

    public static void printColor() {
        int value = 2;
        if (value <= 0) System.out.println("Красный");
        else if (value > 0 && value <= 100) System.out.println("Желтый");
        else System.out.println("Зеленый");
        System.out.println();
    }

        public static void compareNumbers() {
            int a = 4;
            int b = 8;
            if (a >= b) System.out.println("a >= b");
            else System.out.println("a < b");
            System.out.println();
        }

        }



