package general;

import hr.Employee;
import hr.FullTimeEmployee;
import hr.PartTimeEmployee;
import hr.SeasonalEmployee;
import java.util.ArrayList;
import java.util.Scanner;
import products.Manufacturer;
import products.Product;

/**
 *
 * @author jxm
 */
public class JAVAMART 
{
    //main method
    public static void main(String[] args)
    {
        //arraylists to store data
        ArrayList<Employee> empList = new ArrayList<>();
        ArrayList<Product> prodList = new ArrayList<>();
        ArrayList<Manufacturer> mList = new ArrayList<>();

        //manufacturer test data
        Manufacturer testManufacutrer = new Manufacturer("DEBRACO", "888 ABC DRIVE", "888-888-8888");
        mList.add(testManufacutrer);
        System.out.println(mList.get(0).getMName());
        
        //product test data
        Product testProduct = new Product("Candle", mList.get(0), "Home Deco", "Seashore Spa Flavor");
        prodList.add(testProduct);
        System.out.println(testProduct.toString());
       
        //input vars
        Scanner read = new Scanner(System.in);
        int input, hrInput, prodInput;
        String cont = "n";
        boolean keepGoing = true, prodBool = true, hrBool = true;      
        
        getInitialMessage();
        
        //outter while loop to keep the system running
        while(keepGoing)
        {
            //later on we will use instanceOf to check the data type and add
            //add a small validation.
            input = Integer.parseInt(read.nextLine());
            
            //if input is 1, run the product block
            if(input == 1)
            {             
                //inner product loop that will work with the
                //product block. Runs until the user ends it.
                while(prodBool)
                {
                    //display the product message
                    getProductMessage();
                    //read the user input
                    prodInput = Integer.parseInt(read.nextLine());
                    //selection statement to determine what to do
                    if(prodInput==1)
                    {
                        System.out.println("Display Product list and details:");
                        for(Product prodList1 : prodList )
                        {
                            System.out.println(prodList1.toString()); 
                        }
                        // ************haven't build the SEARCH function since it's quite similar to the employee part******* 
                    }
                    else if(prodInput==2)
                    {
                        // Input new product
                        
                        // vars for accept input
                        String productName, manufacturer, category, description;
                        // accept input from user
                        System.out.println("Product name:");
                        productName = read.nextLine();
                        // *************haven't finish accept manufacturer input***********
//                        System.out.println("Manufacturer:");
//                        manufacturer = read.nextLine();
                        System.out.println("Category:");
                        category = read.nextLine();
                        System.out.println("Description:");
                        description = read.nextLine();
                        Product tempProduct = new Product(productName, category, description);
                        prodList.add(tempProduct);                        
                    }
                    else if(prodInput==0)
                    {
                        prodBool = false;
                        getInitialMessage();
                    }
                    else
                    {
                        getErrorMessage();
                    }
                }
            }
            else if(input == 2)//if input is 2, run the HR block
            {
                //inner HR loop that will work with the
                //HR block. Runs until the user ends it.
                while(hrBool)
                {
                    //display the HR message
                    getHRMessage();
                    //read the user input
                    prodInput = Integer.parseInt(read.nextLine());
                    //selection statement to determine what to do
                    if(prodInput==1) // SEARCH employee
                    {
                        getSearchMethod();
                        int searchMethodInput = Integer.parseInt(read.nextLine());
                        boolean empFound = false;
                        if (searchMethodInput==1) 
                        {
                            // search by firstname
                            System.out.println("Please enter first name: ");                            
                            String fNameInput = read.nextLine();  
                            for (Employee empList1 : empList) 
                            {
                                empFound = fNameInput.equalsIgnoreCase(empList1.getFirstName());
                                if (empFound) 
                                {
                                    System.out.println(empList1.toString());
                                }
                            }
                            if (!empFound)
                            {
                                getErrorMessage();
                            }                            
                        }
                        else if (searchMethodInput==2) 
                        {
                            // search by lastname
                            System.out.println("Please enter last name: ");                            
                            String lNameInput = read.nextLine();  
                            for (Employee empList1 : empList) 
                            {
                                empFound = lNameInput.equalsIgnoreCase(empList1.getLastName());
                                if (empFound) 
                                {
                                    System.out.println(empList1.toString());
                                }
                            }
                            if (!empFound)
                            {
                                getErrorMessage();
                            }
                        }
                        else if (searchMethodInput==3) 
                        {
                            // search by Id
                            System.out.println("Please enter the emp Id: ");                            
                            int idInput = Integer.parseInt(read.nextLine());  
                            for (Employee empList1 : empList) 
                            {
                                empFound = (idInput == empList1.getEmpId());
                                if (empFound) 
                                {
                                    System.out.println(empList1.toString());
                                }
                            }
                            if (!empFound)
                            {
                                getErrorMessage();
                            }
                        }
                        else
                        {
                            getErrorMessage();
                        }                       
                        
                    }
                    else if(prodInput==2)
                    {
                        // System.out.println("Enter a new employee here");
                        // collect necessary information of the employee
                        String firstName, lastName, position;
                        int age, year, month, day;
                        double baseSalary;
                        System.out.println("First name: ");
                        firstName = read.nextLine();
                        System.out.println("Last name: ");
                        lastName = read.nextLine();
                        System.out.println("Age: ");
                        age = Integer.parseInt(read.nextLine());
                        System.out.println("Base salary: ");
                        baseSalary = Double.parseDouble(read.nextLine());
                        System.out.println("Position: ");
                        position = read.nextLine();
                        System.out.println("Hiring year: ");
                        year = Integer.parseInt(read.nextLine());
                        System.out.println("Hiring month: ");
                        month = Integer.parseInt(read.nextLine());
                        System.out.println("Hiring day: ");
                        day = Integer.parseInt(read.nextLine());
                        
                        // other info based on the employee type (fulltime, parttime or seasonal)
                        // create new employee and store in EmpList accordingly
                        getEmpChoice();                        
                        int empTypeChoice = Integer.parseInt(read.nextLine());
                        if (empTypeChoice == 1)
                        {
                            //Full-time
                            System.out.println("Hours Per Week: ");
                            double hoursPerWeek = Double.parseDouble(read.nextLine());
                            Employee newEmp = new FullTimeEmployee(firstName, lastName, 
                                    age, baseSalary, position, year, month, day, hoursPerWeek);
                            empList.add(newEmp);                            
                        }
                        else if (empTypeChoice == 2)
                        {
                            //Part-time
                            System.out.println("Hours Per Week: ");
                            double hoursPerWeek = Double.parseDouble(read.nextLine());
                            Employee newEmp = new PartTimeEmployee(firstName, lastName, 
                                    age, baseSalary, position, year, month, day, hoursPerWeek);
                            empList.add(newEmp);
                        }
                        else if (empTypeChoice == 3)
                        {
                            //seasonal
                            System.out.println("Hours Per Week: ");
                            double hoursPerWeek = Double.parseDouble(read.nextLine());
                            System.out.println("Weeks of Work: ");
                            double weeksOfWork = Double.parseDouble(read.nextLine());
                            Employee newEmp = new SeasonalEmployee(firstName, lastName, 
                                    age, baseSalary, position, year, month, day, hoursPerWeek, weeksOfWork);
                            empList.add(newEmp);
                        }
                        else 
                        {
                            getErrorMessage();
                        }                        
                    }
                    else if(prodInput==0)
                    {
                        hrBool = false;
                        getInitialMessage();
                    }
                    else
                    {
                        getErrorMessage();
                    }
                            
                }
            }
            else if(input == 0)//Exit block
            {
                System.out.println("Thank you for using JAVAMART!");
                keepGoing=false;
            }
            else//default block if input is invalid
            {
                keepGoing = true;
                getErrorMessage();
                getInitialMessage();
            }
                    
        }
    }
    //static initial message method
    public static void getInitialMessage()
    {
        System.out.println("Welcome to JAVAMART!");
        System.out.println("Please enter a choice to proceed:");
        System.out.println("1: Products");
        System.out.println("2: HR");
        System.out.println("0: Exit");
    }
    //static product message method
    public static void getProductMessage()
    {
        System.out.println("What would you like to do?:");
        System.out.println("Please enter a choice to proceed:");
        System.out.println("1: Search products");
        System.out.println("2: Enter new product");
        System.out.println("0: Exit");
    }
    //static HR message method
    public static void getHRMessage()
    {
        System.out.println("What would you like to do?:");
        System.out.println("Please enter a choice to proceed:");
        System.out.println("1: Search employees");
        System.out.println("2: Enter new employee");
        System.out.println("0: Exit");
    }
    public static void getEmpChoice()
    {
        System.out.println("Is this employee:");
        System.out.println("1: Full-time");
        System.out.println("2: Part-time");
        System.out.println("3: Seasonal");
    }
    public static void getSearchMethod()
    {
        System.out.println("Would you like to search by:");
        System.out.println("1: First name");
        System.out.println("2: Last name");
        System.out.println("3: Id");
    }
    public static void getErrorMessage()
    {
        System.out.println("Invalid input! Please try again");
    }
}