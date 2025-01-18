package org.selfPractice;

public class LoopAndContinueExample {

    public static int functionA() {
        int result = 0;
        for (int i = 0; i < 100; i++) {
            if (i * 5 == 125) {
                result = i;
                continue;
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