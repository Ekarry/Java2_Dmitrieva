package ru.gb.Dmitrieva.HomeWorkApp.Lesson_5;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class CreateReaderWriterCSV {

    public static void main(String[] args) throws IOException {
        AppData appData = new AppData(new FileWriter("outData.csv"));
        appData.setHeadersAndData(new String[]{" Фамилиия ", " Должность ", " e-mail "});
        appData.setData(new int[][]{{6, 6, 6}, {7, 7, 7}, {8, 8, 8}});
        FileWriter fileWriterInFile = new FileWriter("outData.csv", false);
        fileWriterInFile.write(appData.getHeaderString());
        fileWriterInFile.write(appData.separatingGetData());
        fileWriterInFile.close();

        AppData appDataRead = new AppData(new FileReader("data.csv"));
        appDataRead.readAll();
        System.out.println(Arrays.toString(appDataRead.getHeader()));
        System.out.println(Arrays.deepToString(appDataRead.getData()));

    }

}



