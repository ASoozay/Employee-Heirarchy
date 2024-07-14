// Andrew Sousa
// 7/12/2024
// CS 145
// Programming Assignment 3: Employee Hierarchy
// CommissionEmployee.java

// CommissionEmployee.java is a subclass of Employee, taking its first name, last name, and social security number, as well as their respective methods.
// Alongside commission employee information, CommissionEmployee adds on gross sales and a commission rate for its employees.
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

public class CommissionEmployee {
    private Employee employee;
    private double grossSales;
    private double commissionRate;


    // method: CommissionEmployee (no return type)
    // purpose: constructs the attributes for the CommissionEmployee object
    // parameters:  (1) firstName (String): employee's first name
    //              (2) lastName (String): employee's last name
    //              (3) socialSecurityNumber (String): employee's social security number
    //              (4) grossSales (double): employee's gross sales
    //              (5) commissionRate (double): employee's commission rate
    // NOTE: firstName, lastName, and socialSecurityNumber are used to create an Employee object within the constructor
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate){
        if(grossSales < 0.0){
            throw new IllegalArgumentException("Error: Gross Sales cannot be less than $0.00");
        }
        if(commissionRate < 0.0){
            throw new IllegalArgumentException("Error: Commission Rate cannot be less than 0.");
        }

        employee = new Employee(firstName, lastName, socialSecurityNumber);

        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }


    // method: getFirstName (String)
    // purpose: returns the employee's first name
    // parameters: none
    public String getFirstName(){
        return employee.getFirstName();
    }


    // method: getLastName (String)
    // purpose: returns the employee's last name
    // parameters: none
    public String getLastName(){
        return employee.getLastName();
    }


    // method: getSocialSecurityNumber(String)
    // purpose: returns the employee's social security number
    // parameters: none
    public String getSocialSecurityNumber(){
        return employee.getSocialSecurityNumber();
    }


    // method: setGrossSales (void)
    // purpose: sets the employee's gross sales
    // parameters: (1) grossSales (double): the employee's new gross sales.
    public void setGrossSales(double newGrossSales){
        if(newGrossSales < 0.0){
            throw new IllegalArgumentException("Gross Sales cannot be less than $0.00.");
        }
        grossSales = newGrossSales;
    }


    // method: getGrossSales (double)
    // purpose: returns the employee's gross sales
    // paramters: none    
    public double getGrossSales(){
        return grossSales;
    }


    // method: setCommissionRate (void)
    // purpose: sets the employee's commission rate
    // parameters:  (1) commissionRate (double): the employee's new commission rate    
    public void setCommissionRate(double newCommissionRate){
        if (newCommissionRate < 0.0){
            throw new IllegalArgumentException("Commission Rate cannot be less than 0.0");
        }
        commissionRate = newCommissionRate;
    }


    // method: getCommissionRate (double)
    // purpose: returns the employee's commission rate
    // parameters: none
    public double getCommissionRate(){
        return commissionRate;
    }


    // method: earnings (double)
    // purpose: calculates the employee's total earnings and returns it
    // parameters: none
    public double earnings(){
        double totalEarnings = getCommissionRate() * getGrossSales();

        return totalEarnings;
    }


    // method: toString (String)
    // purpose: returns employee information as a single string
    // parameters: none
    @Override
    public String toString(){
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
                "commission employee", getFirstName(), getLastName(),
                "social security number", getSocialSecurityNumber(),
                "gross sales", getGrossSales(),
                "commission rate", getCommissionRate());
    }

}
// dir: C:\Users\swegi\OneDrive\Desktop\CS 145 Labs
// git: https://github.com/ASoozay/Employee-Heirarchy.git
