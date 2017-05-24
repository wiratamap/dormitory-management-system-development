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
public class KamarStandarDecorator extends KamarDecorator {

    public KamarStandarDecorator(Kamar decoratedKamar) {
        super(decoratedKamar);
    }

    @Override
    public void description() {
        decoratedKamar.description();
        setFacility(decoratedKamar);
    }

    private void setFacility(Kamar decoratedKamar) {
        System.out.println("Luas Kamar  : 7 x 5 Meter");
        System.out.println("Fasilitas :");
        System.out.println("1. Almari standar");
        System.out.println("2. AC");
        System.out.println("3. Meja belajar");
        System.out.println("4. Spring bed individual size");
        System.out.println("5. TV LED Screen");
        System.out.println("6. Public Wi-Fi");
    }

    @Override
    public double getCost() {
        return decoratedKamar.getCost();
    }

    @Override
    public String getTitle() {
        return decoratedKamar.getTitle();
    }
}
