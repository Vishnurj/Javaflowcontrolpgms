package flowcontrolprograms;

import java.util.Scanner;

public class Lcmoftwo {

  public static void main(String[] args) {
    int t1, t2 , num1 ,num2 , hcf ,lcm;
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the number1");
      num1 = sc.nextInt();
     System.out.println("enter the number2");
      num2 = sc.nextInt();
      sc.close();

     t1 = num1;
     t2 = num2;

     while (t2!=0)
     {
       int temp = t2;
       t1 = t1 % t2;
       t2 = temp;
     }
     hcf = t1;
     lcm = (num1*num2)/hcf;
     
     System.out.println(hcf);
     System.out.println(lcm);
    
  }

 
  

  
  
}
