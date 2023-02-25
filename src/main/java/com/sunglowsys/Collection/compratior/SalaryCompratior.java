package com.sunglowsys.Collection.compratior;

import java.util.Comparator;

public class SalaryCompratior implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return (int)(emp1.salary-emp2.salary);
    }
}
