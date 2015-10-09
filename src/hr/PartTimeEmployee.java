package hr;

/**
 *
 * @author jxm
 * full-time employees work 20-25 hours per week
 * getSalary will return the salary for a week
 */
public class PartTimeEmployee extends Employee {
    
    private double hoursPerWeek, baseSalary;
    //constructor
    public PartTimeEmployee (String firstName,String lastName,int age,double baseSalary, 
            String position, int year,int month, int day, double hoursPerWeek) 
    {
        super(firstName, lastName, age, position, year, month, day);
        
        this.baseSalary = baseSalary;
        this.hoursPerWeek = hoursPerWeek;
    }
    
    @Override
    public double getEarnings()
    {
        if (hoursPerWeek >= 20 && hoursPerWeek <= 25)
        return baseSalary * hoursPerWeek;
    }
    
    @Override
    public String toString()
    {
        return super.toString() +
                "\nWeekly Salary:\t" + getEarnings();
    }
}
