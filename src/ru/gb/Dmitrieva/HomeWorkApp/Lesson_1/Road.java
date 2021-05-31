package ru.gb.Dmitrieva.HomeWorkApp.Lesson_1;

import java.util.Random;

public class Road extends Barrier {
    private int length;

    public Road(String name) {
        super(name);
        Random rand = new Random();
        this.length = rand.nextInt(10);
    }

    public int getLength() {
        return this.length;
    }

    protected boolean moving(Actions actions) {
        System.out.printf("The barrier number %s and it's length: %d m\n", super.getName(), this.length);
        actions.run();
        return this.getLength() <= actions.getRunDistance();
    }
}
