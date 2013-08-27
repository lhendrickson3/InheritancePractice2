/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myabstract;

/**
 *
 * @author User
 */
import javax.swing.JOptionPane;

//HourlyEmployee now inherits from Employee
public class HourlyEmployee extends Employee{
    //Created variables hoursWorked(double), hourlyWage(double), and pay(double)
    private double hoursWorked;
    private double hourlyWage;
    private double pay;
    //Created HowManyHoursWored that asks the user how many hours they have worked and have the imput determine hoursWorked
    public void HowManyHoursWorked (){
    hoursWorked = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter how many hours you worked."));
    }
    //Created a get for hoursWorked
    public double getHoursWorked(){
    return hoursWorked;
    }
    //Created a set for hoursWorked
    public void setHoursWorked(double hoursWorked){
    this.hoursWorked = hoursWorked;
    }
    //Created PayPerHour that asks the user how much they get paid per hour and have the imput determine hourlyWage
    public void PayPerHour (){
    hourlyWage = Double.parseDouble(JOptionPane.showInputDialog(null, "How much do you get paid per hour."));
    }
    //Created a get for hourlyWage
    public double getHourlyWage(){
    return hourlyWage;
    }
    //Created a set for hourlyWage
    public void setHourlyWage(double hourlyWage){
    this.hourlyWage = hourlyWage;
    }
    //Created a set for pay that uses hoursWorked times hourlyWage to determine pay
    public void setPay(){
    pay = (hoursWorked * hourlyWage);
    }
    //Created a get for Pay
    public double getPay(){
    return pay;
    }
    //Assigned an outprintln to doSomething
    public void doSomething(){
    System.out.println("HourlyEmployee");
    }
}
