
/**
 * CarE class represents a vehicle with basic properties and operations.
 * 
 * This class provides functionality to store and manage car information
 * including the vehicle name and price. It includes validation for price
 * to ensure only non-negative values are accepted.
 *
 * @author Sushil Parajuli
 * @version 1.0
 */
public class CarE
{
    // Vehicle name
    private String name;
    
    // Vehicle price in currency units
    private int price;
    /**
     * Sets the name of the car.
     *
     * @param name the vehicle name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * Sets the price of the car with validation.
     * 
     * Ensures that only non-negative prices are accepted.
     * Negative prices are rejected with an error message.
     *
     * @param price the vehicle price to set
     */
    public void setPrice(int price)
    {
        if (price < 0)
        {
            System.out.println("Invalid price");
        } else
        {
            this.price = price;
        }
    }
    
    /**
     * Retrieves the name of the car.
     *
     * @return the vehicle name
     */
    public String getName()
    {
        return this.name;
    }
    
    /**
     * Retrieves the price of the car.
     *
     * @return the vehicle price
     */
    public int getPrice()
    {
        return this.price;
    }
    
    /**
     * Returns a string representation of the car.
     *
     * @return a formatted string containing the car name and price
     */
    @Override
    public String toString()
    {
        return "Car name: " + this.name + "\nPrice: " + this.price;
    }
    
    /**
     * Main method for testing the CarE class.
     * 
     * Creates a car instance, sets its properties, and prints the details.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args)
    {
        CarE car = new CarE();
        car.setName("Ford");
        car.setPrice(10000);
        
        System.out.println(car);
    }
}
