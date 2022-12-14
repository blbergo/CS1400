//
// Name: Bergo, Bryan
// Homework: 5
// Due: 11/27/22
// Course: cs-1400-03-f22
//
// Description:
//  Program that uses the FuelGauge and Odometer classes to simulate a car's gas mileage

public class CarInstrumentSimulator {
    public static void main(String[] args) {
        Odometer od = new Odometer(21000);
        FuelGauge fg = new FuelGauge();

        System.out.println("Car Instrument Simulator by B. Bergo \n");
        System.out.println("Fuel level    Odometer");
        System.out.println("----------    --------");
        
        //pump 15 gallons
        while(fg.getFuel() < 15) 
        {
            fg.incremenetFuel();
        }

        //drive until empty
        while(fg.getFuel() > 0) 
        {
            od.incrementMileage(fg);
        }
    }
}
