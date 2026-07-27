// Day 2: if else statement
import java.util.*;
public class Conditions {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age>18){
            System.out.print("Adult");
        }else{
            System.out.println("not adult");
        
        }
        sc.close();
    }
}