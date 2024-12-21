import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so nguyen a");
        int a = scanner.nextInt();
        System.out.println("nhap vao so nguyen b");
        int b = scanner.nextInt();
        //cho i chay tu a ve 1
        int uscln = 1;

        for (int i = a; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                uscln = i;
                break;
            }
        }
        //tim bscnn
        int bscnn;
        for (int i = a; true; i++) {
            if (i % a == 0 && i % b == 0) {
                bscnn = i;
                break;
            }
        }
        System.out.println("ước số chung lớn nhất của" + a + "và" + b + "là" + uscln);
        System.out.println("bội số chung nhỏ nhất của" + a + "và" + b + "là" + bscnn);
    }
}
