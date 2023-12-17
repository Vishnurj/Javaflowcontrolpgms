
package flowcontrolprograms;

import java.util.Scanner;

/**
 * factors
 */
public class factors {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("enter the number");
    int num = sc.nextInt();
    System.out.println("the factors of number are");
  for (int i = 1; i < num ; i++) {
       if(num % i == 0)
       {
        System.out.println(i+" ");
       
       }    
       

       sc.close();;
  }
  }

  
}