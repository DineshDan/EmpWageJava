public class Empwagecomputation {
public static final int IS_PART_TIME = 1;
public static final int IS_FULL_TIME = 2;

private final String company ;
private final int empRatePerHour ;
private final int numOfWorkingDays ;
private final int maxHoursPerMonth ;
private int totalEmpwage;
public Empwagecomputation(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth){
super();
this.company=company;
this.empRatePerHour=empRatePerHour;
this.numOfWorkingDays=numOfWorkingDays;
this.maxHoursPerMonth=maxHoursPerMonth;
}

public void computeEmpwage()
{
int emphrs = 0, totalemphrs = 0, totalworkingdays = 0;
while (totalemphrs <= maxHoursPerMonth && totalworkingdays < numOfWorkingDays)
{
int empcheck = (int) Math.floor(Math.random() * 10) % 3;
totalworkingdays++;
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
 totalEmpwage  =  totalemphrs * empRatePerHour;
}



        public String toString() {
                return "Total Emp Wage for Company: " +company+ " is: " + totalEmpwage;
        }
        public static void main(String[] args) {
                Empwagecomputation Tesla=new Empwagecomputation("Tesla", 20, 2, 10);
                Empwagecomputation reliance=new Empwagecomputation("Reliance", 10, 4, 20);

                Tesla.computeEmpwage();
                System.out.println(Tesla);


                reliance.computeEmpwage();
                System.out.println(reliance);

        }

}
