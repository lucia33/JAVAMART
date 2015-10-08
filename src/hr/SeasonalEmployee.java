package hr;

/**
 *
 * @author jxm
 * seasonal employees work 40-48 hours per week (the same as full-time)
 * getSalary will return the salary for the total contract period
 */
public class SeasonalEmployee extends FullTimeEmployee {
    
    private double hoursPerWeek, baseSalary, weeksOfWork;
    //constructor
    public SeasonalEmployee (String firstName,String lastName,int age,double baseSalary, 
            String position, int year,int month, int day, double hoursPerWeek, double weeksOfWork) 
    {
        super(firstName, lastName, age, baseSalary, position, year, month, day, hoursPerWeek);
        
        this.baseSalary = baseSalary;
        this.hoursPerWeek = hoursPerWeek;
        this.weeksOfWork = weeksOfWork;
    }
    
    @Override
    public double getEarnings()
    {
        if(hoursPerWeek >= 40 && hoursPerWeek <= 48)
        {
            return baseSalary * hoursPerWeek * weeksOfWork;
        }
    }
}
