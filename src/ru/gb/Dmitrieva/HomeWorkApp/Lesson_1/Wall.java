package ru.gb.Dmitrieva.HomeWorkApp.Lesson_1;

import java.util.Random;

public class Wall extends Barrier {
    private int heigth;

    public Wall(String name) {
        super(name);
        Random rand = new Random();
        this.heigth = rand.nextInt(10);
    }

    public int getHeigth() {
        return this.heigth;
    }

    protected boolean moving(Actions actions) {
        System.out.printf("The barrier number %s and it's height: %d m\n", super.getName(), this.heigth);
        actions.jump();
        return this.getHeigth() <= actions.getJumpHeight();
    }
}