public class Employee_Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Mehmet",900,50,2020);
        System.out.println(employee1);
        employee1.toString(employee1);

        System.out.println("---------------------------------------------------");

        Employee employee2 = new Employee("Ali", 1000, 45, 2011);
        System.out.println(employee2);
        employee2.toString(employee2);

        System.out.println("---------------------------------------------------");

        Employee employee3 = new Employee("Ayşe", 2500, 40, 2000);
        System.out.println(employee3);
        employee3.toString(employee3);

        System.out.println("---------------------------------------------------");

        Employee employee4 = new Employee("Betül",3000,30,2008);
        System.out.println(employee4);
        employee4.toString(employee4);


    }
}
