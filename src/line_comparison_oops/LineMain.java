package line_comparison_oops;

import java.util.Scanner;

import static line_comparison_oops.LineComparison.line_length;

public class LineMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 coordinate: ");
        int a1 = sc.nextInt();
        System.out.print("Enter x2 coordinate: ");
        int a2 = sc.nextInt();
        System.out.print("Enter y1 coordinate: ");
        int b1 = sc.nextInt();
        System.out.println("Enter y2 coordinate: ");
        int b2 = sc.nextInt();
        double lineOfFirst = line_length(a1, a2, b1, b2);

        System.out.print("Enter x3 coordinate: ");
        int a3 = sc.nextInt();
        System.out.print("Enter x4 coordinate: ");
        int a4 = sc.nextInt();
        System.out.print("Enter y3 coordinate: ");
        int b3 = sc.nextInt();
        System.out.print("Enter y4 coordinate: ");
        int b4 = sc.nextInt();
        double lineOfSecond = line_length(a3, a4, b3, b4);
        String s1 = String.valueOf(lineOfFirst);
        String s2 = String.valueOf(lineOfSecond);

    }
}
