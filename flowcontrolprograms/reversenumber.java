package flowcontrolprograms;

import java.util.Scanner;

public class reversenumber {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int reverse = 0;
    System.out.println("enter the number");
    int number = sc.nextInt();
    for(;number!= 0;){
      
      int remainder = number%10;
      reverse = reverse*10+remainder;
      number = number/10;
      sc.close();
    }
      System.out.println("the reverse number is :"+reverse);

      

    }
    
  }
  

