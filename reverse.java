import java.util.Scanner;
public class reverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n,rev=0,t;
        
        n = sc.nextInt();
        while(n > 0){
           rev = (rev * 10) + n % 10;
           n/= 10;
        }
        if(n == rev)
        System.out.println("Palindrome");
        else 
        System.out.println("Not Palindrome");
    }
    
}
