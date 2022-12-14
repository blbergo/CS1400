package CompanyApp;

public class EmployeeId 
{
    private String id;

    public EmployeeId(String id) throws IllegalArgumentException
    {
        //check first characters, then check for the dash, then use int casting to check the ASCII value is between A and M
        if(Character.isDigit(id.charAt(0)) && Character.isDigit(id.charAt(1)) && Character.isDigit(id.charAt(2)) && 
            id.charAt(3) == '-' && (int)id.charAt(4) >= 65 && (int)id.charAt(4) <= 77)
        {
            this.id = id;
        } else 
        {
            throw new IllegalArgumentException("Invalid Format");
        }
    
    }

    public String getId() {
        return id;
    }

    public void setId(String id) 
    {
        //check first characters, then check for the dash, then use int casting to check the ASCII value is between A and M
        if(Character.isDigit(id.charAt(0)) && Character.isDigit(id.charAt(1)) && Character.isDigit(id.charAt(2)) && 
            id.charAt(3) == '-' && (int)id.charAt(4) >= 65 && (int)id.charAt(4) <= 77)
        {
            this.id = id;
        } else 
        {
            throw new IllegalArgumentException("Invalid Format");
        }
    }

    @Override
    public String toString() {
        return id;
    }
}