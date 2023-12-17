package flowcontrolprograms;

import java.util.Scanner;

public class multiplicationTable {

  public static void printmultiplicationTable(int number)
  {
    System.out.println("enter the number");
    for(int i = 0;i<=10 ;i++)
    {
        System.out.println(number +" * " +i+" = "+number * i);
    }
  }

  public static void main(String[] args) {
    int number = 0;
    Scanner sc =new Scanner(System.in);

    System.out.println("enter the Integer");
    number = sc.nextInt();

    System.out.println("Multiplication of the "+number +"is :");
    printmultiplicationTable(number);
    
    
    sc.close();;
    
  }
  
}
