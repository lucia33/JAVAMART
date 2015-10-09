package products;

/**
 *
 * @author jxm
 */
public class Manufacturer {
    
    private String mName, address, telNum;
    
    // default constructor
    public Manufacturer ()
    {
        
    }
    
    // overloading constructor
    public Manufacturer (String mName, String address, String telNum)
    {
        this.mName = mName;
        this.address = address;
        this.telNum = telNum;
    }
    
    // accessor methods
    public String getMName()
    {
        return this.mName;
    }
    public String getAddress()
    {
        return this.address;
    }
    public String getTelNum()
    {
        return this.telNum;
    }
}
