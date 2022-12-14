public class FuelGauge 
{
    private int fuel;
    private static int MAX_FUEL = 15;

    public FuelGauge() 
    {
        fuel = 0;
    }

    public int getFuel() 
    {
        return fuel;
    }

    public void incremenetFuel() 
    {
        if(fuel + 1 <= MAX_FUEL) 
        {
            fuel++;
        }
    }

    public void decrementFuel() 
    {
        if(fuel - 1 >= 0) 
        {
            fuel--;
        }
    }
}