package ru.gb.Dmitrieva.HomeWorkApp.Lesson_2;

public class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException(int i, int j){
        super("Не удалось преобразовать элемент массива к числу. В ячейке (" + i + "," + j + ") не цифра.");
    }
}
