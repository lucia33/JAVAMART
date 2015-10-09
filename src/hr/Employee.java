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
    
    // accessor methods
    public String getFirstName()
    {
        return this.firstName;
    }
    
    public String getLastName()
    {
        return this.lastName;
    }
    
    public int getAge()
    {
        return this.age;
    }
    
    public String getPosition()
    {
        return this.position;
    }
    
    public Date getDateOfHire()
    {
        return dateOfHire;
    }
        
    public int getEmpCount()
    {
        return numOfEmp;
    }
    
    public double getSalary()
    {
        return this.baseSalary;
    }
    
    public int getEmpId()
    {
        return empId;
    } 
    
    public abstract double getEarnings();
    
    
    // mutator methods
    public void setAge(int age)
    {
        if(age>0)
        {
            this.age = age;
        }            
    }    
    
    private void updateEmpCounter()
    {
        numOfEmp++;
    }
    
    
    // Modify toString to print out employee info
    @Override
    public String toString()
    {
        String empInfo = "";
        empInfo += "\nId:\t\t" + getEmpId();
        empInfo += "\nName:\t\t" + getFirstName() + "\t" + getLastName();
        empInfo += "\nAge:\t\t" + getAge();
        empInfo += "\nPosition:\t" + getPosition();
        empInfo += "\nHire-Date:\t" + getDateOfHire(); 
        return empInfo;        
    }
}
