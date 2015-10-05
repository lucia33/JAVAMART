package hr;

import general.ServiceClass;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author jxm
 */
public class Employee 
{
    //Class instance variables
    private String firstName, lastName, position, employeeStatus;
    private int empId, age;
    private double baseSalary, taxRate;
    private Date dateOfHire;
    private static int numOfEmp;
    
    //explicit default constructor
    public Employee()
    {}
    
    
    public Employee(String firstName,String lastName,int age,double baseSalary, 
            String position, int year,int month, int day)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.baseSalary = baseSalary;
        this.position = position;
        GregorianCalendar cal = new GregorianCalendar(year, month-1, day);
        this.dateOfHire = cal.getTime();
        System.out.println(dateOfHire);
        //call the static method of empId to get a new ID
        this.empId = ServiceClass.getEmpId();
        //add one to the static employee counter
        updateEmpCounter();
    }
    
    //GET Methods that will return information about the employee
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public String getFullName()
    {
        return firstName + " " + lastName;
    }
    public int getAge()
    {
        return age;
    }
    public double getSalary()
    {
        return this.baseSalary;
    }
    public String getPosition()
    {
        return position;
    }
    public Date getDateOfHire()
    {
        return dateOfHire;
    }
    public int getEmpId()
    {
        return empId;
    }
    public String getEmpInfo()
    {
        //this can either call on the 
        //overridden toString method in the class OR
        //it can contain the printout info in its method body. 
        return toString();
    }
    //overridden toString method
    @Override
    public String toString() {
        String employeeInfo = "";

        employeeInfo += "\nName:\t\t" + getFullName();
        employeeInfo += "\nId:\t\t" + getEmpId();
        employeeInfo += "\nSalary:\t\t$" + getSalary();
        employeeInfo += "\nAge:\t\t" + getAge();
        employeeInfo += "\nPosition:\t" + getPosition();
        employeeInfo += "\nHire-Date:\t" + getDateOfHire();
   
 
        return employeeInfo;
    }
    //get the total employees created
    public int getEmpCount()
    {
        return numOfEmp;
    }
    
    
    //SET methods
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public void setAge(int age)
    {
        //added safety check
        if(age>80 || age<10)
        {
            this.age = age;
        }
    }
    public void setSalary(double salary)
    {
        //add validation here
       this.baseSalary = salary;
    }
    public void setPosition(String position)
    {
        this.position = position;
    }
    public void setDateOfHire(int year, int month, int day)
    {
        //create a new calendar object and chain in the method to 
        //get the time in a Date object. 
        this.dateOfHire = new GregorianCalendar(year,month,day).getTime();
    }
    public void setEmpId(int empId)
    {
        //although this is ok for now, a check for an existing 
        //emp Id must be conducted here
        //checkEmpId(empId);
        this.empId = empId;
    }
    //method to update the employee counter
    private void updateEmpCounter()
    {
        //update the emp count
        numOfEmp++;
    }
    /*
    private boolean checkEmpId(int empId)
    {
        //read all empId and validate against the attempted 
        //value provided. 
    }
    */
}//end of class
