import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CarTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CarTest
{
    /**
     * Default constructor for test class CarTest
     */
    public CarTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testGetFuelInTank()
    {
        Car testCar = new Car( 50 ); // create a car object that gets 50mpg
        double amount = testCar.getFuelInTank(); // test the method by running it on the new car
        assertEquals( 0, amount, 1e-6);  // make sure the expected amout of gas and actual amount match
    }
    
    @Test
    public void testAddFuel()
    {
        Car testCar = new Car( 50 );
        testCar.addFuel( 10 );
        double amount = testCar.getFuelInTank();
        assertEquals( 10, amount, 1e-6 );
        
        testCar.addFuel( 5 );
        amount = testCar.getFuelInTank();
        assertEquals( 15, amount, 1e-6 );
        
    }
    
    @Test
    public void testDrive()
    {
        Car testCar = new Car( 50 );
        testCar.addFuel( 10 );
        testCar.drive( 25 );
        double amount = testCar.getFuelInTank();
        assertEquals( 9.5, amount, 1e-6);
        
        testCar.drive( 100 );
        amount = testCar.getFuelInTank();
        assertEquals( 7.5, amount, 1e-6);
    }
    
    @Test
    public void testSetLicensePlate()
    {
        Car testCar = new Car();
        String newPlate = new String("CompSci1");
        testCar.setLicensePlate(newPlate);
        String returnedPlate = testCar.getLicensePlate();
        assertEquals(newPlate, returnedPlate);
    }
    
    
    
    
    
}