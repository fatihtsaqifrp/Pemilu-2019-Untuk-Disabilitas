/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Koneksi;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Sato
 */
public class Koneksi {
    static Connection con;
    
    //membuat koneksi dengan database
    public static Connection connection()
    {
        if (con == null)
        {
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("db_pemilu");  //nama database
            data.setUser("root");               //user login sesuai database
            data.setPassword("");               //password login sesuai database
            try {
                con = data.getConnection(); //mengkoneksikan
            } catch (SQLException ex) {
                System.out.println("Tidak terhubung database"); //catch jika tidak konek
            }
        }
        return con;
    }
}
