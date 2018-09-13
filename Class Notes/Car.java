
/**
 * Write a description of class Car here.
 * 
 * @author mcallaghan
 * @version 11 September 2018
 */
public class Car
{
    /*
     * Instance variable store the object's properties/attributes
     *      specify the visibility (e.g. private)
     *          public: accessible by anyone
     *          private: only accessed through methods in the class
     *      specify the type (e.g. double)
     *      specify the name (e.g. fuelEfficiency)
     *      
     *  Instance variables differ from local variable in the following ways:
     *      scoped to their class (accessible using the methods of the class)
     *      automatically initialized to a default value (0, false, null)
     */

    private double fuelEfficiency;  // in units of miles per gallon
    private double fuelInTank;      // in units of gallons
    private String licensePlate;
    
    /*
     * Constructor
     *      responsible for initializing newly created objects
     *      invoked automatically via the new operator
     *      the name of the constructor must match the name of the class
     *      has no return type (not even void)
     *      multiple constructors may be defined for a class
     *      one constructor may call another constructor (with restrictions)
     */
    
    /**
     * Default constructor for the class Car
     *      Initialize the fuel efficiency to 30 mpg and the fuel in the car's tank to 0 gallons
     */
    public Car()
    {
        /*
         * The 'this' reserved word references teh current object (like 'self' in Python)
         * It's usage is encouraged but usually not required.  
         */
        
        this.fuelEfficiency = 30;
        this.fuelInTank = 0;
        this.licensePlate = "";
        
    }
    
    /**
     * Constructs a new Car object with the specified fuel efficiency
     * 
     * @param initialEfficiency the initial fuel efficiency in mpg, of this new car
     */
    public Car( double initialEfficiency )
    {
        /*
         * If the parameter was named fuelEfficiency, it would "shadow" the instance 
         *      variable fuelEfficiency.
         * Local and parameter variable "shadow" instance variables of teh same name.  In this code
         *      fuelEfficiency would refer to the parameter and not the instance variable.
         *      
         * To refer explicitly to the instance variable, use "this".
         * Adivce: avoid the shadow issue by giving parameters unique names.
         */
        
        this.fuelEfficiency = initialEfficiency;
        this.fuelInTank = 0;
        this.licensePlate = "";
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
     * Adds the specified amount of fuel to this car's tank
     * 
     * @param amount the amount of fuel, in gallons, to add to the car's tank
     */
    public void addFuel( double amount )
    {
        this.fuelInTank += amount;
    }
    
    /**
     * Returns the amount of fuel in this car's tank
     * 
     * @return the amount of fuel, in galons, in this car's tank
     */
    public double getFuelInTank()
    {
        return this.fuelInTank;
    }
    
    /**
     * Sets the license plate to the specified value
     * 
     * @param plate the license plate for this car
     */
    public void setLicensePlate( String plate )
    {
        
    }
    
    /**
     * Gets the license plate of this car
     * 
     * @return the license plate of this car
     */
    public String getLicensePlate()
    {
        return "";
    }
    
    
    
    
    
}
