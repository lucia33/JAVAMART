package products;

import general.ServiceClass;

/**
 *
 * @author jxm
 */
public class Product 
{
    private String productName, origin, category, description;
    private double cost, price;
    private Manufacturer manufacturer;
    private int productId;
    private static int productCount;
    
    // default constructor
    public Product()
    {
    }
    
    // overloading constructor
    public Product(String productName, Manufacturer manufacturer, String origin, 
            String category, String description, double cost, double price)
    {
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.origin = origin;
        this.category = category;
        this.description = description;
        this.cost = cost;
        this.price = price;
        this.productId = ServiceClass.getProductId();
        updateProductCounter();
    }
    
    // constructor with less info
    public Product(String productName, Manufacturer manufacturer, String category, String description)
    {
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.category = category;
        this.description = description;
        this.productId = ServiceClass.getProductId();
        updateProductCounter();
    }
    
    // simpler version without manufacturer
    public Product(String productName, String category, String description)
    {
        this.productName = productName;
        this.category = category;
        this.description = description;
        this.productId = ServiceClass.getProductId();
        updateProductCounter();
    }
    
    // accessor methods
    public String getProductName()
    {
        return this.productName;
    }
    public String getOrigin()
    {
        return this.origin;
    }
    public String getCategory()
    {
        return this.category;
    }
    public String getDescription()
    {
        return this.description;
    }
    public double getCost()
    {
        return this.cost;
    }
    public double getPrice()
    {
        return this.price;
    }
    public int getProductId()
    {
        return this.productId;
    }
    public String getManufacturerName()
    {
        return manufacturer.getMName();
    }
    
    // mutator methods
    private void updateProductCounter()
    {
        productCount++;
    }
    
    
    // toString - print info
    @Override
    public String toString()
    {
        String info = "Product Info:";
        info += "\nId:\t\t" + getProductId();
        info += "\nName:\t\t" + getProductName();
        info += "\nManufacturer:\t" + getManufacturerName();
        info += "\nOrigin:\t" + getOrigin();
        info += "\nCategory:\t" + getCategory();
        info += "\nDescription:\t" + getDescription();
        info += "\nCost:\t" + getCost();
        info += "\nPrice:\t" + getPrice();
        return info;        
    }
}
