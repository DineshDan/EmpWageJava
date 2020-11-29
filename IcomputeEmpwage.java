public interface IComputeEmpwage {

	 public void addCompanyEmpwage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth);
	 public void computeEmpwage();
	 public int computeEmpwage(CompanyEmpwage companyEmpwage);
	 
	 public int getTotalwage(String company);

}
