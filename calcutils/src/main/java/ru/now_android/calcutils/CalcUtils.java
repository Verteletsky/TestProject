package ru.now_android.calcutils;

/**
 * Created by Strimer on 13.12.2017.
 */

public class CalcUtils {

    public static int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int multi(int a, int b) {
        return a * b;
    }

    public static float dev(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Div by zero error");
        } else {
            return a / b;
        }
    }

}
