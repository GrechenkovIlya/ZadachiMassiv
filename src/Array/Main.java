package Array;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
    }

    //Задача 1 Найти минимальный элемент массива
    public static void task1() {
        int n = 20;
        int[] a = inputArrayWithRandom(n, 0, 20);
        printArray(a, n);

        int min = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] < min)
                min = a[i];
        }
        System.out.println("min=" + min);

    }

    //Задача 2 Найти максимальный элемент массива
    public static void task2() {
        int n = 20;
        int []a = inputArrayWithRandom(n, 0, 20);
        printArray(a, n);

        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max)
                max = a[i];
        }
        System.out.println("max=" + max);
    }

    //Задача 3 Найти индекс минимального элемента массива
    public static void task3() {
        int n = 20;
        int []a = inputArrayWithRandom(n, 0, 20);
        printArray(a, n);
        int min = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] < a[min]) {
                min = i;
            }
        }
        System.out.println("index min=" + min);
    }

    //Задача 4 Найти индекс максимального элемента массива
    public static void task4() {
        int n = 20;
        int []a = inputArrayWithRandom(n, 0, 20);
        printArray(a, n);

        int max = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > a[max]) {
                max = i;
            }
        }
        System.out.println("index max=" + max);
    }

    //Задача 5 Посчитать сумму элементов массива с нечетными индексами
    public static void task5() {
        int n = 20;
        int []a = inputArrayWithRandom(n, 0, 20);
        printArray(a, n);

        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0)
                sum += i;
        }
        System.out.println("sum NechetnArray=" + sum);
    }

    // Задача 6 Сделать реверс массива (массив в обратном направлении)
    public static void task6() {
        int n = 20;
        int []a = inputArrayWithRandom(n, 0, 20);

            printArray(a, n);

        for (int i = 0; i < n / 2; i++) {
            int temp = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = temp;
        }
        printArray(a, n);
    }

    //Задача 7 Посчитать количество нечетных элементов массива
    public static void task7() {
        int n = 20;
        int []a = inputArrayWithRandom(n, 0, 20);
        printArray(a, n);

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0)
                count++;
        }
        System.out.println("KLV NechetnArray=" + count);
    }

    //Задача 8 Поменять местами первую и вторую половину массива.
    public static void task8() {
        int n = 20;
        int b = n % 2;
        int []a = inputArrayWithRandom(n, 0, 20);
        printArray(a, n);

        for (int i = 0; i < n / 2; i++) {
            int temp = a[i];
            a[i] = a[n / 2 + i + b];
            a[n / 2 + i + b] = temp;

        }
        printArray(a, n);
    }

    //Задача 9 Отсортировать массив по возрастанию (Bubble)
    public static void task9() {
        int n = 20;
        int []a = inputArrayWithRandom(n, 0, 20);
        printArray(a, n);

        boolean flag;
        for (int k = 0; k < n - 1; k++) { // пузырек возрастание
            flag = false;
            for (int i = 1; i < n; i++) {
                if (a[i] < a[i - 1]) {
                    flag = true;
                    int temp = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = temp;
                }
            }
            if (!flag) break;
        }
        printArray(a, n);
    }

    //Задача 10 Отсортировать массив по убыванию (Bubble)
    public static void task10() {
        int n = 20;
        int []a = inputArrayWithRandom(n, 0, 20);
        printArray(a, n);

        for (int k = 0; k < n - 1; k++) {
            for (int i = 1; i < n; i++) {
                if (a[i] > a[i - 1]) {
                    int temp = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = temp;
                }
            }
        }
        printArray(a, n);
    }

    //Задача 11 Отсортировать массив по возрастанию (Select)
    public static void task11() {
        int n = 20;
        int []a = inputArrayWithRandom(n, 0, 20);
        printArray(a, n);

        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
            System.out.print( a[i] + "," );
        }
    }


    public static void printArray(int []a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println();
    }

    public static int[] inputArray(int n) {
        Scanner scanner = new Scanner(System.in);
        int []array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = scanner.nextInt();
        return array;
    }

    public static int[] inputArrayWithRandom(int n, int a, int b) {
        Random random = new Random();
        n = 20;
        int []arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = random.nextInt(a, b);
        return arr;
    }
}


