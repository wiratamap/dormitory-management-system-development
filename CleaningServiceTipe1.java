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
public class CleaningServiceTipe1 implements CleaningService{

    @Override
    public void facility() {
        System.out.println("Sapu bersih");
    }

    @Override
    public double getPrice() {
        return 10000;
    }

    @Override
    public String getTitle() {
        return "Cleaning Service Tipe 1";
    }
}
