package HomeWorkApp;

public class HomeworkAppLesson2 {
    public static void main(String[] args) {
        System.out.println(task1(1,12));
        task2(-1);
        System.out.println(task3(1));
        task4("отпечатать нужное количество раз", 6);

    }
    public static boolean task1(int a, int b) {
        int z = a + b;
        if (z >= 10 && z <=20){
            return true;
        }
        return false;
    }
    public static void task2(int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отприцательное");
        }
    }
    public static boolean task3 (int a) {
        if (a >= 0) {
            return false;
        }
        else {
            return true;
        }
    }
    public static void task4(String str, int a) {
        for (int i = 1; i <= a; i++) {
            System.out.println (str);
        }
    }
}
