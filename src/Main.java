public class Main {
    public static void main(String[] args) {
        task1 ();
        task2();
    }
    public static void task1 () {
        System.out.println("Задача 1");
    }
    int [] number = new int [] {1,2,3};
    double [] number2 = {1.57d, 7.654d, 9.986d};
    int [] weekDays = {1,2,3,4,5,6,7};

    public static void task2 () {
        System.out.println("Задача 2");

        int [] number = new int [] {1,2,3};
        for (int i = 0; i < 3 ; i++) {
            if (number [i] <= 2) {
                System.out.print(number [i] + ",");
            } else {
                System.out.println(number [i]);
            }
        }
        double [] number2 = {1.57d, 7.654d, 9.986d};
        for (int i = 0; i < 2; i++) {
            if (number2 [i] <= 2) {
                System.out.print(number2 [i] + ",");
            } else {
                System.out.print(i);
            }

        }
    }
}