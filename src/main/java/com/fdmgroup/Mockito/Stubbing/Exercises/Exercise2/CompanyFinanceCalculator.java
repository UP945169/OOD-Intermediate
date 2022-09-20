package com.fdmgroup.Mockito.Stubbing.Exercises.Exercise2;

public class CompanyFinanceCalculator {

    public int calculateDepartmentWageBill(Department department){
        int totalSalary = 0;
        for (Employee employee:department.getAllEmployees()){
            totalSalary += employee.getSalary();
        }

        return totalSalary;
    }
}
