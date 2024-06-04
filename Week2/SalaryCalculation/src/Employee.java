public class Employee {
    // First we assign the variables,these variables are qualifications of Employee class
    String name;

    double salary;
    int workHour;
    int hireYear;
    double raise;
    double bonus;

    // We assigned the variables to parameters from the Employee Class with this keyword
    // The code below Employee is class and this employee class takes name,salary,work hour and hire year parameters
    // When we create the object which is Employee in this case we are going to add this data in calculation


    Employee(String name, double salary, int workHour, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHour = workHour;
        this.hireYear = hireYear;
    }

    // This method prints all the parameters which belongs to employees we will use it ın the main method

    void employeeParameters() {
        System.out.println("=======================");
        System.out.println("Name : " + this.name);
        System.out.println("=======================");
        System.out.println("Salary : " + this.salary);
        System.out.println("Working Hour : " + this.workHour);
        System.out.println("Start Year : " + this.hireYear);
    }

    // taxes calculation
    double taxes() {
        if (this.salary < 1000)
            return 0;
        else
            return (this.salary * 0.03);

    }

    // print taxes we will use it at main method
    void printTaxes() {
        System.out.println("Taxes : " + taxes());

    }

    // salary rise depends on the work year
    double salaryRaise() {
        if ((2024 - this.hireYear) < 10) {
            raise = (this.salary * 0.05);

        } else if ((10 <= (2024 - this.hireYear) && (2024 - this.hireYear < 20))) {
            raise = (this.salary * 0.10);


        } else {
            raise = (this.salary * 0.15);

        }
        return raise;

    }
    // print at main method

    void printSalaryRaise() {
        System.out.println("Salary Raise : " + salaryRaise());
    }

    // bonus calculation
    double bonus() {
        if ((this.workHour > 40)) {
            return this.bonus = ((this.workHour - 40) * 30);
        } else {
            return 0;
        }
    }

    //print at main method
    void printBonus() {
        System.out.println("Bonus : " + bonus());
    }

    // this method prints all the parameters at the main method after calculations
    void EmployeeSalary() {
        System.out.println("***********************");
        System.out.println("Salary With Tax And Bonus : " + (this.salary - taxes() + bonus()));
        System.out.println("Total : " + (this.salary - taxes() + bonus() + salaryRaise()));
        System.out.println("***********************");
    }

}
