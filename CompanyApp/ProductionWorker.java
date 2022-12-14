package CompanyApp;


public class ProductionWorker extends Employee {

    private int shift;
    private double hourlyPayRate;
    
    public ProductionWorker(String name, EmployeeId id, Date hireDate, int shift, double hourlyPayRate) 
    {
       super(name, id, hireDate);

       this.shift = shift;
       this.hourlyPayRate = hourlyPayRate;

    }

    public int getShift() 
    {
        return shift;
    } 

    public void setShift(int shift) 
    {
        this.shift = shift;
    }

    public double getHourlyPayRate() 
    {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) 
    {
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public String toString() 
    {
        return "Name: " + super.getName() + " Employee ID: " + super.getId() + " Hire Date: " + super.getHireDate() + " Shift: " + shift
        + " Hourly Pay: " + hourlyPayRate;
    }
    
}
