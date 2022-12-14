package CompanyApp;


public class TeamLeader extends ProductionWorker {

    private int trainingHours, monthlyBonus;
    
    public TeamLeader(String name, EmployeeId id, Date hireDate, int trainingHours, int monthlyBonus, int shift, double hourlyPayRate) 
    {
        super(name, id, hireDate, shift, hourlyPayRate);
        this.trainingHours = trainingHours;
        this.monthlyBonus = monthlyBonus;
    }

    public int getTrainingHours() 
    {
        return trainingHours;
    }

    public void setTrainingHours(int trainingHours) 
    {
        this.trainingHours = trainingHours;
    }

    public int getMonthlyBonus() 
    {
        return monthlyBonus;
    }

    public void setMonthlyBonus(int monthlyBonus) 
    {
        this.monthlyBonus = monthlyBonus;
    }

    @Override
    public String toString() 
    {
        return "Name: " + super.getName() + " Employee ID: " + super.getId() + " Hire Date: " + super.getHireDate() + 
        " Required Training Hours: " + trainingHours + " Monthly Bonus: " + monthlyBonus + " Shift: " + super.getShift() + " Hourly Pay: " + super.getHourlyPayRate();
    }
}
