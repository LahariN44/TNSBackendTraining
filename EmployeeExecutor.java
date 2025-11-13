package mypack;

// Main class to execute the Employee program
public class EmployeeExecutor {

    public static void main(String[] args) {

        // Create first employee object
        Employee e1 = new Employee();
        e1.empId = 101;
        e1.empName = "Lahari";
        e1.department = "AIML";

        // Create second employee object
        Employee e2 = new Employee();
        e2.empId = 102;
        e2.empName = "Anusha";
        e2.department = "CSIT";

        // Print employee details
        e1.printDetails();
        e2.printDetails();
    }
}
