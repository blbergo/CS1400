//
// Name: Bergo, Bryan
// Project: 4
// Due: 11/2/22
// Course: cs-1400-03-f22
//
// Description:
//  Program that generates 8 car objects and simulates speed changes randomly

package RacingCarApp;

import java.util.Random;

public class RacingCarApp {
    public static void main(String[] args) 
    {
        RacingCarApp RCA = new RacingCarApp();
        Car[] cars = RCA.initCars();

        Random rand = new Random();

        //required IO
        System.out.println("Racing Car by B. Bergo \n");
        System.out.println("Model  Make                  Speed");
        System.out.println("-----  --------------------  -----");

        //loop throught the cars
        for(int i = 0; i < cars.length; i++) 
        {
            for(int j = 0; j < 30; j++) 
            {
                int randInt = rand.nextInt(20) + 1;

                if(randInt <= 18) 
                {
                    cars[i].accelerate();
                } else 
                {
                    cars[i].brake();
                }

            }

            System.out.println(cars[i].toString());
        }
    }

    //helper function used to populate car objects easier
    public Car[] initCars() 
    {
        Car[] cars = new Car[8];

        //yearModel and makes info
        int[] yearModels = {2013, 2007, 2022, 1997, 2010, 2018, 1968, 1990};
        String[] makes = {"Toyota Tacoma", "Ford F250", "Ford Maverick", "Chevy Silverado", 
                          "Mitibuishi Lancer", "Jeep Wrangler", "Ford Mustang", "Land Rover Defender"};

        //populate the arrays
        for(int i = 0; i < cars.length; i++) 
        {
            //adjust spaces so they line up evenly
            while(makes[i].length() <= 20) 
            {
                makes[i] += " ";
            }

            cars[i] = new Car(yearModels[i], makes[i]);
        }

        return cars;
    }
}
