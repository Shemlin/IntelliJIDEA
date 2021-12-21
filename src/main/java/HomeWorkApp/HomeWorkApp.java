package HomeWorkApp;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(5, -6);
        printColor(100);
        compareNumbers(6,6);
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(int a, int b) {
        if (a+b>0){
            System.out.println("Сумма положительнаяэ");
        } else {
            System.out.println("Сумма отрицательныя");
        }
    }

    public static void printColor(int vallue){
        if (vallue <= 0){
            System.out.println("Красный");
        }else if (vallue<=100){
            System.out.println("Желтый");
        }else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers(int a, int b){
        if (a>=b){
            System.out.println("a>=b");
        }else {
            System.out.println("a<b");
        }
    }
}
