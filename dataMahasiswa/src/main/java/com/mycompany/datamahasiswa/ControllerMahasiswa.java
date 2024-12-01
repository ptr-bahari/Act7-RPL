/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datamahasiswa;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
public class ControllerMahasiswa {
    ArrayList<ModelMahasiswa> ArrayData;
    DefaultTableModel tablelist;
    
    public ControllerMahasiswa(){
        ArrayData = new ArrayList<ModelMahasiswa>();
    }
    public void InsertData(String npm, String nama, int umur, boolean pindahan){
        ModelMahasiswa mhs = new ModelMahasiswa(npm, nama, umur, pindahan);
        ArrayData.add(mhs);
    }
}
