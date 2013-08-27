/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myinterface;


/**
 *
 * @author User
 */
public class Runner {
    //Calling the methods from HourlyEmployee
   public static void main(String[] args){
  HourlyEmployee myEmployee = new HourlyEmployee();
  myEmployee.HowManyHoursWorked();
  myEmployee.PayPerHour();
  myEmployee.setPay();
  myEmployee.setAmountPaid(myEmployee.getPay());
      System.out.println("Amount paid " + myEmployee.getAmountPaid());
  //Calling the methods from SalariedEmployee
  SalariedEmployee mySalariedEmployee = new SalariedEmployee();
  mySalariedEmployee.HowManyYearsWorked();
  mySalariedEmployee.YearlySalary();
  mySalariedEmployee.setSalaryPay();
  mySalariedEmployee.setAmountPaid(mySalariedEmployee.getSalaryPay());
  System.out.println("Salary paid " + mySalariedEmployee.getSalaryPay());
  //Calling the methods for SalaryPlusBonusEmployee
  SalaryPlusBonusEmployee myBonusEmployee = new SalaryPlusBonusEmployee();
  myBonusEmployee.HowManyYearsWorked();
  myBonusEmployee.YearlySalary();
  myBonusEmployee.BonusPay();
  myBonusEmployee.setSalaryPay();
  myBonusEmployee.setTotalPay();
  System.out.println("Total salary (plus bonus) paid " + myBonusEmployee.getTotalPay());
  
  }
}
