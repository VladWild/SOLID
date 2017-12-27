package SOLID.TheSingleResponsibilityPrincipleSRP.correcly.functional;

import SOLID.TheSingleResponsibilityPrincipleSRP.correcly.subject.Employee;

public class EmployeeDataBase {

    //Данный метод добавляет в базу данных нового сотрудника
    //Метод возвращает результат вставки в базу данных
    public static boolean add(Employee emp) {
        System.out.println("Сотрудник вставлен в таблицу БД");
        return true;
    }

}
