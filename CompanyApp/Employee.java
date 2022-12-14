package CompanyApp;

public class Employee {

    private String name;
    private EmployeeId id;
    private Date hireDate;

    public Employee(String name, EmployeeId id, Date hireDate) 
    {
        this.name = name;
        this.id = id;
        this.hireDate = hireDate;
    }

    //getters and setters
    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public EmployeeId getId() 
    {
        return id;
    }

    public void setId(EmployeeId id) 
    {
        this.id = id;
    }

    public Date getHireDate() 
    {
        return hireDate;
    }

    public void setHireDate(Date hireDate) 
    {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() 
    {
        return "Name: " + name + " Employee ID: " + id + " Hire Date: " + hireDate;
    }

}
