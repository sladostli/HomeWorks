import java.util.Random;
import java.util.Scanner;

public class Task2{
    public static char[][] map;
    public static final int a = 3;
    public static final int b = 3;
    public static final char ch = '.';
    public static final char X = 'X';
    public static final char O = 'O';

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            human();
            printMap();
            if (check(X)) {
                System.out.println("Победил человек");
                break;}
            if (isMapFull()) {
                System.out.println("Ничья");
                break;         }
            ai();
            printMap();
            if (check(O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;         }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;         }     }
        System.out.println("Игра закончена");
    }
    public static void initMap() {
        map = new char [a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                map[i][j] = ch;}
        }
    }

    public static void printMap() {
        for (int i = 0; i <= a; i++) {
            System.out.print(i + " ");}
        System.out.println();
        for (int i = 0; i < a; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < a; j++) {
                System.out.print(map[i][j] + " ");}
            System.out.println();}
        System.out.println();}

    public static Scanner sc = new Scanner(System.in);
    public static void human() {
        int x, y;
        do{
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;     }
        while (!isCellValid(x, y));
        map[y][x] = X; }
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= a || y < 0 || y >= a) return false;
        if (map[y][x] == ch) return true;
        return false; }
    public static Random rand = new Random();
    public static void ai() {
        int x, y;
        do {
            x = rand.nextInt(a);
            y = rand.nextInt(a);}
        while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = O; }
    public static boolean check(char symb) {
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 1; j++){
                if (map[i][j] == symb && map[i][j+1] == symb && map[i][j+2] == symb) return true;
            }
        }
        for (int i = 0; i < 1; i++){
            for (int j = 0; j < 3; j++){
                if (map[i][j] == symb && map[i+1][j] == symb && map[i+2][j] == symb) return true;}
        }
        for (int i = 0; i < 1; i++){
            for (int j = 0; j < 1; j++){
                if (map[i][i] == symb && map[i+1][i+1] == symb && map[i+2][i+2] == symb) return true;
            }
        }
        for (int i = 0; i < 1; i++){
            for (int j = 0; j < 1; j++){
                if (map[i+2][i] == symb && map[i+1][i+1] == symb && map[i][i+2] == symb) return true;
            }
        }
        return false;
    }
    public static boolean isMapFull() {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (map[i][j] == ch) return false;}
        }
        return true;     }
}