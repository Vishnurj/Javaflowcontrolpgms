import java.util.Scanner;

//calculating simple interest

public class simpleInterest {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int principal;
    double time;
    double rateofinterest;

    System.out.println("enter the principal amount");
    principal = sc.nextInt();

    System.out.println("enter the time");
    time = sc.nextDouble();

    System.out.println("enter the rateofinterest");
    rateofinterest = sc.nextDouble();




     double simpleinterest = principal*time*rateofinterest/100;
    System.out.println("the simple interest is:"+simpleinterest);

    System.out.println("Total amount to be paid:"+(principal+simpleinterest));

    sc.close();
  }


  
}
