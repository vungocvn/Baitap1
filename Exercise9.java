import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao n");
        int n=scanner.nextInt();
        //for
        int i;
        for(i=2;i<=2*n;i+=2){
            System.out.println(i+"");
        }
    }
    }