public class Employee {
    private String name;
    private int salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public double tax() {

        if (salary >= 1000) {
            return salary * 0.03;
        }
        return 0.0;
    }
    public double bonus() {

        int extraHours = workHours - 40;
        if (extraHours > 0) {
            return extraHours * 30;
        }
        return 0.0;
    }
    public double raiseSalary() {

        int year = 2021 - hireYear;

        if (year < 10) {
            return salary + 0.5;
        }
        else if (year >= 10 && year < 20) {
            return salary * 0.10;
        }
        else {
            return salary * 0.15;
        }
    }
    public void toString(Employee employee) {
        System.out.println("Tax: " + employee.tax() );
        System.out.println("Bonus: " + employee.bonus());
        System.out.println("Raise Salary: " + employee.raiseSalary());
        double totalSalary = employee.salary - employee.tax() + employee.bonus();
        System.out.println("Total salary with tax and bonus: " + totalSalary);
        System.out.println("Total salary with the raise of salary:" + (employee.salary + employee.raiseSalary()));
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                '}';
    }

}


