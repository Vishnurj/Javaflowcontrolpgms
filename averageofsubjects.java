import java.util.Scanner;

//finding total and average among 3 subjects marks

public class averageofsubjects {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int sub1, sub2, sub3,total,avg;
     System.out.println("enter the subject 1 marks ");
     sub1 = sc.nextInt();
     System.out.println("enter the subject 2 marks ");
     sub2 = sc.nextInt();
     System.out.println("enter the subject 3 marks");
     sub3 = sc.nextInt();

     total = sub1+sub2+sub3;
     System.err.println("Total marks of all the subject are :" +total);

     avg = total/3;
     System.out.println("Avg is:" +avg);

     sc.close();

  }
  
}
