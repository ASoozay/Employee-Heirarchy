// Andrew Sousa
// 7/12/2024
// CS 145
// Programming Assignment 3: Employee Hierarchy
// Employee.java

// Employee.java is a superclass for employee types in the program. Every exmployee has attirbutes of first name, last name, and social security number.
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

public class Employee {
    protected String firstName;
    protected String lastName;
    protected String socialSecurityNumber;

    // method: Employee (no return type)
    // purpose: constructs the attributes for the object
    // parameters:  (1) firstName (String):  the employee's first name
    //              (2) lastName (String): the employee's last name
    //              (3) socialSecurityNumber (String): the employee's social security number
    protected Employee(String firstName, String lastName, String socialSecurityNumber){
        if(!(socialSecurityNumber.charAt(3)+ "").equals("-") || !(socialSecurityNumber.charAt(6) + "").equals("-")){
            throw new IllegalArgumentException("Social Security Number must be in format XXX-XX-XXXX");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }


    // method: getFirstName (String)
    // purpose: returns the employee's first name
    // parameters: none
    protected String getFirstName(){
        return firstName;
    }


    // method: getFirstName (String)
    // purpose: returns the employee's first name
    // parameters: none
    protected String getLastName(){
        return lastName;
    }


    // method: getSocialSecurityNumber(String)
    // purpose: returns the employee's social security number
    // parameters: none
    protected String getSocialSecurityNumber(){
        return socialSecurityNumber;
    }


    // method: toString (String)
    // purpose: returns the employee information as a single string
    // parameters: none
    public String toString(){
        return String.format("%s: %s %s%n%s: %s",
                "Employee ", getFirstName(), getLastName(),
                "social security number", getSocialSecurityNumber());
    }


}
