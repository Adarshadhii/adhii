/*public class arrays1d {
    public static void main(String args[]){
        float [] percen = {19.3f,83.74f,74.743f,737.7f,48.73f,74.74f};
        for(int i=0;i<percen.length;i++){
            System.out.println(percen[i]);
        }
    }
}*/
//USING FOR-EACH METHOD
import java.util.Scanner;
class arrays1d{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int [] marks;
        marks = new int[5]; //=sc.nextlnt();
        marks[0] = 183;
        marks[1] = 188;
        marks[2] = 192;
        marks[3] = 183;
        marks[4] = 18;
        for(int elements:marks){
            System.out.println(elements);
            System.out.println(marks.length);
        }

    }
}

