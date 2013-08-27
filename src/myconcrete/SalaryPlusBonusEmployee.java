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

//SalaryPlusBonusEmployee now imports from SalariedEmployee
public class SalaryPlusBonusEmployee extends SalariedEmployee {
 //Created variables bonus(double) and totalPay(double)
 private double bonus;
 private double totalPay;
 //Created BonusPay that asks the user how much their bonus was and uses the imput to determine bonus
 public void BonusPay (){
        bonus = (Double.parseDouble(JOptionPane.showInputDialog(null, "How much was your bonus?")));
    }
//Created a get for bonus
    public double getBonus() {
        return bonus;
    }
//Created a set for bonus
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
//Created a get for totalPay
    public double getTotalPay() {
        return totalPay;
    }
//Created a set for totalPay that uses getSalaryPay plus getBonus to determine totalPay
    public void setTotalPay() {
        totalPay = (getSalaryPay() + getBonus());
    }
 
}