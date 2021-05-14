package ru.gb.Dmitrieva.HomeWorkApp.Lesson_1;

public class Wall extends Barrier {
    private int heigth;

    public Wall(String name, int heigth) {
        super(name);
        this.heigth = heigth;
    }

    public int getHeigth() {
        return this.heigth;
    }

    protected boolean moving(Lesson1.Actions actions) {
        System.out.printf("The barrier number %s and it's height: %d m\n", super.getName(), this.heigth);
        actions.jump();
        return this.getHeigth() <= actions.getJumpHeight();
    }
}