/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Model;

/**
 *
 * @author Sato
 */
public class Pemilih {

    /**
     * @return the pilihan
     */
    public String getPilihan() {
        return pilihan;
    }

    /**
     * @param pilihan the pilihan to set
     */
    public void setPilihan(String pilihan) {
        this.pilihan = pilihan;
    }

    /**
     * @return the total1
     */
    public String getTotal1() {
        return total1;
    }

    /**
     * @param total1 the total1 to set
     */
    public void setTotal1(String total1) {
        this.total1 = total1;
    }

    /**
     * @return the total2
     */
    public String getTotal2() {
        return total2;
    }

    /**
     * @param total2 the total2 to set
     */
    public void setTotal2(String total2) {
        this.total2 = total2;
    }
    
    private String pilihan;
    private String total1;
    private String total2;
}
