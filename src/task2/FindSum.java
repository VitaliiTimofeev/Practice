package task2;

import java.util.Random;

public class FindSum {
        public void sumArray (){
            int[] array = new int[10];
            Random random = new Random();
            int sum = 0;
            //Заполняем массив и выводим на экран строкой
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt();
                    System.out.print(array[i] + " ");
            }
            //считаем сумму всех элементов и выводим на экран
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            System.out.println("\nСумма всех чисел: " + sum);

            //Находим мин. элемент и вывести на экран его индекс и значение
            int min = array[0];
            int index = 0;
            for (int i = 1; i < array.length; i++) {
                if (min > array[i]){
                    min = array[i];
                    index = i;
                }
            }
            System.out.printf("Минимальный элемент: индекс элемента в массиве = %d ; значение элемента = %d", index, min);
        }
    }

