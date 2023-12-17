package flowcontrolprograms;

import java.util.Scanner;

public class exponent {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter the base");
    int a = sc.nextInt();
    System.out.println("enter the exponent");
    int b = sc.nextInt();

    System.out.println(Math.pow(a, b));
    sc.close();
    
  }
  
  
    


  
  
}
