import java.util.Random;
public class Empwagecomputation {
public static void main(String[] args) {
   int empHrs;
   int IS_PART_TIME=1;
   int IS_FULL_TIME=2;
   int EMP_RATE_PER_HR=20;
   int MAX_HRS_IN_MONTH=10;
   int NUM_WORKING_DAYS=20;
   int totalEmpHrs=0;
   int totalWorkingDays=0;
   System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
   while( totalEmpHrs < MAX_HRS_IN_MONTH && totalWorkingDays < NUM_WORKING_DAYS ) {
         totalWorkingDays++;
         System.out.println("Total working day: "+totalWorkingDays);
         Random random=new Random();
         int employeeType=random.nextInt(3);
         switch (employeeType) {
          case 1:
                 empHrs=4;
                 break;
          case 2:
                 empHrs=8;
                 break;
         default:
                 empHrs=0;
                  break;
        }
   totalEmpHrs=(totalEmpHrs + empHrs);
   System.out.println("Total Employee Hours: "+totalEmpHrs);
}
   int totalSalary=(totalEmpHrs*EMP_RATE_PER_HR);
   System.out.println("Total Salary: "+totalSalary);

  }
}
