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

public class DebitPayment extends Payment {

    Scanner in = new Scanner(System.in);
    private String name;
    private String bank;
    private String accountNumber;

    @Override
    void paymentDescription() {
        System.out.println("Anda akan membayarkan secara Debit. silahkan masukkan identitas anda"
                + " sebagai bukti pembayaran");
    }

    @Override
    void insertIdentity() {
        System.out.print("Nama          : ");
        String tempName = in.nextLine();
        System.out.print("Bank          : ");
        String tempBank = in.nextLine();
        System.out.print("No. rekening  : ");
        String tempAccountNumber = in.nextLine();
        setName(tempName);
        setBank(tempBank);
        setAccountNumber(tempAccountNumber);
    }

    @Override
    void printReceipt(double cost, String detail) {
        System.out.println("\n=====  BUKTI PEMBAYARAN  =====");
        System.out.println("Telah terima dari   : " + getName());
        System.out.println("Transfer bank       : " + getBank());
        System.out.println("No. Rekening        : " + getAccountNumber());
        System.out.println("Jumlah pembayaran   : Rp. " + cost);
        System.out.println("Untuk Keperluan     : "+ detail);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

}
