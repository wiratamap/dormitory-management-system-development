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
public class CateringFactory {

    public Catering getCatering(String selectedMenu) {
        if (selectedMenu == null) {
            return null;
        }
        if (selectedMenu.equalsIgnoreCase("PAKET 1")) {
            return new CateringPaket1();
        } else if (selectedMenu.equalsIgnoreCase("PAKET 2")) {
            return new CateringPaket2();
        } else if (selectedMenu.equalsIgnoreCase("PAKET 3")) {
            return new CateringPaket3();
        }

        return null;
    }
}
