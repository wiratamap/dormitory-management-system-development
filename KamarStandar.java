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
public class KamarStandar implements Kamar {

    public KamarStandar() {
    }
    
    public String getTitle() {
        return "Kamar Standar";
    }

    public void description() {
        System.out.println("Kamar Standar");
        System.out.println("Harga : Rp. " + getCost());
    }

    public double getCost() {
        return 500000;
    }

}
