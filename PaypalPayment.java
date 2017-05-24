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
import java.util.Scanner;
public class PaypalPayment extends Payment{

    Scanner in = new Scanner(System.in);
    private String name;
    private String paypalID;

    @Override
    void paymentDescription() {
        System.out.println("Anda akan membayarkan secara Debit. silahkan masukkan identitas anda"
                + " sebagai bukti pembayaran");
    }

    @Override
    void insertIdentity() {
        System.out.print("Nama          : ");
        String tempName = in.nextLine();
        System.out.print("ID Paypal     : ");
        String tempID = in.nextLine();
        setName(tempName);
        setPaypalID(tempID);
    }

    @Override
    void printReceipt(double cost, String detail) {
        System.out.println("\n=====  BUKTI PEMBAYARAN  =====");
        System.out.println("Telah terima dari   : " + getName());
        System.out.println("ID Paypal           : " + getPaypalID());
        System.out.println("Jumlah pembayaran   : Rp. " + cost);
        System.out.println("Untuk Keperluan     : "+ detail);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPaypalID() {
        return paypalID;
    }

    public void setPaypalID(String paypalID) {
        this.paypalID = paypalID;
    }
    
    
    
}
