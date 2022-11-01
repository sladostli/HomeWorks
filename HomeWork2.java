import java.util.Arrays;


public class HomeWork2 {


    public static void main(String[] args) {
        HomeWork2.task1();
        HomeWork2.task2();
        HomeWork2.task3();
        HomeWork2.task4();
        HomeWork2.task5();
        System.out.println(HomeWork2.task6( new int[] {1, 1, 2}));
    }


    public static void task1() {
        int[] arr = {1, 1, 0, 0, 0, 1, 0, 1, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task2() {
        int[] arr = new int[8];
        arr[0] = 0;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + 3;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task3() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task4() {
        int[][] arr = new int [5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr).replace("], ", "]\n"));
    }

    public static void task5() {
        int[] arr = {1, 12, 5, 6, 15, 11, 4, 8, 3, 7};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                max = arr[i];
            }
        }
        System.out.println("Минимальный элемент - " + min);
        System.out.println("Максимальный элемент - " + max);
    }

    public static boolean task6(int[] a) {
        int left = 0;
        int sum = 0;
        boolean chek = false;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        for (int i = 0; i < a.length - 1; i++) {
            left += a[i];
            if (left * 2 == sum) {
                chek = true;
                break;
            }

        }
        return chek;

    }

}

