package ru.gb.Dmitrieva.HomeWorkApp.Lesson_4;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n###Задание 1###");

        String[] words = new String[]{
                "команда", "банк", "сцена", "население", "свобода",
                "музыка", "правда", "свобода", "память", "команда",
                "память", "свобода", "договор", "дерево", "банк",
                "свобода", "музыка", "большинство", "сцена", "музыка"
        };
        List<String> wordsList = Arrays.asList(words);
        System.out.println("Все слова: " + wordsList);

        Set<String> wordsSet = new HashSet<>(wordsList);
        System.out.println("Уникальные слова: " + wordsSet);

        for (String word : wordsSet) {
            int number = Collections.frequency(wordsList, word);
            System.out.println(word + " : " + number);
        }

        System.out.println("\n###Задание 2###");

        Phonebook phonebook = new Phonebook();
        System.out.println("-Добавляем Иванова.");
        phonebook.add("Иванов", "+79261425312");
        System.out.println("1) Иванов - " + phonebook.get("Иванов"));
        System.out.println("1) Сидоров - " + phonebook.get("Сидоров"));

        System.out.println("\n-Добавляем Сидорова.");
        phonebook.add("Сидоров", "+79157437375");
        System.out.println("2) Иванов - " + phonebook.get("Иванов"));
        System.out.println("2) Сидоров - " + phonebook.get("Сидоров"));

        System.out.println("\n-Добавляем второго Иванова.");
        phonebook.add("Иванов", "+79062431890");
        System.out.println("3) Иванов - " + phonebook.get("Иванов"));
        System.out.println("3) Сидоров - " + phonebook.get("Сидоров"));
    }
}
