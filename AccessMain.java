package com.avn.tns.accessdemo;

public class AccessMain {

    public static void main(String[] args) {

        // Creating object
        AccessDemo emp = new AccessDemo();

        // Accessing public and default members directly
        emp.empName = "Lahari";
        emp.department = "AIML";
        emp.company = "Microsoft";

        // Accessing private variable through setter
        emp.setEmpId(1025);

        // Display the values
        emp.display();

        // Print individually
        System.out.println("Employee ID (via getter): " + emp.getEmpId());
    }
}
