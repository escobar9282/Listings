package listings.interfaces001;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        var staff = new Employee[3];

        staff[0] = new Employee("Michael Brown", 35000);
        staff[1] = new Employee("John Coubre", 75000);
        staff[2] = new Employee("Jason Tatum", 38000);

        Arrays.sort(staff);

        for(Employee e : staff)
            System.out.println("name = " + e.getName() + ", salary = " + e.getSalary());
    }
}
