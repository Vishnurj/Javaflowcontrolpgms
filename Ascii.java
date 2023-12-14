import java.util.Scanner;

//Program to display ASCII value of alphabets.

public class Ascii {
  public static void main(String[] args) {
        int value;
        char ch;

    Scanner sc = new Scanner(System.in);
    System.out.println("enter the alphabet");
      ch = sc.next().charAt(0);

      value = ch;

      System.out.println("the value of chararcter is:"+value);

      sc.close();






    System.out.println();

    
    
  }
}
  

