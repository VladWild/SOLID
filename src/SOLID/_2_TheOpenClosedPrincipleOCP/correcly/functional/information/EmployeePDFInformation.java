package SOLID._2_TheOpenClosedPrincipleOCP.correcly.functional.information;

import SOLID._2_TheOpenClosedPrincipleOCP.correcly.subject.Employee;

public class EmployeePDFInformation extends EmployeeInformation {

    @Override
    public void generateReport(Employee emp) {
        System.out.println("Генерация отчета по деятельности сотрудника в формате PDF");
    }
}
