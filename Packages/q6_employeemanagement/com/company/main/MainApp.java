package com.company.main;

import com.company.hr.Employee;             // Single import
import com.company.payroll.*;              // On-demand import

public class MainApp {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Devang Verma", "AI/ML", 50000);
        emp.displayEmployee();

        Payroll payroll = new Payroll();
        payroll.calculateBonus(emp);
    }
}
