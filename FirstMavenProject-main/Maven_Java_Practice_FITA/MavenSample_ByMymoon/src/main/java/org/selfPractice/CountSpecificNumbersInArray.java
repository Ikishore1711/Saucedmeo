package org.selfPractice;

public class CountSpecificNumbersInArray {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 4, 1, 56, 1, 34, 1, 2, 45, 3, 1, 3, 25, 2, 44, 1, 2, 1, 55};
        int countNumber1 = 0;
        int countNumber3 = 0;
        int countNumber56 = 0;

        for (int currentNumber : numbers) {
            if (currentNumber == 1) {
                countNumber1++;
            } else if (currentNumber == 56) {
                countNumber56++;
            } else if (currentNumber == 3) {
                countNumber3++;
            }
        }
        System.out.println("The count of 1 in the array is: " + countNumber1);
        System.out.println("The count of 56 in the array is: " + countNumber56);
        System.out.println("The count of 3 in the array is: " + countNumber3);
    }
}
