package hr;

/**
 *
 * @author jxm
 */
public class CommissionSalesEmployee extends Employee {
    
    private double grossSales, commissionRate;
    
    //
    public CommissionSalesEmployee(String firstName, String lastName, int age, double baseSalary,
            String position, int year, int month, int day, double grossSales, double commissionRate)
    {
        
        super(firstName, lastName, age, baseSalary, position, year, month, day);
        
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }
    
    //accessor methods
    public double getCommissionRate()
    {
        return this.commissionRate;
    }
    
    public double getGrossSales()
    {
        return this.grossSales;
    }
    
    public double getEarnings()
    {
        //making sure commission rate is valid
        if (commissionRate > 0 && commissionRate < 1.0)
        {
            return getCommissionRate() * getGrossSales();
        }
        
    }
    
    //mutator methods
    public void setCommissionRate(double newRate)
    {
        if (newRate > 0 && newRate < 1)
        {
            this.commissionRate = newRate;
        }        
    }
}
