import java.util.Scanner;

public class swapofnumbers {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a,b;
    System.out.println("enter the number a");
    a = sc.nextInt();
    System.out.println("enter the number b");
    b = sc.nextInt();

    a = a + b;
    b = a - b;
    a = a - b;

    System.out.println("a is "+a);
    System.out.println("b is "+b);
    

    sc.close();
    

  }
  
}
