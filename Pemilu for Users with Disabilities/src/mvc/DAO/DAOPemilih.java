/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.DAO;

import mvc.Koneksi.Koneksi;
import mvc.Model.Pemilih;
import mvc.DAOInterface.IPemilih;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mvc.View.FormHasil;

/**
 *
 * @author Sato
 */
public class DAOPemilih implements IPemilih{
    Connection connection;
    //query sql
    final String insert = "INSERT INTO tblpemilu (pilihan) VALUES (?);";
    final String count1 = "SELECT COUNT(pilihan) FROM tblpemilu WHERE pilihan=1;";
    final String count2 = "SELECT COUNT(pilihan) FROM tblpemilu WHERE pilihan=2;";
    
    public DAOPemilih()
    {
        connection = Koneksi.connection();
    }
    
    //method memasukkan data
    @Override
    public void insert(Pemilih p) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert);    //memanggil query insert
            statement.setString(1, p.getPilihan());             //mengaplikasikan ke kolom 1 database (pilihan)
            statement.executeUpdate();                          //update data
        } catch (Exception e) {
            System.out.println("Gagal Input Pilihan");           //catch jjika gagal
        } finally
        {
            try {
                statement.close();      //menghentikan statement
            } catch (SQLException e) {
                System.out.println("Gagal Input Perhitungan");
            }
        }
    }
    
    @Override
    public List<Pemilih> get1() {
        List<Pemilih> lp = null;
        try {
            lp = new ArrayList<Pemilih>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(count1);         //melakukan query count
            while (rs.next()) {
                String hasil1 = rs.getString(1);
                Pemilih p = new Pemilih();
                p.setTotal1(rs.getString(1));
                System.out.println(hasil1);     //melakukan printf hasil
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOPemilih.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lp;
    }
    
    @Override
    public List<Pemilih> get2() {
        List<Pemilih> lp = null;
        try {
            lp = new ArrayList<Pemilih>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(count2);     //melakukan query count
            while (rs.next()) {
                String hasil1 = rs.getString(1);
                Pemilih p = new Pemilih();
                p.setTotal2(rs.getString(1));
                System.out.println(hasil1);     //melakukan printf hasil
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOPemilih.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lp;
    }
}
