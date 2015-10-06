package general;

/**
 *
 * @author jxm
 */
public class ServiceClass {
    private static int empId = 1000;
//    private static int prodId = 1000;
    
    public static int getEmpId()
    {
        return empId++;
    }
    
//    public static int getProdId()
//    {
//        return prodId++;
//    }
}
