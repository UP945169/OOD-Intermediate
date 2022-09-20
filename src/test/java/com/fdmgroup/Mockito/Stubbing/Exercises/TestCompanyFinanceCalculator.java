package com.fdmgroup.Mockito.Stubbing.Exercises;

import com.fdmgroup.Mockito.Stubbing.Exercises.Exercise2.CompanyFinanceCalculator;
import com.fdmgroup.Mockito.Stubbing.Exercises.Exercise2.Department;
import com.fdmgroup.Mockito.Stubbing.Exercises.Exercise2.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TestCompanyFinanceCalculator {

    CompanyFinanceCalculator financeCalculator;

    @BeforeEach
    void setUp() throws Exception{
        financeCalculator = new CompanyFinanceCalculator();
    }

    @Mock
    Department Mockdepartment;

    @Mock
    Employee Mockemployee1, Mockemployee2, Mockemployee3;

    @Test
    void test_calculateDepartmentWageBill_returns90k_whenDepartmentWithEmployeesEarning30kAnd60kPassedIn() {
        //stubbing statements
        when(Mockemployee1.getSalary()).thenReturn(30000);
        when(Mockemployee2.getSalary()).thenReturn(60000);

        List<Employee> employees = new ArrayList<>(Arrays.asList(Mockemployee1,Mockemployee2));

        //stub to get all employees
        when(Mockdepartment.getAllEmployees()).thenReturn(employees);

        int calculateDepartmentWageBill = financeCalculator.calculateDepartmentWageBill(Mockdepartment);

        assertEquals(90000, calculateDepartmentWageBill);
    }

    @Test
    void test_test_calculateDepartmentWageBill_returns140k_whenDepartmentWithThreeEmployeesEarning30kAnd60kand50kPassedIn(){
        //stubbing statments
        when(Mockemployee1.getSalary()).thenReturn(30000);
        when(Mockemployee2.getSalary()).thenReturn(60000);
        when(Mockemployee3.getSalary()).thenReturn(50000);

        List<Employee> employees = new ArrayList<>(Arrays.asList(Mockemployee1,Mockemployee2,Mockemployee3));

        when(Mockdepartment.getAllEmployees()).thenReturn(employees);

        int calculateDepartmentWageBill = financeCalculator.calculateDepartmentWageBill(Mockdepartment);

        assertEquals(140000,calculateDepartmentWageBill);
    }

}
