import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("hay nhap vao canh cua hinh");
        int chieudaicanh=scanner.nextInt();
        for(int i=1;i<=chieudaicanh;i++){
            for(int j=1;j<=chieudaicanh;j++){
                if(i==1 || i==chieudaicanh || j==1 || j==chieudaicanh || i==j){
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
