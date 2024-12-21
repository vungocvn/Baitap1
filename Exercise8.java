import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap so nguyen n tu ban phim");
        int n= scanner.nextInt();
        //su dụng vòng lặp for
        int i;
        for(i=2 ;i<=n;i+=2){
          if(i%6==0){
              System.out.println(-i+"");
          }
          else{
              System.out.println(i+"");
          }
        }
    }
}
