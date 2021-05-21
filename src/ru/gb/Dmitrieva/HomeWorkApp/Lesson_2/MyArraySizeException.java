package ru.gb.Dmitrieva.HomeWorkApp.Lesson_2;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException {
    public MyArraySizeException(){
        super("Массив не формата 4х4");
    }
}
