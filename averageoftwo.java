import java.util.Scanner;

//finding average among 2 subject scores

public class averageoftwo {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int avg ,num1,num2;

    System.out.println("enter the num1");
    num1 = scan.nextInt();

    System.out.println("enter the num2");
    num2 = scan.nextInt();

    System.out.println("the average of two numbers");
    avg = num1+num2/2;

    System.out.println(avg);
    scan.close();


  }
  
}
