package homework4;

// 1. Реализовать консольное приложение, которое:
//Принимает от пользователя и “запоминает” строки.
//Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//Если введено revert, удаляет предыдущую введенную строку из памяти.
//
//2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        strings(); // Задание 1
    }

    public static void strings () {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                break;
            } else if (input.equals("print")) {
                Collections.reverse(list);
                for (String str : list) {
                    System.out.println(str);
                }
                Collections.reverse(list);
            } else if (input.equals("revert")) {
                if (!list.isEmpty()) {
                    list.remove(list.size() - 1);
                }
            } else {
                list.add(input);
            }
        }

        scanner.close();
    }

    // Задание 2.
    public LinkedList reverseLinkedList(LinkedList originalList) {
        // Создаем новый список для перевернутых элементов
        LinkedList reversedList = new LinkedList();

        // Проходим по всем элементам оригинального списка
        for (Object element : originalList) {
            // Добавляем каждый элемент в начало нового списка
            reversedList.addFirst(element);
        }
        return reversedList;
    }

}