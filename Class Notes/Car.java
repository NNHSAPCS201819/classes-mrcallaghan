
/**
 * This class models a car.
 * 
 * @author mcallaghan 
 * @version 11 Sept 2018
 */
public class Car
{
    /*
     * Instance variable store the object's properties/attributes
     *      specify the visibility (e.g. private)
     *          public: accessible by anyone
     *          private: only accessed through methods in teh class
     *      specify the type (e.g. double)
     *      specify the name (e.g. fuelEfficiency)
     *      
     *  Instance variables differ form local variable in teh following ways:
     *      scoped to their class (accessible using the methods of class)
     *      automatically initialized to a default value (0, false, null)
     */
    
    // instance variables - replace the example below with your own
    private double fuelEfficiency;  // in units of miles per gallon
    private double fuelInTank;      // in units of gallons

    /**
     * Default constructor for the Car class
     *      Initializes the fuel efficiency to 30 mpg and the fuel in this car's tank to 0 gallons.
     */
    public Car()
    {
        
    }
    
    public Car( double initialEfficiency )
    {
        
    }
    
    /*
     * When defining a method, specify:
     *      the visibility (e.g. public)
     *      the return type (e.g. void)
     *      the method name (e.g. drive)
     *      the parameters and their types (e.g. distance of type double)
     */
    
    /**
     * Drives the car the specified distance, in miles, consuming fuel
     * 
     * @param distance the distance, in miles, this car drives
     */
    public void drive( double distance )
    {
        
    }
    
    /**
     * Adds the specified amount of fule to this car's tank.
     * 
     * @param amount the amoun of fuel, in galons to add to this car's tank
     */
    public void addFuel( double amount )
    {
        
    }
    
    /**
     * Returns the amount of fuel in this car's tank
     * 
     * @return the amount of fuel, in gallons, in this car's tank
     */
    public double getFuelInTank()
    {
        return 0;
    }
}
