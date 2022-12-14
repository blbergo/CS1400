package CompanyApp;


public class ShiftSupervisor extends Employee {
    private int annualSalary, bonus;

    public ShiftSupervisor(String name, EmployeeId id, Date hireDate, int annualSalary, int bonus) 
    {
        super(name, id, hireDate);
        this.annualSalary = annualSalary;
        this.bonus = bonus;
    }

    public int getAnnualSalary() 
    {
        return annualSalary;
    }

    public void setAnnualSalary(int annualSalary) 
    {
        this.annualSalary = annualSalary;
    }

    public int getBonus() 
    {
        return bonus;
    }

    public void setBonus(int bonus) 
    {
        this.bonus = bonus;
    }

    @Override
    public String toString() 
    {
        return "Name: " + super.getName() + " Employee ID: " + super.getId() + " Hire Date: " + super.getHireDate() + 
        " Annual Salary: " + annualSalary + " Bonus: " + bonus;
    }
}
