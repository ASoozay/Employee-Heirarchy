// Andrew Sousa
// 7/12/2024
// CS 145
// Programming Assignment 3: Employee Hierarchy
// BasePlusCommissionEmployee.java

// BasePlusCommissionEmployee.java is a subclass of CommissionEmployee, taking its first name, last name, social security number, gross sales, and commission rate attriubutes, as well as their respective methods.
// Alongside commission employee information, BasePlusCommissionEmployee adds on a base salary for its employees.
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

public class BasePlusCommissionEmployee {
    private CommissionEmployee commissionEmployee; 
    private double baseSalary; 

    // method: BasePlusCommissionEmployee (no return type)
    // purpose: constructs the attributes for the BasePlusCommissionEmployee object
    // parameters:  (1) firstName (String): the employee's first name
    //              (2) lastName (String): the employee's last name
    //              (3) socialSecurityNumber (String): the employee's social security number
    //              (4) grossSales (double): the employee's gross sales
    //              (5) commissionRate (double): the employee's commission rate on sales
    //              (6) baseSalary (double): the employee's base salary, separate from commission income.        
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        if (baseSalary < 0.0) {
        throw new IllegalArgumentException(
        "Base salary must be >= 0.0");
    }

        commissionEmployee = new CommissionEmployee(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

        this.baseSalary = baseSalary;
    }


    // method: getFirstName (String)
    // purpose: returns the employee's first name
    // parameters: none
    public String getFirstName() {
        return commissionEmployee.getFirstName();
    }


    // method: getLastName (String)
    // purpose: returns the employee's last name
    // parameters: none
    public String getLastName() {
        return commissionEmployee.getLastName();
    }


    // method: getSocialSecurityNumber(String)
    // purpose: returns the employee's social security number
    // parameters: none
    public String getSocialSecurityNumber() {
        return commissionEmployee.getSocialSecurityNumber();
    }


    // method: setGrossSales (void)
    // purpose: sets the employee's gross sales
    // parameters: (1) grossSales (double): the employee's new gross sales.
    public void setGrossSales(double grossSales) {
        commissionEmployee.setGrossSales(grossSales);
    }


    // method: getGrossSales (double)
    // purpose: returns the employee's gross sales
    // paramters: none
    public double getGrossSales() {
        return commissionEmployee.getGrossSales();
    }


    // method: setCommissionRate (void)
    // purpose: sets the employee's commission rate
    // parameters:  (1) commissionRate (double): the employee's new commission rate
    public void setCommissionRate(double commissionRate) {
        commissionEmployee.setCommissionRate(commissionRate);
    }


    // method: getCommissionRate (double)
    // purpose: returns the employee's commission rate
    // parameters: none
    public double getCommissionRate() {
        return commissionEmployee.getCommissionRate();
    }


    // method: setBaseSalary (void)
    // purpose: sets the employee's base salary
    // parameters: baseSalary (double): employee's base salary
    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException(
          "Base salary must be >= 0.0");
        }

        this.baseSalary = baseSalary;
    }


    // method: getBaseSalary (double)
    // purpose: returns the employee's base salary
    // parameters: none
    public double getBaseSalary() {
        return baseSalary;
    }


    // method: earnings (double)
    // purpose: calculates the employee's total earnings (base salary + commission) and returns it
    // parameters: none
    public double earnings() {
        return getBaseSalary() + commissionEmployee.earnings();
    }

    
    // method: toString (String)
    // purpose: returns employee information as a single string
    // parameters: none
    @Override
    public String toString() {
        return String.format("%s %s\n%s: %.2f", "base-salaried",
        commissionEmployee.toString(), "base salary", getBaseSalary());
    }
}
