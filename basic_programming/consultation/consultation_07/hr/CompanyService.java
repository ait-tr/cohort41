package hr;

public class CompanyService {

    public Employee[] createCompanyEmployees(){
        Employee[] employees = new Employee[5];

        employees[0] = new Employee(1, "Ruslan", "Marketing");
        employees[1] = new Employee(2, "Oleg", "Marketing");
        employees[2] = new Employee(3, "Roman", "It");
        employees[3] = new Employee(4, "Olga", "Accounting");
        employees[4] = new Employee(5, "Vlad", "Managemnt");

        return employees;
    }


    void printCompany(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Сотрудник: ");
            System.out.println(" - Имя : " + employees[i].getName());
            System.out.println(" - Отдел : " + employees[i].getDepartment());
        }
    }
}
