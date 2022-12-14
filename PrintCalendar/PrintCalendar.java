//
// Name: Bergo, Bryan
// Project: 3
// Due: 10/19/22
// Course: cs-1400-03-f22
//
// Description:
//  Program for outputing a desired monthly calendar into a text file when supplied a month and year

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrintCalendar {
    public static void main(String[] args) throws IOException
    {
        
        Scanner kb = new Scanner(System.in);
        
        //required IO
        System.out.println("Calendar by B. Bergo \n");
        System.out.print("Enter month year? ");

        

        int month = kb.nextInt();
        int year = kb.nextInt();

        //file IO
        String fileName = month + "-" + year + ".txt";
        PrintWriter pw = new PrintWriter("./PrintCalendar/" + fileName);


        //header text
        String headerText = getMonthName(month) + " " + year;
        String colText = "Sun  Mon  Tue  Wed  Thu  Fri  Sat\n---------------------------------";
        pw.println(headerText);
        pw.println(colText);

        
        System.out.println(fileName);

        //cacl first day of the month
        int first = getDayOfTheWeek(1, month, year);
        pw.print("  ");

        //tracker var - used for space generation and later date numbering
        int i = 0;

        //special case for first week
        while(i < 7)
        {
            if(i < first) 
            {
                pw.print("     ");
            } else if( i == first) 
            {
                pw.print((i-first + 1) + "    ");
            } else
            {
                pw.print((i - first + 1) + "    ");
            }

            i += 1;
        }


        //reset i to track days of the month
        i = i - first + 1;

        //special cases for febraury, determine how many days in a month
        // +1 val to actual val 
        int daysInMoth = getNumberOfDaysInMonth(month, year);

        //String remainingWeeks = "  ";
        pw.println();
        pw.print("  ");
        //generate rest of the month
        while(i < daysInMoth) 
        {
            //week by week
            for(int k = 0; k < 7 && i <= daysInMoth; k++) 
            {
                if(i < 9) 
                {
                    pw.print(i + "    ");
                } else 
                {
                    pw.print(i + "   ");
                }

                i++;
                
            }

            pw.println("");

            if(i < 10) 
            {
                pw.print("  ");
            } else 
            {
                pw.print( " ");
            }
        }
        
      
        pw.close();

        //required IO
        System.out.printf("\n%d-%d.txt generated.", month, year);

        }
        

    public static int getDayOfTheWeek(int day, int month, int year) 
    {
        int a = (14-month) / 12;
        int y = year - a;
        int m = month + 12*a -2;

        int d = ((day+y+y/4-y/100+y/400+(31*m)/12)) % 7;

        return d;
    }

    public static boolean isLeapYear(int year) 
    {
        return (year % 4 == 0 && year % 100 != 0 && year % 400 != 0);
    }

    public static String getMonthName(int month) 
    {
     
        //return "" if month is not between 1-12
        String m = "";

        switch(month) {
            case 1:
                m = "January";
                break;
            case 2:
                m = "February";
                break;
            case 3:
                m = "March";
                break;
            case 4:
                m = "April";
                break;
            case 5:
                m =  "May";
                break;
            case 6:
                m = "June";
                break;
            case 7:
                m = "July";
                break;
            case 8:
                m = "August";
                break;
            case 9:
                m = "September";
                break;
            case 10:
                m = "October";
                break;
            case 11:
                m = "November";
                break;
            case 12:
                m = "December";
                break;

        }
        
        return m;
    }

    public static int getNumberOfDaysInMonth(int month, int year) 
    {
        //february
        //val is +1 of actual value to work with for loop logic
        if(month == 2) 
        {
            return isLeapYear(year) ? 29:30;
        } else if (month % 2 == 0) 
        {
            return 31;
        } else 
        {
            return 30;
        }

      
    }
    
}
