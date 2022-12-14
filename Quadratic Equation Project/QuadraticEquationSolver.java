//
// Name: Bergo, Bryan
// Project: 1
// Due: 9/26/22
// Course: cs-1400-03-f22
//
// Description:
//  Algorithm for solving the quadratic equation, with solutions including real numbers only

import java.util.Scanner;

public class QuadraticEquationSolver 
{
   
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        double x1, x2;

        System.out.println("Quadratic Equation Solver by B. Bergo \n");

        //gather inputs
        System.out.println("Enter a:");
        a = scanner.nextInt();

        System.out.println("Enter b:");
        b = scanner.nextInt();

        System.out.println("Enter c:");
        c = scanner.nextInt();

        System.out.println();

        //calculate x values
        x1 = (-b + Math.sqrt(Math.pow(b, 2)- 4*a*c)) / (2*a);
        x2 = (-b - Math.sqrt(Math.pow(b, 2)- 4*a*c)) / (2*a);

        //output values
        System.out.println("The solutions:");
        System.out.printf("x1: %s \n", x1);
        System.out.printf("x2: %s", x2);
    
    }

 

}