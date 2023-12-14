import java.util.Scanner;

public class add {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1, num2, sum;

    System.out.println("enter the num1");
    num1 = sc.nextInt();

    System.out.println("enter the num2");
    num2 = sc.nextInt();

    sum = num1 + num2;
    System.out.println("sum of the number is :" +sum);

    sc.close();
  }
  
}
