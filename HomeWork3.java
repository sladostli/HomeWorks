import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HomeWork3.game();
    }
    public static void game() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int x = rand.nextInt(10);
        boolean chek = false;
        System.out.println("Загадано число от 0 до 9!");
        for (int i = 0; i < 3; i++) {
            int chance = 3 - i;
            System.out.println("Осталось " + chance + " попытки!");
            System.out.println("Введите число: ");
            int a = sc.nextInt();
            if (a == x) {
                System.out.println("Вы победили!");
                chek = true;
                break;
            } else if (a > x) {
                System.out.println("Загаданное число меньше!");
            } else {
                System.out.println("Загаданное число больше!");
            }
        }
        if (chek == false) {
            System.out.println("Вы проиграли! Это было число " + x);
        }
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        int ver = sc.nextInt();
        if (ver == 1) {
            HomeWork3.game();
        }

    }

}