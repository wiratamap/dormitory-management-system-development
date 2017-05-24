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
public class KamarVIP implements Kamar {

    public KamarVIP() {
    }
    
    public String getTitle() {
        return "Kamar VIP";
    }

    public void description() {
        System.out.println("Kamar VIP");
        System.out.println("Harga : Rp. " + getCost());
    }

    @Override
    public double getCost() {
        return 700000;
    }
}
