/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myconcrete;


/**
 *
 * @author User
 */
import javax.swing.JOptionPane;

//SalariedEmployee not inherits from Employee class
public class SalariedEmployee extends Employee{
    //Created variables yearsWorked(double), salary(double), and salaryPay(double)
    private double yearsWorked;
    private double salary;
    private double salaryPay;
    //Created HowManyYearsWorked that ask the user how many years they have worked using the imput to determine yearsWorked
    public void HowManyYearsWorked (){
        yearsWorked = (Double.parseDouble(JOptionPane.showInputDialog(null, "Enter how many years have you worked?")));
    }
    //Created YearlySalaray that asks the user what their yearly salary is and uses the imput to determine salary
    public void YearlySalary (){
        salary = (Double.parseDouble(JOptionPane.showInputDialog(null, "What is your salary?")));
    }
    //Created a get for salary
    public double getSalary() {
        return salary;
    }
    //Created a set for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }
    //Created a get for yearsWorked
    public double getYearsWorked() {
        return yearsWorked;
    }
    //Created a set for yearsWorked
    public void setYearsWorked(double yearsWorked) {
        this.yearsWorked = yearsWorked;
    }
    //Created a set for salaryPay that uses yearsWorked times salary to determine salaryPay
     public void setSalaryPay(){
    salaryPay = (getYearsWorked() * getSalary());
    }
    //Created a get for salaryPay
    public double getSalaryPay(){
    return salaryPay;
    }
}
