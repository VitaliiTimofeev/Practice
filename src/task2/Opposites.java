package task2;


import java.util.Arrays;
import java.util.Random;

public class Opposites {
    public void attractOpposites () {
        int[] positiveArray = new int[7];
        int[] negativeArray = new int[7];
        Random random = new Random();
        int positive = 0, negative = 0;

        while (positive != 7) {
            int positiveNum = random.nextInt(101) - 50;
            if (positiveNum > 0) {
                positiveArray[positive] = positiveNum;
                positive++ ;
                }
            }

        while (negative != 7) {
            int negativeNum = random.nextInt(101) - 50;
            if (negativeNum < 0) {
                    negativeArray[negative] = negativeNum;
                    negative++;
                }
            }


        // Выводим массив с положительными числами
        System.out.println("Выводим массив с положительными числами: ");
        for (int i = 0; i < positiveArray.length; i++) {
            if (i == positiveArray.length - 1) {
                System.out.print(positiveArray[i]);
            } else {
                System.out.print(positiveArray[i] + " ");
            }
        }
        // Выводим массив с отрицательными числами
        System.out.println("\nВыводим массив с отрицательными числами: ");
        for (int i = 0; i < negativeArray.length; i++) {
            if (i == negativeArray.length - 1) {
                System.out.print(negativeArray[i]);
            } else {
                System.out.print(negativeArray[i] + " ");
            }
        }

        //создаем новый массив на 7 элементов
        int[] sumArray= new int[7];
        //складываем в этом массиве значение элементов по i
        System.out.println("\nВыводим суммирующий массив: ");
        for (int i = 0; i < sumArray.length; i++) {
            sumArray[i] = positiveArray[i] + negativeArray[i];
            if (i == sumArray.length - 1) {
                System.out.print(sumArray[i]);
            } else {
                System.out.print(sumArray[i] + " ");
            }
        }
    }
}
