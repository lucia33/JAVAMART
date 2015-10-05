package general;

import hr.SalaryPlusCommissionEmployee;
import java.util.Scanner;
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
       
        //employee test data
        SalaryPlusCommissionEmployee emp = new  SalaryPlusCommissionEmployee(
        "Tony","Persson",50,30000.00,"Sales Manager",2015,05,20,10000.00,0.2);
         
        //emp testing 
        System.out.println(emp.toString());
        emp.setLastName("Smith");
        System.out.println(emp.toString());
       
       
       
        //product test data
        Product myProduct = new Product("T123","Test Product", "Test Category", 
        "Test manufacturer", "Test Description", "Test Part Num", 10.00,20.00,
        0.22,50);
       
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
                        System.out.println(myProduct.toString()); 
                    }
                    else if(prodInput==2)
                    {
                        System.out.println("Enter a new product here");
                        
                    }
                    else if(prodInput==0)
                    {
                        prodBool = false;
                        getInitialMessage();
                    }
                    else
                    {
                        System.out.println("Invalid input! Please try again");
                        
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
                    if(prodInput==1)
                    {
                        System.out.println("Run Employee Search here");
                        
                    }
                    else if(prodInput==2)
                    {
                        System.out.println("Enter a new employee here");
                        
                    }
                    else if(prodInput==0)
                    {
                        hrBool = false;
                        getInitialMessage();
                    }
                    else
                    {
                        System.out.println("Invalid input! Please try again");
                        
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
                System.out.println("Please enter a valid input value!");
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
}