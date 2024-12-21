import java.util.Scanner;

public class B2_cach2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so nguyen n tu ban phim");
        int n = scanner.nextInt();
        int i;
        //su dung vong lap for
        for (i = 1; i <= n; i += 2) {
            System.out.println(i + "");
        }
    }
}
