import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao canh cua hinh chu nhat");
        int chieudaicanh = scanner.nextInt();
        //su dung vong lap for
        System.out.println("hinh a");
        for (int i = 1; i <= chieudaicanh; i++) {
            for (int j = 1; j <= chieudaicanh; j++) {
                if (i == 1 || i == chieudaicanh || j == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //hinh b
        System.out.println("hinh b");
        for (int i = 1; i <= chieudaicanh; i++) {
            for (int j = 1; j <= chieudaicanh; j++) {
                if (i == 1 || i == chieudaicanh || j == chieudaicanh) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //hinh c
        System.out.println("hinh c");
        for (int i = 1; i <= chieudaicanh; i++) {
            for (int j = 1; j <= chieudaicanh; j++) {
                if (i == chieudaicanh || j == 1 || j == chieudaicanh) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
