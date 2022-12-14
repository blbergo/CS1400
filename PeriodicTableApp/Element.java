package PeriodicTableApp;

public class Element 
{
    private int aNo;
    private String name;

    public Element(int aNo, String name) {
        this.aNo = aNo;
        this.name = name;
    }

    public int getANo() 
    {
        return aNo;
    }

    public String getName() 
    {
        return name;
    }

    @Override
    public String toString() {
       super.toString();

       return String.format("%4d", aNo) + "  " + String.format("%-20s",name);
    }
}