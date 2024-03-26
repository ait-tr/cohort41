package hr;

public class Company {
    public static void main(String[] args) {

        CompanyService service = new CompanyService();

        Employee[] employees = service.createCompanyEmployees();

        service.printCompany(employees);

        employees[1].setDepartment("Management");

        System.out.println("--------- после перевода сотрудника в другой отдел -----");

        service.printCompany(employees);


        employees[2] = new Employee(6,"Sergey", "It");

        System.out.println("--------- после найма нового сотрудника -----");

        service.printCompany(employees);

// ??? как нам найти всех сотрудников из какого-то отдела ???

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment().equals("Management")) {
                System.out.println(employees[i]);
            }
        }

    }


}
