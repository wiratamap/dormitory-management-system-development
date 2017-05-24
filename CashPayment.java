/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PPP_Project;

import java.util.Scanner;

/**
 *
 * @author ACER 471
 */

public class CashPayment extends Payment {

    Scanner in = new Scanner(System.in);
    private String name;
    private String address;
    private String phoneNumber;

    @Override
    void paymentDescription() {
        System.out.println("Anda akan membayarkan secara tunai. silahkan masukkan identitas anda"
                + " sebagai bukti pembayaran");
    }

    @Override
    void insertIdentity() {
        System.out.print("Nama      : ");
        String tempName = in.nextLine();
        System.out.print("Alamat    : ");
        String tempAddress = in.nextLine();
        System.out.print("no telpon : ");
        String tempPhoneNumber = in.nextLine();
        setName(tempName);
        setAddress(tempAddress);
        setPhoneNumber(tempPhoneNumber);
    }

    @Override
    void printReceipt(double cost, String detail) {
        System.out.println("\n=====  BUKTI PEMBAYARAN  =====");
        System.out.println("Telah terima dari   : " + getName());
        System.out.println("Alamat              : " + getAddress());
        System.out.println("No. Telpon          : " + getPhoneNumber());
        System.out.println("Jumlah pembayaran   : Rp. " + cost);
        System.out.println("Untuk Keperluan     : "+ detail);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
