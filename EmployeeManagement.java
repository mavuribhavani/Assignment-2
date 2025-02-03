abstract class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();
    abstract void displayDetails();
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    double calculateSalary() {
        return monthlySalary;
    }

    void displayDetails() {
        System.out.println("Full-Time Employee: " + name);
        System.out.println("ID: " + id);
        System.out.println("Monthly Salary: ₹" + calculateSalary());
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
    void displayDetails() {
        System.out.println("Part-Time Employee: " + name);
        System.out.println("ID: " + id);
        System.out.println("Hourly Rate: ₹" + hourlyRate);
        System.out.println("Total Salary: ₹" + calculateSalary());
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee[] employees = {
            new FullTimeEmployee("Viswa", 101, 50000),  
            new PartTimeEmployee("Ram", 102, 20, 140)   
        };

        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println();
        }
    }
}
