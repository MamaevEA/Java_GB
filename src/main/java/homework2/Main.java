package homework2;

// 1. Напишите метод, который принимает на вход строку (String)
// и определяет является ли строка палиндромом (возвращает boolean значение).
//2. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
// который запишет эту строку в простой текстовый файл, обработайте исключения.

import com.google.common.primitives.Chars;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // palindrom(); // Задание 1
        TEST(); // Задание 2
    }

    public static void palindrom() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = in.next();
        System.out.println(word);
        List<Character> chars = Chars.asList(word.toCharArray());
        System.out.println(chars);
        Boolean answer = null;
        for (int i = 0; i < (chars.size() / 2); i++) {
            if (chars.get(i) == chars.get(chars.size() - 1 - i)) {
                answer = true;
            } else answer = false;
        }
        System.out.println(answer);
    }

    public static void TEST() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append("TEST ");
        }
        File file1 = new File("/Users/evgenijmamaev/IdeaProjects/Java3/src/main/java", "file.txt");
        try {
            FileWriter writer = new FileWriter(file1, false);
            writer.write(String.valueOf(sb));
            writer.append('\n');
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
