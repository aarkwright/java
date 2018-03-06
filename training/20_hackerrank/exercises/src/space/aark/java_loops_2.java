package space.aark;

import java.util.Scanner;

public class java_loops_2 {
    public static void calculate(String[] str) {
        for (String s : str) {
            Scanner in = new Scanner(s);
            int result = 0;

            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for (int j = 0; j < n; j++) {
                result += (int) (Math.pow(2, j) * b);
                System.out.printf("%d ", a + result);
            }
            System.out.print("\n");
            in.close();
        }
    }
}