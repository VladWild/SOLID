package SOLID._1_TheSingleResponsibilityPrincipleSRP.correcly;

import SOLID._1_TheSingleResponsibilityPrincipleSRP.correcly.functional.EmployeeDataBase;
import SOLID._1_TheSingleResponsibilityPrincipleSRP.correcly.functional.EmployeeInformation;
import SOLID._1_TheSingleResponsibilityPrincipleSRP.correcly.subject.Employee;

public class Main {

    public static void main(String[] args) {
        Employee emp = new Employee(2, "NameOfEmployee");

        EmployeeDataBase.add(emp);
        EmployeeInformation.generateReport(emp);
    }

}
