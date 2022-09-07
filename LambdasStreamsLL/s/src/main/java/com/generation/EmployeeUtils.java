package com.generation;

import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeeUtils {
	
	  public String getFullName(Employee employee) {
		  			//<inputType,OutputType>
		    Function<Employee, String> fullName = (Employee e) -> e.getFirstName() + " " + e.getLastName();
		    return fullName.apply(employee);
		  }

		  public String getManagersLastName(Employee employee) {
		    Function<Employee, String> managersLastName = (Employee a)->a.getManager().getLastName();
		    return managersLastName.apply(employee);
		  }

		  public boolean hasBeenEmployedLongerThanFiveYears(Employee employee) {
		    Predicate<Employee> employedLongerThanFiveYears =(Employee a)->a.getYearsOfService()>5;
		    return employedLongerThanFiveYears.test(employee);
		  }

		  public boolean hasMoreThanThreeDirectReports(Employee employee) {
		    Predicate<Employee> moreThanThreeDirectReports = (Employee a)->a.getNumberOfDirectReports()>3;
		    return moreThanThreeDirectReports.test(employee);
		  }

		  public boolean hasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports(Employee employee) {
		    Predicate<Employee> moreThanThreeYearsOfServiceAndLessThanTwoDirectReports = (Employee a)->a.getNumberOfDirectReports()<2&&a.getYearsOfService()>3;
		    return moreThanThreeYearsOfServiceAndLessThanTwoDirectReports.test(employee);
		  }
}
