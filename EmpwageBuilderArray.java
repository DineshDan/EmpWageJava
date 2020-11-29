public class EmployeewageBuilderArray implements IComputeEmpwage {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	public int numOfCompany = 0;

	CompanyEmpwage companyEmpwage[];

	public EmployeewageBuilderArray() {
		companyEmpwage = new CompanyEmpwage[5];
	}

	public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		companyEmpwage[numOfCompany] = new CompanyEmpwage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
		numOfCompany++;
	}

	public void computeEmpwage() {
		for (int i = 0; i < numOfCompany; i++) {
			companyEmpwage[i].setTotalEmpwage(this.computeEmpwage(companyEmpwage[i]));
			System.out.println(companyEmpwage[i]);
		}
	}

	public int computeEmpwage(CompanyEmpwage companyEmpwage) {
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		Random random = new Random();
		while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays) {
			totalWorkingDays++;

			int empCheck=(int) Math.floor(Math.random() * 10)%3;
			switch (empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;

			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("day: " + totalWorkingDays + "EmpHrs: " + empHrs);
		}

		return totalEmpHrs * companyEmpwage.empRatePerHour;
	}

	public static void main(String[] args) {
		EmployeewageBuilderArray empWageBuilder = new EmployeeWageBuilderArray();
		EmpwageBuilder.addCompanyEmpWage("Dmart", 20, 2, 10);
		EmpwageBuilder.addCompanyEmpWage("Reliance", 10, 4, 20);
		EmpwageBuilder.computeEmpWage();
	}
}
