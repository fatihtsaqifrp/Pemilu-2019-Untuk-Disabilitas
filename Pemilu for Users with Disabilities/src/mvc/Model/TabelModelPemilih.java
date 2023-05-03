/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Sato
 */
public class TabelModelPemilih extends AbstractTableModel{
    List<Pemilih> lp;
    
    public TabelModelPemilih(List<Pemilih> lp)
    {
        this.lp = lp;
    }
    
    //total baris di database
    @Override
    public int getRowCount() {
        return lp.size();   //set supaya menyesuaikan
    }

    //total kolom di database
    @Override
    public int getColumnCount() {
        return 1;   //1
    }
    
    //untuk mendapatkan data tertentu
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex)
        {
            case 0:
                return lp.get(rowIndex).getPilihan();
            default:
                return null;
        }
    }

    //nama kolom tabel
    @Override
    public String getColumnName(int column) {
        switch (column)
        {
            case 0:
                return "Pilihan";
            default:
                return null;
        }
    }
    
    
}
