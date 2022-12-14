public class Odometer {
    private int milage;
    private int initialMileage;

    public Odometer(int initialMileage) 
    {
        //uses initial milage for comparison later
        milage = initialMileage;
        this.initialMileage = initialMileage;
    }

    public int getMileage() 
    {
        return milage;
    }

    public void incrementMileage(FuelGauge fg) 
    {
        //check if od needs to be reset
        if(milage + 1 < 100000) 
        {
            milage += 1;
        } else 
        {
            milage = 0;
        }

        //24 miles to the gallon
        if((milage - initialMileage) % 24 == 0) 
        {
            fg.decrementFuel();
        } else if((milage-initialMileage) % 15 == 0) 
        {
            //proper formatting
            if(fg.getFuel() < 10) 
            {
                System.out.println("    " + fg.getFuel() + "          " + milage);
            } else {
                System.out.println("    " + fg.getFuel() + "         " + milage);
            }
        }
    }
}
