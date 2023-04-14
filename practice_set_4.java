//Program 2
/*import java.util.Scanner;
public class practice_set_4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the maths marks : ");
        float a = sc.nextFloat();
        System.out.println("Enter the physics marks : ");
        float b = sc.nextFloat();
        System.out.println("Enter the chemistry marks : ");
        float c = sc.nextFloat();
        float avg =(a+b+c)/3.0f;
        System.out.println("Average : "+avg);

        if(avg>=40 && a >= 33 && b >= 33 && c >= 33){
            System.out.println("Congrats!You have been passed");
        }
        else{
            System.out.println("You have not passed ...!");
        }
    }
}*/
//PROGRAM/* 
/*import java.util.Scanner;
public class practice_set_4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income in lakhs : ");
        float income = sc.nextFloat();
        float tax = 0;
        if(income<2.5f){
            tax = tax+0;
        }
        else if(income > 2.5f && income < 5.0f){
            tax = tax +0.05f*(income - 2.5f);
        }
        else if(income > 5f && income < 10.0f){
            tax = tax+0.05f*(income-2.5f);
            tax = tax+0.2f*(income-5f);
        }
        else if (income > 10.0f){
            tax = tax+0.05f*(5.0f -2.5f);
            tax = tax+0.2f*(10.0f-5.0f);
            tax = tax+0.3f*(income - 10.0f);
        }
        System.out.println("The total tax paid by the employee is :"+tax);
    }
}*/
//PROGRAM 4
/*import java.util.Scanner;
public class practice_set_4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number from 1 to 7 : ");
        int day = sc.nextInt();
        switch(day){
            case 1 : System.out.println("MONDAY");
            break;
            case 2 : System.out.println("TUESDAY");
            break;
            case 3 : System.out.println("WEDNESDAY");
            break;
            case 4 : System.out.println("THRUSDAY");
            break;
            case 5 : System.out.println("FRIDAY");
            break;
            case 6 : System.out.println("SATURDAY");
            break;
            case 7 : System.out.println("SUNDAY");
            break;
            default :System.out.println("LNVALID VID OPTION PLZ TRY AGAIN");
        }
    }
}*/
//PROGRAM 5
import java.util.Scanner;
public class practice_set_4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you website URL : ");
        String website = sc.next();
        if (website.endsWith(".org")){
            System.out.println("It is a Organisation wesbite");
        }
        if (website.endsWith(".com")){
            System.out.println("It is a Commerical  website");
        }
        if (website.endsWith(".in")){
            System.out.println("It is a Indian webite");
        }

    }
}