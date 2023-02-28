import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        boolean flag = true;
        flag = false;

        // Целочисленные типы данных
        byte aByte = -128;          // 8 bit  = 1 байт      -127 ... 128
//        aByte = (byte) (aByte + 1);
        short aShort = -32768;      // 16 bit = 2 байта     -32768 ... 32767

        // Чаще используются
        int aInt = -2147483648;     // 32 bit = 4 байта     -2147483648 до 2147483647   2^(bit-1)
        long aLong = -2147483648;   // 64 bit = 8 байт

        // С плавающей точкой
        float aFloat = 1.0F;        // 32 bit = 4 байта
        // Чаще используют
        double aDouble = 1.0;       // 64 bit = 8 байт

        char aChar = 'a';

        // Оператораы
        // 1. Присвоение
        char bChar = 'a';
        // 2. Математические + - * / %
        int aResult = 5 - 3; //
        int bResult = 5 + 3; //
        int cResult = 5 * 3; //
        int dResult = 5 / 3; //
        int eResult = 5 % 3; //
        // 3. Операторы сравнения >, <, >=, <=, !=, ==
        System.out.println("boolean" + (3 > 2));

        String s = "this is a String";
        List<String> aList = new ArrayList<>();
        // 4. Логические операторы &(И) &&(сокращенное И), |(ИЛИ) ||(сокращенное ИЛИ), !(отрицание НЕ)
        if (!(3 > 2 || 3 > 1)) {
        }
        // 5. Тернарный оператор
        int value = (methodOne()) ? 10 : 20;
        System.out.println("value = " + value);
        // 6. instanceof
        if (s instanceof String) {
        }


        // Wrapper types
        Integer aIntegerWrapper; // int
        Double aDoubleWrapper; // double
        Character aCharacterWrapper; // char
        Boolean aBooleanWrapper; // boolean

        Integer arg = 42;
        printInt(arg);

        if (true) {
            //
        } else if (true) {
            //
        } else {
            //
        }

        switch (s) {
            case "dima": {
                System.out.println("Это Дима");
            }
            case "vasya": {
                System.out.println("Это Вася");
            }
            default: {
                System.out.println("Дефолт");
            }
        }

        if (s.equals("dima")) {
            System.out.println("Дима");
        } else if (s.equals("vasya")) {
            System.out.println("Вася");
        } else {
            System.out.println("Дефолт");
        }
    }

    public static boolean methodOne() {
        System.out.println(methodOne());
        return true;
    }

    public static boolean methodAnother() {
        System.out.println(methodAnother());
        return true;
    }

    public static void printInt(int arg) {
        System.out.println("printInt: " + arg);
    }
}
