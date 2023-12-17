package flowcontrolprograms;

import java.util.Scanner;

/**
 * Largestnumber
 */
public class Largestnumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("enter the num1");
    int num1 = sc.nextInt();
    System.out.println("enter the num2");
    int num2 = sc.nextInt();
    System.out.println("enter the num3");
    int num3 = sc.nextInt();

    if(num1>=num2 && num1>=num3)
    {
        System.out.println("the num1 is largest:"+num1);
    }
     else if(num2>=num1 && num2>=num3)
    {
      System.out.println("the num2 is largest:"+num2);
    }
    else{
      System.out.println("the num2 is largest:"+num3);
    }
    sc.close();


  }
  
}