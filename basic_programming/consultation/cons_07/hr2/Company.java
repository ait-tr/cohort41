package hr2;

public class Company {
    public static void main(String[] args) {

        CompanyService service = new CompanyService();

        Department[] departments = service.createDepartments();

        Employee[] employees = service.createCompanyEmployees(departments);

        service.printCompany(employees);

        employees[1].setDepartment(departments[3]);

        System.out.println("--------- после перевода сотрудника в другой отдел -----");

        service.printCompany(employees);


        employees[2] = new Employee(6,"Sergey", departments[1]);

        System.out.println("--------- после найма нового сотрудника -----");

        service.printCompany(employees);

// ??? как нам найти всех сотрудников из какого-то отдела ???

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment().getName().equals(departments[3].getName())) {
                System.out.println(employees[i]);
            }
        }

    }


}
