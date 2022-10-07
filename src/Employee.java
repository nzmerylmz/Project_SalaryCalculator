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
        if (this.salary < 1000) {
            return this.salary * 0.0;
        } else {
            return this.salary * 0.03;
        }
    }

    public double bonus() {
        if (this.workHours > 40) {
            return 30 * (this.workHours - 40);
        } else {
            return 0;
        }
    }

    public double raiseSalary() {
        int currentYear = 2021;
        int yearsOfEmployment = currentYear - this.hireYear;
        double salaryIncludingTaxAndBonus = this.salary + bonus() - tax(); // raiseSalary will be calculated after bonus and tax calculations are taken into account
        if (yearsOfEmployment < 10) {
            return salaryIncludingTaxAndBonus * 0.05;
        } else if (yearsOfEmployment < 20) {
            return salaryIncludingTaxAndBonus * 0.10;
        } else {
            return salaryIncludingTaxAndBonus * 0.15;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "\nName= " + name +
                "\nSalary= " + salary +
                "\nWork Hours= " + workHours +
                "\nHiring Year= " + hireYear +
                "\nTax= " + tax() + " TL" +
                "\nBonus= " + bonus() + " TL" +
                "\nAmount of Salary Increase= " + raiseSalary() + " TL" +
                "\nSalary including Tax and Bonus= " + (salary + bonus() - tax()) + " TL" +
                "\nTotal Salary including Salary Increase= " + (salary + bonus() - tax() + raiseSalary()) + " TL" + // salary (after bonus added and tax subtracted) with amount of salary increase added
                '}';
    }
}
