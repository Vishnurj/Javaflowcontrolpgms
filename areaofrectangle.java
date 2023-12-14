import java.util.Scanner;

public class areaofrectangle {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double length;
    double  width;

    System.out.println("enter the length of rectangle");
    length = sc.nextDouble();
    System.out.println("enter the width of rectangle  ");
    width = sc.nextDouble();
    double area = length * width;
    System.out.println("area of rectangle is "+area);

    sc.close();


    
  }
  
}
