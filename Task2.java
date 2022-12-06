import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int x = rand.nextInt(25);
        String str = words[x];
        boolean chek = false;
        System.out.println("Загадано слово! Введите слово:");
        while (chek == false) {
            String word = sc.nextLine();
            if (word != str) {
                int p = 15 - str.length();
                String s = "#" ;
                for (int i = 0; i < str.length(); i++) {
                    char m = str.charAt(i);
                    char n = word.charAt(i);
                    if (m == n) {
                        System.out.print(m);
                    } else {
                        System.out.print(s);
                    }
                }
                System.out.println(s.repeat(p));
                System.out.println("Введите слово: ");
            } else {
                chek = true;
                System.out.println("Вы победили!");
            }
        }
    }
}
