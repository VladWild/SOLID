package SOLID._1_TheSingleResponsibilityPrincipleSRP.wrong;

import SOLID._1_TheSingleResponsibilityPrincipleSRP.wrong.functional.EmployeeFunctional;
import SOLID._1_TheSingleResponsibilityPrincipleSRP.wrong.subject.Employee;

public class Main {

    public static void main(String[] args) {
        Employee emp = new Employee(2, "NameOfEmployee");

        EmployeeFunctional.add(emp);
        EmployeeFunctional.generateReport(emp);

    }

}
