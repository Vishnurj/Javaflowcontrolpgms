package flowcontrolprograms;

import java.util.Scanner;

public class leapyear {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  System.out.println("enter the year ");
  int a = sc.nextInt();

  if((a%4==0)||(a%400==0)&&(a%100!=0))
  {
    System.out.println("it's leap year");
  }
  else{
    System.out.println("it's mot leap year");
  }

 sc.close();

  }
  
}
