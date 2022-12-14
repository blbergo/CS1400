package RacingCarApp;

public class Car {
    private int yearModel;
    private String make;

    private int speed;
    private int minSpeed;
    private static final int maxSpeed = 180;

    public Car(int yearModel, String make) 
    {
        this.yearModel = yearModel;
        this.make = make;

        this.speed = 0;
        this.minSpeed = 0;
    }

    //getters
    public int getYearModel() 
    {
        return yearModel;
    }

    public String getMake() 
    {
        return make;
    }

    public int getSpeed() 
    {
        return speed;
    }

    //speed controls
    public void accelerate() 
    {
        if (speed + 5 <= maxSpeed) 
        {
            speed += 5;
        }
    }

    public void brake() 
    {
        if(speed - 5 >= minSpeed) 
        {
            speed -= 5;
        }
    }

    @Override
    public String toString() {
        super.toString();

        return yearModel + "   " + make + "   " + speed;
    }

}
