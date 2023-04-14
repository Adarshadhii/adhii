/*import java.util.Scanner;
public class practice_set_14{
    public static void main(String args[]){
         int n = 4;
        
         for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}*/
//PROBLEM 2
/*import java.util.Scanner;
public class practice_set_14{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i= 0;i<n;i++){
          if(i%2==0){
          sum += i ;
          }
        }
          System.out.println("SUM : "+sum);
    }
}*/
//PROGRAM 3
/*import java.util.Scanner;
public class practice_set_14{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int fact =1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println("Factorial : "+fact);
    }
}*/
//PROgarm 4
/*import java .util.Scanner;
public class practice_set_14{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any table number : ");
        int n = sc.nextInt();
        int mul =1;int i;
        for( i=1;i<n;i++){
              mul*=i;
              System.out.format("%d * %d = %d\n",n,i,n*i);
        }
        
    }
}*/
//PROGRAM 4
/*import java .util.Scanner;
public class practice_set_14{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any table number : ");
        int n = sc.nextInt();
        int mul =1;int i;
        for( i=n;i>0;i--){
              mul*=i;
              System.out.format("%d * %d = %d\n",n,i,n*i);
        }
        
    }
}*/
//PROGRAM 9import java .util.Scanner;
/*public class practice_set_14{
    public static void main(String args[]){
       // Scanner sc = new Scanner(System.in);
        //System.out.print("Enter any table number : ");
        int n = 8; int sum=0;
        int mul =1;int i;int s;
        for( i=n;i>0;i--){
              mul*=i;
              System.out.format("%d * %d = %d\n",n,i,n*i);
              s =n*i;
              sum+=s;
               
             
        }
        System.out.println("Sum : "+sum);
    }
}*/
//PROGRAM 11
/*import java.util.Scanner;
public class practice_set_14{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;int i=0;
        while(i<=n){
          if(i%2==0)
          sum = sum+i ;
          i++;
          
        }
          System.out.println("SUM : "+sum);
    }
}*/

//PROGRAM 6

import java.util.Scanner;
public class practice_set_14{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int fact =1;int i=1;
        while(i<=n){
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial : "+fact);
    }
}