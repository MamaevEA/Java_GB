package homework5;

//2. Пусть дан список сотрудников:
//Иван Иванов
//
//Светлана Петрова
//
//Кристина Белова
//
//Анна Мусина
//
//Анна Крутова
//
//Иван Юрин
//
//Петр Лыков
//
//Павел Чернов
//
//Петр Чернышов
//
//Мария Федорова
//
//Марина Светлова
//
//Мария Савина
//
//Мария Рыкова
//
//Марина Лугова
//
//Анна Владимирова
//
//Иван Мечников
//
//Петр Петин
//
//Иван Ежов
//Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] employees = {"Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова",
                "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова",
                "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова",
                "Иван Мечников", "Петр Петин", "Иван Ежов"};

        Map<String, Integer> map = new HashMap<>();

        for (String employee : employees) {
            Integer count = map.get(employee);
            if (count == null) {
                count = 0;
            }
            map.put(employee, count + 1);
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        System.out.println("Повторяющиеся имена:");
        for (Map.Entry<String, Integer> entry : list) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}