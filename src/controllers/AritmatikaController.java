/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.Aritmatika;
import view.Kalkulator;

/**
 *
 * @author yusuf
 */
public class AritmatikaController {
    
    private Kalkulator view;
    private Aritmatika model;

    public AritmatikaController(Kalkulator view, Aritmatika model) {
        this.view = view;
        this.model = model;
        this.view.addTambahListener(new TambahListener());
    }
    
    class TambahListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            model.setBil1(view.getBil1());
            model.setBil2(view.getBil2());
            view.setHasil(model.getPenjumlahan());
        }
        
    }
    
}
