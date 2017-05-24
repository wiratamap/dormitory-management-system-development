/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PPP_Project;

/**
 *
 * @author ACER 471
 */
public abstract class Payment {

    final void PaymentProcess(double cost, String detail) {
       paymentDescription();
       insertIdentity();
       printReceipt(cost, detail);
    }
    
    abstract void paymentDescription();
    
    abstract void insertIdentity();
    
    abstract void printReceipt(double cost, String detail);
}
