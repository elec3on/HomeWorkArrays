import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
// Задача № 1
        System.out.printf("Задача № 1%n");
        // 1. Целочисленный массив из 3 элементов (1, 2, 3) с использованием new
        int[] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;

        // 2. Массив дробных чисел (1.57, 7.654, 9.986), сразу заполненный значениями
        double[] doubleArray = {1.57, 7.654, 9.986};

        // 3. Произвольный массив (строки, 4 элемента), создан сразу с заполнением
        String[] stringArray = {"Яблоко", "Банан", "Вишня", "Груша"};

        // Выведем содержимое массивов в консоль
        System.out.printf("Целочисленный массив:%n");
        for (int value : intArray) {
            System.out.println(value);
        }

        System.out.printf("%nМассив дробных чисел:%n");
        for (double value : doubleArray) {
            System.out.println(value);
        }

        System.out.printf("%nПроизвольный массив (строки):%n");
        for (String value : stringArray) {
            System.out.println(value);
        }
        System.out.printf("----------------------------------%n%n");
// Задача № 2
        System.out.printf("Задача № 2%n");
        // Вывод intArray
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]);
            if (i < intArray.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();

        // Вывод doubleArray
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.print(doubleArray[i]);
            if (i < doubleArray.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();

        // Вывод stringArray
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(stringArray[i]);
            if (i < stringArray.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        System.out.printf("----------------------------------%n%n");
// Задача № 3
        System.out.printf("Задача № 3%n");
        // Вывод intArray в обратном порядке
        for (int i = intArray.length - 1; i >= 0; i--) {
            System.out.print(intArray[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }
        System.out.println();

        // Вывод doubleArray в обратном порядке
        for (int i = doubleArray.length - 1; i >= 0; i--) {
            System.out.print(doubleArray[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }
        System.out.println();

        // Вывод stringArray в обратном порядке
        for (int i = stringArray.length - 1; i >= 0; i--) {
            System.out.print(stringArray[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        System.out.printf("----------------------------------%n%n");
// Задача № 4
        System.out.printf("Задача № 4%n");
        // Исходный массив (заменен новым)
        intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Проходим по всему массиву с помощью цикла
        for (int i = 0; i < intArray.length; i++) {
            // Если число нечетное (остаток от деления на 2 не равен 0)
            if (intArray[i] % 2 != 0) {
                // Делаем его четным, прибавляя 1
                intArray[i] = intArray[i] + 1;
            }
        }

        // Выводим результат в консоль
        System.out.println(Arrays.toString(intArray));
        System.out.printf("----------------------------------%n");
    }
}