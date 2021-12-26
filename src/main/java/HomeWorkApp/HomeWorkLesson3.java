package HomeWorkApp;

public class HomeWorkLesson3 {
    public static void main(String[] args) {
        System.out.print("task1" + " - ");
        task1();                                // выполняем метод task1
        System.out.print("\ntask2" + " - ");    // \n означает начало новой строки тоесть запись task2 начнет печататься с новой строки
        task2();                                // выполняем метод task2
        System.out.print("\ntask3" + " - ");
        task3();                                // выполняем метод task3
        System.out.println("\ntask4");
        task4();                                // выполняем метод task4
        System.out.print("\ntask5" + " - ");    // выполняем метод task5
        task5(5,10);

    }

    /**
     * Задача 1 заменить 1 на 0 и 0 на 1 в массиве
     */
    public static void task1(){
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0}; // обьявляем массив с нулями и еденичками с именем arr
        for (int i = 0; i < arr.length; i++) {      // обьявляем цикл в котором создаем индекс i который будет присваиваться к переменной arr
                if (arr[i] == 0) {                  // условие замены 0 на 1
                    arr[i] = 1;
                } else {                            // условие замены 1 на 0
                    arr[i] = 0;
                }
                System.out.print(arr[i] + " ");     // печатаем в одну строку
        }
    }

    /**
     * задача 2 создать массив длинной 100 и заполнить его цифрами от 1 до 100
     */
    public static void task2(){
        int[] arr1 = new int[100];                  // создаем новый массив arr1 длинною 100
        for (int i = 0; i < arr1.length; i++){      // создаем цикл в котором в котором обьявляем индек i для arr1
            arr1[i]= i + 1;                         // присваиваем каждому значению arr1 с индексом i значение i+1 так как отсчет индексов начинается с нуля
            System.out.print (arr1[i] + " ");       // печатаем в одну строку
        }
    }

    /**
     * задача 3 создать массив и числа в нем меньше 6 умножить на 2
     */
    public static void task3(){
        int[]arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};      // создаем массив что приведен в задаче
        for (int i = 0; i < arr2.length; i++) {                 // создаем цикл для этого массива
            if (arr2[i] < 6){                                   // создаем условие где идет проверка если значение arr2 с индексом i меньше 6
                arr2[i] = arr2[i]*2;                            // то умножить на 2
            }
            System.out.print(arr2[i] + " ");
        }
    }

    /**
     * задача 4 по созданию двумерного квадратного массива, и заполнению его диагоналей еденичками
     */
    public static void task4(){
        int n = 5;
        int[][] arr3 = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i == j){
                    arr3[i][j] = 1;
                } if (j == n - 1 - i) {
                    arr3[i][j] = 1;
                }
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * задача 5 Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue
     * @param len переменная
     * @param initialValue переменная
     */
    public static void task5(int len, int initialValue){
        int[] arr5 = new int[len];
        for (int i = 0; i < len; i++){
            arr5[i] = initialValue;
            System.out.print(arr5[i] + " ");
        }
    }
}

