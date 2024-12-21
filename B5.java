import java.util.Scanner;

public class B5 {
    // In dãy số 1, 2, 3, 4, 5,..., n
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //nhap so nguyen n tu ban phim
        System.out.println("nhap vao so nguyen n");
        int n = scanner.nextInt();
        //phai khai bao bien nguyen i
        int i;
        for (i = 1; i <= n; i++) {
            //in ra day so tu 1 den n
            System.out.println(i + "\t");
        }
    }
}
