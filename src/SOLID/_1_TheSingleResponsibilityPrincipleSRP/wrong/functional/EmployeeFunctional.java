package SOLID._1_TheSingleResponsibilityPrincipleSRP.wrong.functional;

import SOLID._1_TheSingleResponsibilityPrincipleSRP.wrong.subject.Employee;

public class EmployeeFunctional {

    //Данный метод добавляет в базу данных нового сотрудника
    //Метод возвращает результат вставки в базу данных
    public static boolean add(Employee emp) {
        System.out.println("Сотрудник вставлен в таблицу БД");
        return true;
    }

    //Отчет по сотруднику
    public static void generateReport(Employee emp) {
        System.out.println("Генерация отчета по деятельности сотрудника");
    }


}
