package SOLID.TheOpenClosedPrincipleOCP.wrong;

import SOLID.TheOpenClosedPrincipleOCP.wrong.functional.information.EmployeeInformation;
import SOLID.TheOpenClosedPrincipleOCP.wrong.functional.information.TypeReport;
import SOLID.TheOpenClosedPrincipleOCP.wrong.subject.Employee;

public class Main {

    public static void main(String[] args) {
        Employee emp = new Employee(2, "NameOfEmployee");

        EmployeeInformation.generateReport(emp, TypeReport.CSV);
        EmployeeInformation.generateReport(emp, TypeReport.PDF);

    }

}
