package CompanyApp;

//
// Name: Bergo, Bryan
// Project 5
// Due: 12/7/2022
// Course: cs-1400-03-f22
//
// Description:
//  Program for testing the Employee and its subclasses ProductionWorker, ShiftSupervisor and TeamLeader which represent
//  different members of a company 

public class CompanyApp {
    public static void main(String[] args) {
        
        Employee[] employees = new Employee[4];

        System.out.println("My Company by B. Bergo \n");

        try 
        {
            employees[0] = new Employee("Bryan", new EmployeeId("175-A"), new Date(4,19,2021));
            employees[1] = new ProductionWorker("Abner", new EmployeeId("123-B"), new Date(9, 12, 2002), 0, 19);
            employees[2] = new ShiftSupervisor("Jenny", new EmployeeId("542-H"), new Date(3,20,2014), 80000, 20000);
            employees[3] = new TeamLeader("Bri", new EmployeeId("333-B"), new Date(3, 13, 2015), 40, 1000, 1, 21.50);
            
            for(Employee employee: employees) 
            {
                System.out.println(employee);
            }

        } catch (IllegalArgumentException e) 
        {
            System.out.println(e);
        } 


    }
}
