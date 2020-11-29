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
        public void setTotalEmpwage(int totalEmpwage) {
                this.totalEmpwage = totalEmpwage;
        }

        public String toString() {
                return "Total Emp Wage for Company: "+company+" is "+totalEmpwage;
        }

    }



