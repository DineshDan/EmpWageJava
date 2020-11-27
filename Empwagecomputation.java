public class Empwagecomputation {
public static final int IS_PART_TIME = 1;
public static final int IS_FULL_TIME = 2;
public static int Empwagecomputation(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth){
int emphrs = 0, totalemphrs = 0, totalworkingdays = 0;
while (totalemphrs <= maxHoursPerMonth && totalworkingdays < numOfWorkingDays)
{
totalworkingdays++;
int empcheck = (int) Math.floor(Math.random() * 10) % 3;
switch (empcheck) {
case IS_PART_TIME:
emphrs = 4;
break;
case IS_FULL_TIME:
emphrs = 8;
break;
default:
emphrs = 0;
}
totalemphrs += emphrs;
System.out.println("Day#: " + totalworkingdays + " Emp Hr: " +emphrs);
}
int totalEmpwage  =  totalemphrs * empRatePerHour; 
System.out.println("Total Emp Wage for company : " +company+" is: "+totalEmpwage);
return totalEmpwage;
}
public static void main(String args[]) {
Empwagecomputation("HCL", 20, 2, 10);
Empwagecomputation("Dell", 10, 4, 20);
}
} 
