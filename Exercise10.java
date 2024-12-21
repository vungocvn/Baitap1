import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap n");
        int n=scanner.nextInt();
        int count=0;//bien dem
        int distance=1;//bien khoang cach
        //for
        int i;
        for(i=2;i<=n;i+=2){
            if(count==distance){
                System.out.println(-i+"");//in so am
                count=0;
                distance++;
            }
            else{
                System.out.println(i+"");//in so duong
                count++;
            }
        }
    }
}
