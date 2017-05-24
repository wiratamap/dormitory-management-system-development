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
public class LaundryFactory {

    public Laundry getLaundry(String selectedMenu) {
        if (selectedMenu == null) {
            return null;
        }
        if (selectedMenu.equalsIgnoreCase("TIPE 1")) {
            return new LaundryTipe1();

        } else if (selectedMenu.equalsIgnoreCase("TIPE 2")) {
            return new LaundryTipe2();
        }

        return null;
    }
}
