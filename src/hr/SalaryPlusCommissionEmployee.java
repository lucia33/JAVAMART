package hr;

/**
 *
 * @author jxm
 */
public class SalaryPlusCommissionEmployee extends CommissionSalesEmployee {
    
    public SalaryPlusCommissionEmployee(String firstName, String lastName, int age, double baseSalary,
            String position, int year, int month, int day, double grossSales, double commissionRate)
    {
        super(firstName, lastName, age, baseSalary, position, year, month, day, grossSales, commissionRate);
        
    }
    
    public double getSalaryPlusCommission()
    {
        return super.getEarnings() + super.getSalary();
    }
}
