import java.util.Scanner;
 public class kilometers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Kilometers : ");
       float kilo = sc.nextInt();
        double mile = 0.621 * kilo;
        System.out.println("MILES : "+mile);

    }

 }
    
 