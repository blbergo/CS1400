package CompanyApp;


public class Date {

    private int month, day, year;

    public Date(int month, int day, int year) throws IllegalArgumentException
    {
        boolean valid = true;

        //first check for crazy values
        if(month > 0 && month <= 12 && day <= 31 && day > 0 && year > 0) 
        {
            //proper days in a month
            if(month != 2) 
            {
                if(!((month % 2 == 0 && day <= 31) || (month %2 != 0 && day <= 30))) 
                {
                    valid = false;
                }
            }
            //leap year 
            else if(year % 4 == 0 && year % 100 != 0 && year % 400 != 0)
            {
                if(day > 28) 
                {
                    valid = false;
                }
            } else if(day > 30) 
            {
                valid = false;
         
            } 
        } else 
        {
            valid = false;
        }


        //assign values or error out
        if(valid) 
        {
            this.month = month;
            this.day = day;
            this.year = year;
        } else 
        {
            throw new IllegalArgumentException("Invalid Date Format");
        }
    }

    @Override
    public String toString() 
    {
        return month + "/" + day + "/" + year;
    }

  
}
