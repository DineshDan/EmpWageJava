import java.util.Random;
public class Empwagecomputation {
public static void main(String[] args) {
   int empHrs;
   int IS_PART_TIME=1;
   int IS_FULL_TIME=2;
   int EMP_RATE_PER_HR=20;
   System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
   Random random=new Random();
   int attendance=random.nextInt(3);
   System.out.println("random number:"+attendance);
   if(attendance == IS_PART_TIME)
         empHrs=4;

   else if(attendance == IS_FULL_TIME)
           empHrs=8;

   else
        empHrs=0;

  System.out.println("Employee hours: "+empHrs);
  int salary=empHrs * EMP_RATE_PER_HR;
  System.out.println("Salary: "+salary);
   }
}
