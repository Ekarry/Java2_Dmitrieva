package ru.gb.Dmitrieva.HomeWorkApp.Lesson_1;

public class Human implements Actions {
    private String name;
    private int runDistance;
    private int jumpHeight;

    public Human(String name, int distance, int jumpHeight) {
        this.name = name;
        this.runDistance = distance;
        this.jumpHeight = jumpHeight;
    }

    public void run() {
        System.out.printf("Human %s is running %d m\n", this.name, this.getRunDistance());
    }

    public void jump() {
        System.out.printf("Human %s is jumping %d m\n", this.name, this.getJumpHeight());
    }

    public int getRunDistance() {
        return this.runDistance;
    }

    public int getJumpHeight() {
        return this.jumpHeight;
    }
}
