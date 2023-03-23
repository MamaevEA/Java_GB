package homework5;

// 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

import java.util.ArrayList;
import java.util.HashMap;

public class Phonebook {
    private HashMap<String, ArrayList<String>> contacts;

    public Phonebook() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phone) {
        if (contacts.containsKey(name)) {
            // Если контакт уже существует, добавляем новый телефон к существующему списку
            ArrayList<String> phones = contacts.get(name);
            phones.add(phone);
        } else {
            // Создаем новый список для нового контакта
            ArrayList<String> phones = new ArrayList<>();
            phones.add(phone);
            contacts.put(name, phones);
        }
    }

    public ArrayList<String> getPhonesByContactName(String name) {
        // Получаем список телефонов для контакта по его имени
        return contacts.getOrDefault(name, new ArrayList<>());
    }
}


