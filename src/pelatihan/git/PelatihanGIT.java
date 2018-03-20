/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelatihan.git;

import controllers.AritmatikaController;
import models.Aritmatika;
import view.Kalkulator;

/**
 *
 * @author yusuf
 */
public class PelatihanGIT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aritmatika model = new Aritmatika();
        Kalkulator view = new Kalkulator();
        AritmatikaController controller = new AritmatikaController(view, model);
        view.setVisible(true);
    }
    
}
