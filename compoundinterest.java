import java.util.Scanner;

public class compoundinterest {


  //compound interest formula A = P*(1 + r/n)^(n*t)
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("enter the principal");
    double p  = sc.nextDouble();

    System.out.println("enter the interestrate");
    double r  = sc.nextDouble();
    r = r/100;

    System.out.println("enter the total number of years");
    double t = sc.nextDouble();

    System.out.println("enter the number of compounding a years");
    int n = sc.nextInt();

    double A = p*Math.pow((1 + r/n),n*t);
    System.out.println("total amount:"+A);

    double compoundinterest = A -  p;
    System.out.println(compoundinterest);

    sc.close();



    
  }
  
}
