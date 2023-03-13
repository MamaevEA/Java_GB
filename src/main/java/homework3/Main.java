package homework3;

// 1. Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)
//2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
//3. Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // delEvenNumbers(); // Задание 1
        // maxMinArray(); // Задание 2
        findDelNum(); // Задание 3

    }

    public static void delEvenNumbers() {
        Scanner in = new Scanner(System.in);
        System.out.print("Задайте количество чисел в списке: ");
        int len = Integer.parseInt(in.next());
        System.out.print("Задайте максимально возможное число в списке: ");
        int max = Integer.parseInt(in.next());
        ArrayList<Integer> array = new ArrayList<Integer>();

        for (int i = 0; i < len; i++) {
            array.add(i, (int) (Math.random() * max));
        }
        System.out.print("Задан список: ");
        System.out.printf(String.valueOf(array));
        System.out.println();
        array.removeIf(x -> (x % 2 == 0));
        System.out.print("Итоговый список: ");
        System.out.printf(String.valueOf(array));
    }

    public static void maxMinArray() {
        Scanner in = new Scanner(System.in);
        System.out.print("Задайте количество чисел в списке: ");
        int len = Integer.parseInt(in.next());
        System.out.print("Задайте максимально возможное число в списке: ");
        int max = Integer.parseInt(in.next());
        ArrayList<Integer> array = new ArrayList<Integer>();

        for (int i = 0; i < len; i++) {
            array.add(i, (int) (Math.random() * max));
        }
        System.out.print("Задан список: ");
        System.out.printf(String.valueOf(array));
        System.out.println();
        System.out.print("Минимальное значение: ");
        System.out.printf(String.valueOf(Collections.min(array)));
        System.out.println();
        System.out.print("Максимальное значение: ");
        System.out.printf(String.valueOf(Collections.max(array)));
        System.out.println();
        double rez = 0;
        for (double m: array) {
            rez += m;
        }
        System.out.print("Среднее арифметическое значение: ");
        System.out.printf(String.valueOf(rez / array.size()));

    }

    public static void findDelNum() {
        ArrayList<String> array = new ArrayList<String>();
        array.add(0,"number");
        array.add(1, String.valueOf(12));
        array.add(2, String.valueOf(34));
        array.add(3,"five");
        array.add(4,"six");
        array.add(5, String.valueOf(1));
        System.out.print("Входной лист: ");
        System.out.print(array);
        System.out.println();
        array.removeIf(x -> (isNum(x) == true));
        System.out.print("Итоговый лист: ");
        System.out.printf(String.valueOf(array));
    }

    public static boolean isNum(String str) {
        try {
           Double.parseDouble(str);
           return true;
        } catch (NumberFormatException e) {
               return false;
        }
    }
}