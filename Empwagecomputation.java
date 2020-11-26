import java.util.Random;
public class Empwagecomputation {
public static void main(String[] args) {
   System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
   Random random=new Random();
   int attendance=random.nextInt(2);
   System.out.println("random number:"+attendance);
   if(attendance == 1)
   System.out.println("Employee is present!");
   else
   System.out.println("Employee is absent!");
  }
}
