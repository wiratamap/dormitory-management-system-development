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
public class LaundryTipe2 implements Laundry {

    @Override
    public void facility() {
        System.out.println("Cuci + Kering + Setrika");
    }

    @Override
    public double getPrice() {
        return 20000;
    }

    @Override
    public String getTitle() {
        return "Laundry Tipe 2";
    }
}
