package SOLID.TheOpenClosedPrincipleOCP.correcly;

import SOLID.TheOpenClosedPrincipleOCP.correcly.functional.EmployeeDataBase;
import SOLID.TheOpenClosedPrincipleOCP.correcly.functional.information.EmployeeCSVInformation;
import SOLID.TheOpenClosedPrincipleOCP.correcly.functional.information.EmployeePDFInformation;
import SOLID.TheOpenClosedPrincipleOCP.correcly.subject.Employee;

public class Main {

    public static void main(String[] args) {
        Employee emp = new Employee(2, "NameOfEmployee");

        EmployeeDataBase.add(emp);
        new EmployeeCSVInformation().generateReport(emp);
        new EmployeePDFInformation().generateReport(emp);

    }

}
