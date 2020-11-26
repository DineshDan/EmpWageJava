import java.util.Random;
public class Empwagecomputation {
public static void main(String[] args) {
   int empHrs;
   int salary;
   int IS_PART_TIME=1;
   int IS_FULL_TIME=2;
   int EMP_RATE_PER_HR=20;
   int NUM_WORKING_DAYS=20;
   int totalSalary=0;
   System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
   for(int day=1;day<=NUM_WORKING_DAYS;day++ )
   {
    Random random=new Random();
    int employeeType=random.nextInt(3);
    switch (employeeType) {
    case 1:
           empHrs=4;
           salary=(empHrs*EMP_RATE_PER_HR);
           break;
    case 2:
           empHrs=8;
           salary=(empHrs*EMP_RATE_PER_HR);
           break;
    default:
           empHrs=0;
           salary=(empHrs*EMP_RATE_PER_HR);
           break;
    }
    System.out.println("Day: "+day+" "+"Salary: "+salary);
    totalSalary=(totalSalary+salary);
   }
   System.out.println("Total Salary: "+totalSalary);
}
}
