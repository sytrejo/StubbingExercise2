package StubbingExercise2;

public class CompanyFinanceCalculator{
	
	
	

	public int calculateDepartmentWageBill(Department department) {
		int sum = 0;
//		System.out.println(department.getAllEmployees().size());
		
		for(Employee employee : department.getAllEmployees()) {
//			System.out.println(employee.getSalary());
			sum += employee.getSalary();
		}
		return sum;
	}

	
}
