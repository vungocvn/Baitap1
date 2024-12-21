import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("hay nhap vao mot so nguyen duong");
        int n=scanner.nextInt();
        //khởi tạo một biến để lưu trữ
        String binary="";
        //chuyển đổi n thành hệ nhị phân
        while (n > 0) {
                int remainder= n%2;
                binary=remainder + binary;
                n= n/2;
        }
        System.out.println("số nhị phân tương ứng là "+binary);
    }
}
