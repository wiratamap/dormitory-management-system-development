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
public class CateringPaket1 implements Catering{

    @Override
    public void facility() {
        System.out.println("1. Nasi");
        System.out.println("2. Sayur");
        System.out.println("3. Tahu dan Tempe");
    }

    @Override
    public double getPrice() {
        return 6000;
    }

    @Override
    public String getTitle() {
        return "Catering Paket 1";
    }
}
