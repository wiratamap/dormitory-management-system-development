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
public class CleaningServiceFactory {

    public CleaningService getCleaningService(String selectedMenu) {
        if (selectedMenu == null) {
            return null;
        }
        if (selectedMenu.equalsIgnoreCase("TIPE 1")) {
            return new CleaningServiceTipe1();
        } else if (selectedMenu.equalsIgnoreCase("TIPE 2")) {
            return new CleaningServiceTipe2();
        } else if (selectedMenu.equalsIgnoreCase("TIPE 3")) {
            return new CleaningServiceTipe3();
        }

        return null;
    }
}
