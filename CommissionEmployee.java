public class CommissionEmployee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate){

        if(socialSecurityNumber.length() != 9){
            throw new IllegalArgumentException("Error: Social Secuirty Number must be 9 digits.");
        }
        if(grossSales < 0.0){
            throw new IllegalArgumentException("Error: Gross Sales cannot be less than $0.00");
        }
        if(commissionRate < 0.0){
            throw new IllegalArgumentException("Error: Commission Rate cannot be less than 0.");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }


    public String getFirstName(){
        return firstName;
    }


    public String getLastName(){
        return lastName;
    }


    public String getSocialSecurity(){
        return socialSecurityNumber;
    }


    public void setGrossSales(double newGrossSales){
        if(newGrossSales < 0.0){
            throw new IllegalArgumentException("Gross Sales cannot be less than $0.00.");
        }
        grossSales = newGrossSales;
    }


    public double getGrossSales(){
        return grossSales;
    }


    public void setCommissionRate(double newCommissionRate){
        if (newCommissionRate < 0.0){
            throw new IllegalArgumentException("Commission Rate cannot be less than 0.0");
        }
        commissionRate = newCommissionRate;
    }


    public double getCommissionRate(){
        return commissionRate;
    }

}
