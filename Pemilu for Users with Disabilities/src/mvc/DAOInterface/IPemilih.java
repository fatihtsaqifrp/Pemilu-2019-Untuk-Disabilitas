/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.DAOInterface;

import java.util.List;
import mvc.Model.Pemilih;

/**
 *
 * @author Sato
 */
public interface IPemilih {
    public void insert(Pemilih p);  //method memasukkan data voting
    public List<Pemilih> get1();    //mendapatkan data pemilih 1
    public List<Pemilih> get2();    //mendapatkan data pemilih 2
}
