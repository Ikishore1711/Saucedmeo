package org.selfPractice;

public class LoopAndBreak {

    public static int functionA() {
        int result = 5;
        for (int i = 0; i < 100; i++) {
            if (i * 5 == 75) {
               result = i;
                break;
            }
        }
        return result;
    }

    public static void functionB() {
        int value = functionA();
        System.out.println("valueFromFunctionA is "+ value);
    }

    public static void main(String[] args) {
        functionB();
    }
}