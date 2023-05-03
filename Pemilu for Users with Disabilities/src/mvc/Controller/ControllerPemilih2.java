/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Controller;

import java.util.List;
import mvc.DAO.DAOPemilih;
import mvc.DAOInterface.IPemilih;
import mvc.Model.Pemilih;
import mvc.View.FormPemilih;
import mvc.View.FormYakinPilih2;

/**
 *
 * @author Sato
 */
public class ControllerPemilih2 {
    FormYakinPilih2 frame;
    FormPemilih framehasil;
    IPemilih impPemilih;
    List<Pemilih> lp;
    
    //kontrol yang dimiliki oleh pemilih 2
    
    public ControllerPemilih2(FormYakinPilih2 frame)
    {
        this.frame = frame;
        impPemilih = new DAOPemilih();
        lp = impPemilih.get2();     //mendapatkan data pilihan 2
    }
    
    public void insert() {
        Pemilih p = new Pemilih();
        p.setPilihan(frame.getTfPilih().getText());
        impPemilih.insert(p);       //memasukkan data
    }
}
