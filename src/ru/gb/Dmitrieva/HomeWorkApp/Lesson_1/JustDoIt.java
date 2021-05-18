package ru.gb.Dmitrieva.HomeWorkApp.Lesson_1;

import java.util.Random;

public class JustDoIt {
    public static void main(String[] args) {

        Barrier[] barriers = new Barrier[6];
        int i;
        for(i = 0; i < barriers.length; ++i) {
            Random rand = new Random();
            boolean isRoad = rand.nextBoolean();
            if (isRoad) {
                barriers[i] = new Road(i + 1 + " is Road");
            } else {
                barriers[i] = new Wall(i + 1 + " is Wall");
            }
        }

        for(i = 0; i < generateParticipants().length; ++i) {
            boolean result = true;

            for(int j = 0; j < barriers.length; ++j) {
                result = barriers[j].moving(generateParticipants()[i]);
                if (!result) {
                    break;
                }
            }

            if (result) {
                System.out.println("Success!!");
            } else {
                System.out.println("Fail and retires from the race!!");
            }
        }

    }

    private static Actions[] generateParticipants() {
        Actions [] actions = new Actions []{
                new Human("Peter"),
                new Robot("00XX001Z111"),
                new Cat("Luna")
                };
        return actions;
    }
}
