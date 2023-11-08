public class Employee {
    int id;
    String surname;
    short age;
    double salary;
    String department;

    public void extendSalary(){
        salary = salary * 2.0;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.salary=2000.33;
        employee1.extendSalary();

        Employee employee2 = new Employee();
        employee2.salary=1000.22;
        employee2.extendSalary();

        System.out.println(employee1.salary);
        System.out.println(employee2.salary);
    }
}