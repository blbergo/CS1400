//
// Name: Bergo, Bryan
// Homework: 4
// Due: 11/9/22
// Course: cs-1400-03-f22
//
// Description:
//      Program for searching and displaying periodic elements from a predefined table

//needs to run java PeriodicTableApp.PeriodicTableApp args
package PeriodicTableApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PeriodicTableApp  {
    public static void main(String[] args) throws FileNotFoundException {
        PeriodicTableApp PTA = new PeriodicTableApp();

        Element[] elements = new Element[118];
        PTA.loadTable(elements);


        if(args.length > 0) 
        {
            
            if(args[0].equals("print")) 
            {
            System.out.println("Periodic Table by B. Bergo\n");
            System.out.println("ANum  Name");
            System.out.println("----  --------------------");

        
            PTA.printTable(elements);
            } else if (args[0].equals("search")) 
            {
                int aNo = Integer.parseInt(args[1]);

                if(PTA.searchTable(elements, aNo) != -1) 
                {
                    System.out.println(elements[aNo-1].toString());
                } else 
                {
                    System.out.println(aNo + " Not Found.");
                }
            }
        }

    }

    public void loadTable(Element[] table)  throws FileNotFoundException
    {
        
        File file = new File("C:/Users/blb71/Documents/CS1400/PeriodicTableApp/periodictable2a.dat");
        Scanner scan = new Scanner(file);

        for(int i = 0; i < table.length; i++) 
        {
            if(scan.hasNext()) 
            {
                table[i] = new Element(scan.nextInt(), scan.next());
            } else 
            {
                //out of file length
                i = table.length;
            }
        }

    }

    int searchTable(Element[] table, int atomicNo) 
    {
        int i = 0;
        while(i < table.length && table[i].getANo() != atomicNo) 
        {
            i++;
        }

        if(i == table.length) 
        {
            return -1;
        } else 
        {
            return i + 1;
        }
    }

    void printTable(Element[] table) 
    {
        for(int i = 0; i < table.length; i++) 
        {
            System.out.println(table[i].toString());
        }
    }


    
}
