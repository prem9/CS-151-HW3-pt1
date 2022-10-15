package com.example;


class TooManyHoursWorkedException extends Exception{
    TooManyHoursWorkedException(String s){
        super(s);
    }
}

public class Employee 
{

    private String firstName;
    private String lastName;
    private String employeeId;
    private Double hourlyPay;

    public Employee(String first2, String last2, String id2, Double pay2)
    {
        firstName = first2;
        lastName = last2;
        employeeId = id2;
        hourlyPay = pay2;
    }
    public void setFirstName(String firstSet)
    {
        firstName = firstSet;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public void setLastName(String lastSet)
    {
        lastName = lastSet;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setId(String idSet)
    {
        employeeId = idSet;
    }
    public String getId()
    {
        return employeeId;
    }
    public void setPay(Double paySet)
    {
        hourlyPay = paySet;
    }
    public Double getPay()
    {
        return hourlyPay;
    }
    public Double computePay(int hrs) throws Exception
    {
         Double result = 0.0;
        try {
        if ((hrs * hourlyPay) < 0)
            throw new NumberFormatException("Pay is negative");
       else if  (hrs > 40)
            throw new TooManyHoursWorkedException("Hours worked are greater than 40");
        else result = hrs * hourlyPay;
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
        catch(TooManyHoursWorkedException e){
            System.out.println(e);
        }
        return result;
    }
    
}
