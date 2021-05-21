package ru.gb.Dmitrieva.HomeWorkApp.Lesson_2;


public class ArrayCheck {
    public static void main(String[] args) {
        String[][] strDataWrong = {
                {"1", "2", "3", "4"},
                {"2", "2", "7", "3"},
                {"1", "seven", "2", "2"},
                {"2", "2", "2", "2"}

        };
        getArraySum(strDataWrong);

        String[][] strSizeWrong = {
                {"1", "2", "3", "4"},
                {"2", "2", "7", "3"},
                {"1", "5", "2", "2"},
                {"2", "2", "2", "2"},
                {"2", "2", "2", "2"}

        };
        getArraySum(strSizeWrong);

    }

    private static void getArraySum(String[][] str) {
        if (str.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < str.length; i++) {
        int sum = 0;
            {
           for (int j = 0; j < str[i].length; j++) {
                    inputDate(str[i][j], i, j);
                    sum += Integer.parseInt(str[i][j]);
                }
        }
            System.out.println("Результат: ");
            System.out.println(sum);
        }


    }

    private static void inputDate(String str, int x, int y) {
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                throw new MyArrayDataException(x+1, y+1);
            }
        }
    }
}
