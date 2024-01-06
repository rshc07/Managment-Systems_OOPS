import java.util.Scanner;

// Interface Taxable
interface Taxable {
    double salesTax = 0.07; // 7% sales tax
    double incomeTax = 0.105; // 10.5% income tax

    // Abstract method to calculate tax
    void calcTax();
}

// Employee class implementing Taxable interface
class Employee implements Taxable {
    private int empId;
    private String name;
    private double salary;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // Implementing calcTax method for income tax calculation
    @Override
    public void calcTax() {
        double incomeTaxAmount = salary * incomeTax;
        System.out.println("Income Tax for employee " + name + " with ID " + empId + ": ₹" + incomeTaxAmount);
    }
}

// Product class implementing Taxable interface
class Product implements Taxable {
    private int pid;
    private double price;
    private int quantity;

    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    // Implementing calcTax method for sales tax calculation
    @Override
    public void calcTax() {
        double salesTaxAmount = price * salesTax * quantity;
        System.out.println("Sales Tax for product with ID " + pid + ": ₹" + salesTaxAmount);
    }
}
