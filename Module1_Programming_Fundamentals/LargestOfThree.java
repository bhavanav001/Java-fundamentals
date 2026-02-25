package Module1_Programming_Fundamentals;
import java.util.Scanner;
public class LargestOfThree{
  
  public static void main(String[] args){
    int largest;
    Scanner sc =new Scanner(System.in);
    System.out.print("enter first number:");
        int a = sc.nextInt();

        System.out.print("enter second number:");
        int b = sc.nextInt();

        System.out.print("enter third number:");
        int c = sc.nextInt();

        if(a>=b && a>=c){
          largest=a;
        }
        else if (b>=a && b>=c){
          largest=b;

        }
        else
        {
          largest = c;

        }
        System.out.println("largest number is:"+largest);
        sc.close();
        }
  }
