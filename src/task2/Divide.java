package task2;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.IntStream;

public class Divide {
    public void divideArray() {
        int[] array = new int[5];
        Random random = new Random();
        //Заполняем массив и выводим на экран строкой
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        //Создаем два массива для четных и нечетных чисел
        int[] evenArray = new int[array.length];
        int[] oddArray = new int[array.length];
        int even = 0, odd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenArray[even] = array[i];
                even++;
            } else {
                oddArray[odd] = array[i];
                odd++;
            }
        }
        //выводим массив с четными числами
        System.out.print("Выводим массив с четными числами: ");
        for (int i = 0; i < evenArray.length; i++) {
            if (evenArray[i] != 0) {
                if (i == evenArray.length - 1) {
                    System.out.print(evenArray[i]);
                } else {
                    System.out.print(evenArray[i] + " ");
                }
            }
        }
        System.out.println();
        //выводим массив с нечетными числами
        System.out.print("Выводим массив с нечетными числами: ");
        for (int i = 0; i < oddArray.length; i++) {
            if (oddArray[i] != 0) {
                if (i == oddArray.length - 1) {
                    System.out.print(oddArray[i]);
                } else {
                    System.out.print(oddArray[i] + " ");
                }
            }
        }

        }
    }















