package SOLID._2_TheOpenClosedPrincipleOCP.wrong.functional.information;

import SOLID._2_TheOpenClosedPrincipleOCP.wrong.subject.Employee;

public class EmployeeInformation {

    //Отчет по сотруднику
    public static void generateReport(Employee emp, TypeReport typeReport) {

        if (typeReport == TypeReport.CSV) {
            System.out.println("Генерация отчета по деятельности сотрудника в формате CSV");
        }

        if (typeReport == TypeReport.CSV) {
            System.out.println("Генерация отчета по деятельности сотрудника в формате PDF");
        }

    }

}
