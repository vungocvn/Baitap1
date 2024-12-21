import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chieu dai canh tam giac");
        int n = scanner.nextInt();
        System.out.println("hinh a");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            //xuong hang sau khi tao thanh mot dong
            System.out.println();
        }
        //hinh b
        System.out.println("hinh b");
        for(int i=1;i<=n;i++){
            //su dung 1 vong lap con in ra dau * giam dan
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //hinh c
        System.out.println("hinh c");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //hinh d
        System.out.println("hinh d");
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        //hinh e
        System.out.println("hinh e");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                if(i==1 || j==1 || j==n-i+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
        }
        //hinh f
        System.out.println("hinh f");
        for( int i=0;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //hinh g
        System.out.println("hinh g");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(n-i)*2+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
