import java.util.Scanner;


public class BmiApp

{

public static void main(String[] args) {

Scanner kb = new Scanner(System.in);

System.out.println("Enter the height in feet and inches?");

 int feet = kb.nextInt();

 int inches = kb.nextInt();

 System.out.println("Enter the weight (lbs)?");

 double weight = kb.nextDouble();


int heightInInches = (feet * 12) + inches;

 double bmi = (weight * 703) /Math.pow(heightInInches,2);


 System.out.println("BMI =" + String.format("%1.d", bmi));

if(bmi < 18.5)

 {

 System.out.println("Thin BMI");


 } else if (bmi >= 18.6 && bmi <= 24.9)

 {

 System.out.println("Healthy BMI");


 } else if (bmi >= 25 && bmi <= 29.9)

 {

 System.out.println("Overweight BMI");


 } else

 {

System.out.println("Obese BMI");
 } 


 }


}
