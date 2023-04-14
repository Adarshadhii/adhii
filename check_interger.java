import java.util.Scanner;
public class check_interger {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int a = sc.nextInt();
        System.out.println(sc.hasNextInt());

    }
}
