package flowcontrolprograms;

import java.util.Scanner;

public class squarert {


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number ");
    double number = sc.nextDouble();


    double squareroot = Math.sqrt(number);

    System.out.println(squareroot);
    sc.close();


  }
  
}
