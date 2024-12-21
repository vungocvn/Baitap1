import java.util.Scanner;

public class B6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //nhap n tu ban phim
        System.out.println("nhap vao so nguyen n");
        int n = scanner.nextInt();
        int i;
        //su dung vong lap for de lap tu 1 den n
        for (i = 1; i <= n; i++) {
            //dung dieu kien if de ktra xem i co chia het co 2 hay kh
            //neu co thi xuat ra so le
            if (i % 2 != 0) {
                System.out.println(i + "");
            }

        }

    }
}

