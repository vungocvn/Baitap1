import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap vao canh cua hinh");
        int chieudaicanh=scanner.nextInt();
        System.out.println("hinh a");
        for(int i=1;i<=chieudaicanh;i++){
            for(int j=1;j<=chieudaicanh;j++){
               if(i==1 || i==chieudaicanh ||i==j){
                   System.out.print("*");
               }
               else{
                   System.out.print(" ");
               }
            }
            System.out.println();
        }
        //hinh b
        System.out.println("hinh b");
        for(int i=1;i<=chieudaicanh;i++){
            for(int j=1;j<=chieudaicanh;j++){
                if(i==1 ||i==chieudaicanh || j==chieudaicanh-i+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
