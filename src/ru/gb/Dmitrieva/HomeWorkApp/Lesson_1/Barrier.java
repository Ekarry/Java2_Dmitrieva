package ru.gb.Dmitrieva.HomeWorkApp.Lesson_1;

public abstract class Barrier {
    private String name;

    public Barrier(String name) {
        this.name = name;
    }

    protected abstract boolean moving(Actions var1);

    public String getName() {
        return this.name;
    }
}
