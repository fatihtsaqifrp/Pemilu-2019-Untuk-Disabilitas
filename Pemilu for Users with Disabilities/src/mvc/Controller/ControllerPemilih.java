/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Controller;

import java.util.List;
import javax.swing.JOptionPane;
import mvc.DAO.DAOPemilih;
import mvc.DAOInterface.IPemilih;
import mvc.Model.Pemilih;
import mvc.Model.TabelModelPemilih;
import mvc.View.FormPemilih;
import mvc.View.FormYakinPilih1;

/**
 *
 * @author Sato
 */
public class ControllerPemilih {

    FormYakinPilih1 frame;
    IPemilih impPemilih;
    List<Pemilih> lp;

    //kontrol yang dimiliki oleh pemilih 1
    
    public ControllerPemilih(FormYakinPilih1 frame) {
        this.frame = frame;
        impPemilih = new DAOPemilih();
        lp = impPemilih.get1();     //mendapatkan data pilihan 1
    }
    public void insert() {
        Pemilih p = new Pemilih();
        p.setPilihan(frame.getTfPilih().getText());
        impPemilih.insert(p);       //memasukkan data
    }
}
