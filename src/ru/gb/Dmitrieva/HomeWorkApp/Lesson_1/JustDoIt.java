package ru.gb.Dmitrieva.HomeWorkApp.Lesson_1;

import java.util.Random;

public class JustDoIt {
    public JustDoIt() {
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Lesson1.Actions[] actions = new Lesson1.Actions[3];
        int distance = rand.nextInt(10);
        int heigth = rand.nextInt(10);
        actions[0] = new Lesson1.Human("Peter", distance, heigth);
        distance = rand.nextInt(10);
        heigth = rand.nextInt(10);
        actions[1] = new Lesson1.Robot("00XX001Z111", distance, heigth);
        distance = rand.nextInt(10);
        heigth = rand.nextInt(10);
        actions[2] = new Lesson1.Cat("Luna", distance, heigth);
        Barrier[] barriers = new Barrier[6];

        int i;
        for(i = 0; i < barriers.length; ++i) {
            distance = rand.nextInt(10);
            boolean isRoad = rand.nextBoolean();
            if (isRoad) {
                barriers[i] = new Lesson1.Road(i + 1 + " is Road", distance);
            } else {
                barriers[i] = new Lesson1.Wall(i + 1 + " is Wall", distance);
            }
        }

        for(i = 0; i < actions.length; ++i) {
            boolean result = true;

            for(int j = 0; j < barriers.length; ++j) {
                result = barriers[j].moving(actions[i]);
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
}
