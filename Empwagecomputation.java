public class Empwagecomputation {

        public final String company;
        public final int empRatePerHour;
        public final int numOfWorkingDays;
        public final int maxHoursPerMonth;
        public int totalEmpWage;

        public Empwagecomputation(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
                this.company = company;
                this.empRatePerHour = empRatePerHour;
                this.numOfWorkingDays = numOfWorkingDays;
                this.maxHoursPerMonth = maxHoursPerMonth;
        }
        public void setTotalEmpWage(int totalEmpWage) {
                this.totalEmpWage = totalEmpWage;
        }

        public String toString() {
                return "Total Emp Wage for Company: "+company+" is "+totalEmpWage;
        }

    }

    public class EmpwagecomputationArray {

        public static final int IS_PART_TIME=1;
        public static final int IS_FULL_TIME=2;

        public int numOfCompany=0;

        Empwagecomputation Empwagecomputation[];

        public EmpwagecomputationArray()
        {
                Empwagecomputation=new Empwagecomputation[5];
        }

        private void addEmpwagecomputation(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth)
        {
                Empwagecomputation[numOfCompany]=new Empwagecomputation(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
                numOfCompany++;
        }

        private void computeEmpwage()
        {
                for (int i = 0; i <numOfCompany; i++)
                {
                        Empwagecomputation[i].setTotalEmpWage(this.computeEmpwage(Empwagecomputation[i]));
                        System.out.println(Empwagecomputation[i]);
                }
        }


       private int computeEmpwage(Empwagecomputation Empwagecomputation) {
       int empHrs=0, totalEmpHrs=0, totalWorkingDays=0;
       while( totalEmpHrs <= Empwagecomputation.maxHoursPerMonth && totalWorkingDays < Empwagecomputation.numOfWorkingDays ) {
         totalWorkingDays++;
         int empCheck=(int)Math.floor(Math.random()*10)%3;
         switch (empCheck) {
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
         totalEmpHrs=totalEmpHrs + empHrs;
         System.out.println("Day: " + totalWorkingDays + "employee hours: " +empHrs);
         }
        return totalEmpHrs * Empwagecomputation.empRatePerHour;
       }
       public static void main(String[] args) {
                EmpwagecomputationArray empwagecomputation=new EmpwagecomputationArray();
                empwagecomputation.addEmpwagecomputation("hcl", 20, 2, 10);
                empwagecomputation.addEmpwagecomputation("wipro", 10, 4, 20);
                empwagecomputation.computeEmpwage();
        }

}
