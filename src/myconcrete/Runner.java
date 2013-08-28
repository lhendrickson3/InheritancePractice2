/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myconcrete;


/**
 *
 * @author User
 */
public class Runner {

  public static void main(String[] args){
  //Calling the methods from HourlyEmployee
  HourlyEmployee myEmployee = new HourlyEmployee();
  myEmployee.HowManyHoursWorked();
  myEmployee.PayPerHour();
  myEmployee.setPay();
  myEmployee.setAmountPaid(myEmployee.getPay());
      System.out.println("Amount paid " + myEmployee.getAmountPaid());
  //Calling the methods from SalariedEmployee
      System.out.println("yolo1");
  SalariedEmployee mySalariedEmployee = new SalariedEmployee();
      System.out.println("yolo2");
  mySalariedEmployee.HowManyYearsWorked();
      System.out.println("yolo3");
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
