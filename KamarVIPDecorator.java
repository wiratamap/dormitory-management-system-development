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
public class KamarVIPDecorator extends KamarDecorator {

    public KamarVIPDecorator(Kamar decoratedKamar) {
        super(decoratedKamar);
    }

    @Override
    public void description() {
        decoratedKamar.description();
        setFacility(decoratedKamar);
    }

    private void setFacility(Kamar decoratedKamar) {
        System.out.println("Luas Kamar  : 10 x 10 Meter");
        System.out.println("Fasilitas :");
        System.out.println("1. Almari jumbo");
        System.out.println("2. Kamar mandi dalam");
        System.out.println("3. AC");
        System.out.println("4. Meja belajar");
        System.out.println("5. Spring bed king size");
        System.out.println("6. TV LED Screen");
        System.out.println("7. Private Wi-Fi");
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
