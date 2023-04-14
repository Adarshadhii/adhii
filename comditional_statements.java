import java.util.Scanner;
public class comditional_statements {
    
    public static void main(String args[]){
        //if statements
       Scanner sc = new Scanner(System.in);
       System.out.print("ENTER YOUR AGE : ");
       int age = sc.nextInt();
         if(age > 18){
            System.out.println("YOU ARE ELIGIBLE TO VOTE");
            System.out.println("YOU CAN DRIVE");
         }
         else{
            System.out.println("YOU ARE NOT ELIGIBLE TO VOTE");
            System.out.println("YOU CAN NOT DRIVE BIKE");
         }
    }
}
