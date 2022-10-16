import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1 TASK
        int a = 1230;
        int b = 122;
        int c = 22220;

        if (a > b)
            if (a > c) {
                System.out.println(a);
            }
        if (b > a)
            if (b > c) {
                System.out.println(b);
            }
        if (c > a)
            if (c > b) {
                System.out.println(c);
            }
        //1.1 TASK
        Scanner scanner = new Scanner(System.in);
        int room = scanner.nextInt();
        if (room >= 1 && room <= 20) {
            System.out.println("first entrance");
        }
        if (room >= 21 && room <= 48) {
            System.out.println("second entrance");
        }
        if (room >= 49 && room <= 90) {
            System.out.println("third entrance");
        }
        //2 TASK
        int sum = 0;
        for (int i = 1; i <= 200; i++) {
            sum += i;
        }
        System.out.println(sum);
        // 3 TASK
        for (int i = 1; i <= 50; i++) {
            System.out.println("Tip");
            for (int j = 1; j <= 1; j++) {
                System.out.println("Top");
            }
        }
        //4
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.println(i);
        }
        //5
        for (int i = 100; i >= 1; i--) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

}