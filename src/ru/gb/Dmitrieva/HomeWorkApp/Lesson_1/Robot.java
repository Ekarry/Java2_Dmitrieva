package ru.gb.Dmitrieva.HomeWorkApp.Lesson_1;

import java.util.Random;

public class Robot implements Actions {
    private String name;
    private int runDistance;
    private int jumpHeight;

    public Robot(String name) {
        this.name = name;
        Random rand = new Random();
        this.runDistance = rand.nextInt(10);
        this.jumpHeight = rand.nextInt(10);
    }

    public void run() {
        System.out.printf("Robot %s is running %d m\n", this.name, this.getRunDistance());
    }

    public void jump() {
        System.out.printf("Robot %s is jumping %d m\n", this.name, this.getJumpHeight());
    }

    public int getRunDistance() {
        return this.runDistance;
    }

    public int getJumpHeight() {
        return this.jumpHeight;
    }
}