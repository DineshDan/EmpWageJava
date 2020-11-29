import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;


public class EmployeewageBuilderArray implements IComputeEmpwage {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	public int numOfCompany = 0;

	private LinkedList<CompanyEmpwage> companyEmpwageList;
	private Map<String, CompanyEmpWage>companyEmpageMap;

	public EmployeewageBuilderArray() {
	companyEmpwageList= new LinkedList<CompanyEmpwage>();
	companyEmpwageMap=new HashMap<String, CompanyEmpwage>();
	}

	public void addCompanyEmpwage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		companyEmpwage companyEmpwage = new CompanyEmpwage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
		companyEmpWageList.add(companyEmpwage);
		companyEmpWageMap.put(company, companyEmpwage);

	}

	public void computeEmpwage() {
		for (int i = 0; i < numOfCompany; i++) {
		CompanyEmpwage company=companyEmpwageList.get(i);
				company.setTotalEmpwage(this.computeEmpwage(company));
				System.out.println(company);

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


	public int getTotalWage(String company) {
		return companyEmpWageMap.get(company).totalEmpWage;
	}

}
