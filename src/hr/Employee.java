package hr;

import general.ServiceClass;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author jxm
 */
public abstract class Employee {
    
    private String firstName, lastName, position;
    private double baseSalary;
    //*composition
    private Date dateOfHire;
    private int age, empId;
    private static int numOfEmp;
    
    // default constructor
    public Employee()
    {        
    }
    
    //overloading
    public Employee(String firstName, String lastName, int age, double baseSalary,
            String position, int year, int month, int day)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.baseSalary = baseSalary;
        GregorianCalendar cal = new GregorianCalendar(year, month-1, day);
        this.dateOfHire = cal.getTime();
        this.empId = ServiceClass.getEmpId();
        updateEmpCounter();        
        
    }
    
//    public Employee(String firstName, String lastName)
//    {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this(firstName, lastName, 0);
//    }
    
    // accessor methods
    public String getFirstName()
    {
        return this.firstName;
    }
    
    public String getLastName()
    {
        return this.lastName;
    }
    
    public void setAge(int age)
    {
        if(age>0)
        {
            this.age = age;
            modAge(age);
        }
            
    }
    
    private void modAge(int age)
    {
        
    }
    
    private void updateEmpCounter()
    {
        numOfEmp++;
    }
    
    
    // accessor methods
    public int getEmpCount()
    {
        return numOfEmp;
    }
    
    public double getBaseSalary()
    {
        return this.baseSalary;
    }
    
}
