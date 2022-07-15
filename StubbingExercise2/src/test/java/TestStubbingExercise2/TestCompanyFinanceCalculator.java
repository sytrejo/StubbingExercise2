package TestStubbingExercise2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
//import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import StubbingExercise2.CompanyFinanceCalculator;
import StubbingExercise2.Department;
import StubbingExercise2.Employee;


@ExtendWith(MockitoExtension.class)
class TestCompanyFinanceCalculator {
	

	@Test
	void test() {
		Department mockFinance = mock(Department.class);
		CompanyFinanceCalculator calculator = new CompanyFinanceCalculator();
		Employee employee1 = mock(Employee.class);
		Employee employee2 = mock(Employee.class);
		Employee employee3 = mock(Employee.class);	
	}
	
	@Test
	void test_calculateDepartmentWageBill_returns90k_whenDepartmentWithEmployeesEarning30kAnd60kPassedIn() {
		CompanyFinanceCalculator calculator = new CompanyFinanceCalculator();
		Department finance = mock(Department.class);
//		Employee employee1 = mock(Employee.class);
//		Employee employee2 = mock(Employee.class);
//		
//		when(employee1.getSalary()).thenReturn(30000);
//		when(employee2.getSalary()).thenReturn(60000);
		
		Employee mockEmployee = mock(Employee.class);
		when(mockEmployee.getSalary()).thenReturn(45000);
		List<Employee> employees = new ArrayList<Employee>();
//		employees.add(employee1);
//		employees.add(employee2);
		employees.add(mockEmployee);
		employees.add(mockEmployee);
		when(finance.getAllEmployees()).thenReturn(employees);
		
		
		int actualBill = calculator.calculateDepartmentWageBill(finance);
		int expectedBill = 90000;
		assertEquals(expectedBill, actualBill);
		verify(finance,times(1)).getAllEmployees();
		verify(mockEmployee, times(1)).getSalary();
//		verify(employee1,times(1)).getSalary();
//		verify(employee2,times(1)).getSalary();
	
		
	}
	
	@Test
	void test_calculateDepartmentWageBill_returns150k_whenDepartmentWithEmployeesEarning40k_50K_And60kPassedIn() {
		CompanyFinanceCalculator calculator = new CompanyFinanceCalculator();
		Department finance = mock(Department.class);
		Employee employee1 = mock(Employee.class);
		Employee employee2 = mock(Employee.class);
		Employee employee3 = mock(Employee.class);
		
		when(employee1.getSalary()).thenReturn(40000);
		when(employee2.getSalary()).thenReturn(50000);
		when(employee3.getSalary()).thenReturn(60000);
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		
		when(finance.getAllEmployees()).thenReturn(employees);
		
		
		int actualBill = calculator.calculateDepartmentWageBill(finance);
		int expectedBill = 150000;
		assertEquals(expectedBill, actualBill);
	
		
	}


}
