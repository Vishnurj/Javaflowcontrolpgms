import java.util.Scanner;

//Printing area of circle

public class areaofCircle {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int radius ;
    double area;
    System.out.println("enter the radius  of the circle");
    radius = sc.nextInt();
    area = 3.14 * radius * radius;
    System.out.println("area of circle is:"+area);

    sc.close();

  }
  
}
