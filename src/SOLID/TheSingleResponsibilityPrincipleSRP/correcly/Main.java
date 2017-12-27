package SOLID.TheSingleResponsibilityPrincipleSRP.correcly;

import SOLID.TheSingleResponsibilityPrincipleSRP.correcly.functional.EmployeeDataBase;
import SOLID.TheSingleResponsibilityPrincipleSRP.correcly.functional.EmployeeInformation;
import SOLID.TheSingleResponsibilityPrincipleSRP.correcly.subject.Employee;

public class Main {

    public static void main(String[] args) {
        Employee emp = new Employee(2, "NameOfEmployee");

        EmployeeDataBase.add(emp);
        EmployeeInformation.generateReport(emp);
    }

}
