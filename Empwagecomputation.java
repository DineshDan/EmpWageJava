import java.util.Random;
public class Empwagecomputation {
public static void main(String[] args) {
   int isPresent=1;
   int salary;
   System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
   Random random=new Random();
   int attendance=random.nextInt(2);
   System.out.println("random number:"+attendance);
   if(attendance == isPresent) {

        System.out.println("Employee is present!");
        int empHrs=8;
        int ratePerHour=20;
        salary=empHrs * ratePerHour;
   }
   else {

        System.out.println("Employee is absent!");
        salary=0;
   }
  System.out.println("Salary: "+salary);
  }
}
