// Andrew Sousa
// 7/12/2024
// CS 145
// Programming Assignment 3: Employee Hierarchy
// BasePlusCommissionEmployeeTest.java

// BasePlusCommissionEmployeeTest.java is a class that allows users to test different kinds of employee types. 
//Each employee type is already created below, and employees with info errors are also added to test failsafes.
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

public class BasePlusCommissionEmployeeTest {
    public static void main(String[] args){

        //creation of successful general employee
        Employee basic  = new Employee("Basic", "Employee", "123-45-6789");
        System.out.println(basic.toString());
        System.out.println();

        // creation of successful commission employee
        CommissionEmployee commish = new CommissionEmployee("Commission", "Employee", "987-65-4321", 12003.65, 0.20);
        System.out.println(commish.toString());
        System.out.println();

        // creation of successful base plus commission employee
        BasePlusCommissionEmployee baseCommish = new BasePlusCommissionEmployee("Base", "Commission", "111-11-1111", 150000.00, 0.50, 100000);
        System.out.println(baseCommish.toString());
        System.out.println();

        // creation of failed general exmployee
        // cause of fail: invalid social security number input
        Employee basicFail = new Employee("Basic", "Fail", "123-456-789");
        System.out.println();

        // creation of failed commission employee
        // cause of fail: gross sales and commission rate less than 0.
        CommissionEmployee commishFail = new CommissionEmployee("Commish", "Fail", "123-45-6789", -1000.00, -100.00);
        System.out.println();

        // creation of failed base plus commission employee
        // cause of fail: base salary less than 0
        BasePlusCommissionEmployee baseCommishFail = new BasePlusCommissionEmployee("BaseCommish", "Fail", "123-45-6789", 1000.00, 0.65, -0.1);
        System.out.println();
    }
}
