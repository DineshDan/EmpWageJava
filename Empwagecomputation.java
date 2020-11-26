import java.util.Random;
public class Empwagecomputation {
public static void main(String[] args) {
   int empHrs;
   int salary;
   int IS_PART_TIME=1;
   int IS_FULL_TIME=2;
   int EMP_RATE_PER_HR=20;
   System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
   Random random=new Random();
   int employeeType=random.nextInt(3);
   System.out.println("random number:"+employeeType);
   switch (employeeType) {
   case 1:
           empHrs=4;
           System.out.println("Employee hours: "+empHrs);
           salary=(empHrs*EMP_RATE_PER_HR);
           System.out.println("Salary: "+salary);
           break;
   case 2:
           empHrs=8;
           System.out.println("Employee hours: "+empHrs);
           salary=(empHrs*EMP_RATE_PER_HR);
           System.out.println("Salary: "+salary);
           break;
   default:
           empHrs=0;
           System.out.println("Employee hours: "+empHrs);
           salary=(empHrs*EMP_RATE_PER_HR);
           System.out.println("Salary: "+salary);
           break;
    }
  }
}
