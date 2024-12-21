import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        int factorialA = 1, factorialB = 1, factorialC = 1;
        do {
            System.out.println("nhap so nguyen duong a:");
            a = scanner.nextInt();
            if (a <= 0) {
                System.out.println("bạn cần nhập vào số dương, xin hãy nhập lại !");
            }
        } while (a <= 0);
        //nhap vao so nguyen duong b
        do {
            System.out.println("nhap vao so nguyen duong b:");
            b = scanner.nextInt();
            if (b <= 0) {
                System.out.println("bạn cần nhập vào số dương, xin hãy nhập lại!");
            }
        } while (b <= 0);
        //nhap vao so nguyen duong c
        do {
            System.out.println("nhap vao so nguyen duong c:");
            c = scanner.nextInt();
            if (c <= 0) {
                System.out.println("bạn cần nhập vào số dương, xin hãy nhập lại!");
            }
        } while (c <= 0);
        //b2 tinh giai thua cua a,b,c
        for (int i = 1; i <= a; i++) {
            factorialA *= i;
        }
        for (int i = 1; i <= b; i++) {
            factorialB *= i;
        }
        for (int i = 1; i <= c; i++) {
            factorialC *= i;
        }
        //b3 cong lai
        int s = factorialA + factorialB + factorialC;
        //b4 xuat ra kq
        System.out.printf("Tổng của %d!+%d!+%d!=%d", a, b, c,s);
    }
}
