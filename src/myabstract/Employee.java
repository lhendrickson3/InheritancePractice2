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

/**
*
* @author User
*/
public abstract class Employee {
    //Created variable amountPaid(double)
    private double amountPaid;
    //Created an output method that would output getAmountPaid
    public void paid() {
    JOptionPane.showMessageDialog(null, getAmountPaid());
    }
    //Created a set for amountPaid
    public void setAmountPaid(double Value) {
        amountPaid = Value;
    }
    //Created a get for AmountPaid
    public double getAmountPaid() {
        return amountPaid;
    }
    //Created an abstract class named doSomething
    abstract public void doSomething();
    
}