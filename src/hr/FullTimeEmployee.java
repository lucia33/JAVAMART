package hr;

/**
 *
 * @author jxm
 * full-time employees work 40-48 hours per week
 * getSalary will return the salary for a week
 */
public class FullTimeEmployee extends Employee {
    
    private double hoursPerWeek, baseSalary;
    //constructor
    public FullTimeEmployee (String firstName,String lastName,int age,double baseSalary, 
            String position, int year,int month, int day, double hoursPerWeek) 
    {
        super(firstName, lastName, age, baseSalary, position, year, month, day);
        
        this.baseSalary = baseSalary;
        this.hoursPerWeek = hoursPerWeek;
    }
    
    @Override
    public double getEarnings()
    {
        if(hoursPerWeek >= 40 && hoursPerWeek <= 48)
        {
            return baseSalary * hoursPerWeek;
        }
    }
    
}
