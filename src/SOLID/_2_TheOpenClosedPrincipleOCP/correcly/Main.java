package SOLID._2_TheOpenClosedPrincipleOCP.correcly;

import SOLID._2_TheOpenClosedPrincipleOCP.correcly.functional.EmployeeDataBase;
import SOLID._2_TheOpenClosedPrincipleOCP.correcly.functional.information.EmployeeCSVInformation;
import SOLID._2_TheOpenClosedPrincipleOCP.correcly.functional.information.EmployeePDFInformation;
import SOLID._2_TheOpenClosedPrincipleOCP.correcly.subject.Employee;

public class Main {

    public static void main(String[] args) {
        Employee emp = new Employee(2, "NameOfEmployee");

        EmployeeDataBase.add(emp);
        new EmployeeCSVInformation().generateReport(emp);
        new EmployeePDFInformation().generateReport(emp);

    }

}
