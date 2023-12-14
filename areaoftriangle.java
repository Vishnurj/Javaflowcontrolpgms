import java.util.Scanner;

public class areaoftriangle {

  
//Area of triangle = (1/2) * base * height

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double  height;
    double base;
    double area;

    System.out.println("enter the height");
    height = sc.nextDouble();

    System.out.println("enter the base");
    base = sc.nextDouble();

    area = 0.5 * height * base;
    System.out.println("area of the triangle :" +area);

    sc.close();


  }
  
}
