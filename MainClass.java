public class MainClass {
    public static void main(String[] args) {
        byte a = 101;
        short b = 4596;
        int c = 723397;
        long d = 23794L;
        float i = 23.0f;
        double f = 743.739;
        boolean g = true;
        char h = 'R';

        System.out.println(task3( 2, 3, 6,2));
        System.out.println(task4(10,12));
        task5(-10);
        System.out.println(task6(10));
        task7("Lina");
        task8(2100);
    }

    public static int task3 (int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    public static boolean task4 (int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void task5 (int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean task6 (int a) {
        if (a < 0) {
            return true;
        }
        return false;
    }

    public static void task7 (String name) {
        System.out.println("Привет, " + name + "!");
    }

    public static void task8 (int year) {
        if ((year % 4 == 0 && year % 100 != 0 ) || (year % 400 == 0)){
            System.out.println("Год високосный");
        } else {
            System.out.println("Год невисокосный");
        }
    }
}
