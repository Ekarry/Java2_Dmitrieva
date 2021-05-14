package ru.gb.Dmitrieva.HomeWorkApp.Lesson_1;

public class Road extends Barrier {
    private int length;

    public Road(String name, int length) {
        super(name);
        this.length = length;
    }

    public int getLength() {
        return this.length;
    }

    protected boolean moving(Lesson1.Actions actions) {
        System.out.printf("The barrier number %s and it's length: %d m\n", super.getName(), this.length);
        actions.run();
        return this.getLength() <= actions.getRunDistance();
    }
}
