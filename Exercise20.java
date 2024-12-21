import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhap vao mot chu cai");
        char character= scanner.next().charAt(0);
        //goi phuong thuc de chuyen chu hoa ve chu thuong
        System.out.println("chuyển chữ hoa về chữ thường là:"+ tolowerCase(character));
    }
    static char tolowerCase(char c){
        if(c>='A' && c<='Z' ){
            //doi ky tu hoa thanh ky tu thuong bang cach tang gia tri ASCII len 32
            c +=32;
        }
        return  c;
    }

}
