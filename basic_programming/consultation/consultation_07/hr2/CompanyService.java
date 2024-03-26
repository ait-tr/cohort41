package hr2;

public class CompanyService {


    public Department[] createDepartments(){
        Department[] departments = new Department[4];

        departments[0] = new Department("Marketing");
        departments[1] = new Department("It");
        departments[2] = new Department("Accounting");
        departments[3] = new Department("Management");

        return departments;
    }

    public Employee[] createCompanyEmployees(Department[] departments){
        Employee[] employees = new Employee[5];

        employees[0] = new Employee(1, "Ruslan", departments[0]);
        employees[1] = new Employee(2, "Oleg", departments[0]);
        employees[2] = new Employee(3, "Roman", departments[1]);
        employees[3] = new Employee(4, "Olga", departments[2]);
        employees[4] = new Employee(5, "Vlad", departments[3]);

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
