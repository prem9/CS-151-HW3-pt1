package com.example;

/**
 * Hello world!
 *
 */
public class EmployeeTest 
{
    
    public static void main( String[] args ) throws Exception
    {
        Employee John = new Employee("John", "Smith", "101", 35.0);
        System.out.println(John.computePay(40));
        System.out.println(John.computePay(23));
        System.out.println(John.computePay(1));
        System.out.println(John.computePay(0));
        System.out.println(John.computePay(-5));
        System.out.println(John.computePay(45));
    }
}
