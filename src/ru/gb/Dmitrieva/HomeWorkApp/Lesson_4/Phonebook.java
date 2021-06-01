package ru.gb.Dmitrieva.HomeWorkApp.Lesson_4;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Phonebook {
    private HashMap<String, HashSet<String>> phonebook;

    public Phonebook() {
        this.phonebook = new HashMap<>();
    }

    public HashSet<String> get(String surname) {
        if (phonebook.containsKey(surname))
            return phonebook.get(surname);
        return new HashSet<>(Collections.singletonList(""));
    }

    public boolean add(String surname, String phone) {
        if (phonebook.containsKey(surname)) {
            HashSet<String> numberSet = phonebook.get(surname);
            if (!numberSet.contains(phone)) {
                numberSet.add(phone);
            } else {
                return false;
            }
        } else {
            HashSet<String> numberSet = new HashSet<>(1);
            numberSet.add(phone);
            phonebook.put(surname, numberSet);
        }
        return true;
    }
}
