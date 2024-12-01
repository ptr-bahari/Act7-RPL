/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.datamahasiswa;

public class ModelMahasiswa {
    private String npm;
    private String nama;
    private int umur;
    private boolean pindahan;
    
    public ModelMahasiswa(String npm, String nama, int umur, boolean pindahan){
        this.npm = npm;
        this.nama = nama;
        this.umur = umur;
        this.pindahan = pindahan;
    }
    
    public String getNPM(){
        return npm;
    }
    
    public String getNama(){
        return nama;
    }
     
    public void setNama( String nama){
        this.nama = nama;
    }
    
    public int getUmur(){
        return umur;
    }
    
    public void setUmur(int umur){
        this.umur = umur;
    }
    
    public boolean isPindahan(){
        return pindahan;
    }
    
    public void setpindahan(boolean pindahan){
        this.pindahan = pindahan;
    }
}
