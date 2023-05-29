/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.List;
import DAOs.DAOdatasepatu;
import DAOImplements.datasepatuDAOImpl;
import model.*;
import view.form_data;
/**
 *
 * @author Acer
 */
public class DataSepatuController {
    form_data frame;
    datasepatuDAOImpl impldatasepatu;
    List<datasepatu> d_s;
    
    public DataSepatuController(form_data frame){
        this.frame = frame;
        impldatasepatu =  new DAOdatasepatu();
        d_s = impldatasepatu.getAll();
    }
    
    public boolean isDataExist(){
        return impldatasepatu.isDataExists(frame.getInputNama().getText(),frame.getInputBrand().getText(),frame.getInputUkuran().getText(),frame.getInputWarna().getText());
    }
    
    public void showtabel(){
        d_s = impldatasepatu.getAll();
        ModelTabelSepatu ms = new ModelTabelSepatu(d_s);
        frame.getTabelData().setModel(ms);
    }
    
    public void insert(){
        datasepatu d_s = new datasepatu();
        d_s.setNama(frame.getInputNama().getText());
        d_s.setBrand(frame.getInputBrand().getText());
        d_s.setUkuran(frame.getInputUkuran().getText());
        d_s.setWarna(frame.getInputWarna().getText());
        d_s.setJumlah(Integer.parseInt(frame.getInputJumlah().getText()));
        d_s.setHarga(Integer.parseInt(frame.getInputHarga().getText()));
        impldatasepatu.insert(d_s);
        
    }
    
    public void update(){
        datasepatu d_s = new datasepatu();
        d_s.setNama(frame.getInputNama().getText());
        d_s.setBrand(frame.getInputBrand().getText());
        d_s.setUkuran(frame.getInputUkuran().getText());
        d_s.setWarna(frame.getInputWarna().getText());
        d_s.setJumlah(Integer.parseInt(frame.getInputJumlah().getText()));
        d_s.setHarga(Integer.parseInt(frame.getInputHarga().getText()));
        d_s.setId(Integer.parseInt(frame.getInputId().getText()));
        impldatasepatu.update(d_s);
    }
    
        
    public void updateJumlah(){
        datasepatu d_s = new datasepatu();
        d_s.setNama(frame.getInputNama().getText());
        d_s.setBrand(frame.getInputBrand().getText());
        d_s.setUkuran(frame.getInputUkuran().getText());
        d_s.setWarna(frame.getInputWarna().getText());
        d_s.setJumlah(Integer.parseInt(frame.getInputJumlah().getText()));
        d_s.setHarga(Integer.parseInt(frame.getInputHarga().getText()));
        impldatasepatu.updateJumlah(d_s);
    }
    
    public void delete(){
        int id = Integer.parseInt(frame.getInputId().getText());
        impldatasepatu.delete(id);
    }
    
    public void reset(){
        frame.getInputId().setText(null);
        frame.getInputNama().setText(null);
        frame.getInputBrand().setText(null);
        frame.getInputUkuran().setText(null);
        frame.getInputWarna().setText(null);
        frame.getInputJumlah().setText(null);
        frame.getInputHarga().setText(null); 
    }
    
    public void search(){      
        datasepatu ds = new datasepatu();
        String cari = frame.getCari();
        ds.setBrand(frame.getInputSearch().getText());
        ds.setNama(frame.getInputSearch().getText());
        ds.setWarna(frame.getInputSearch().getText());
        ds.setUkuran(frame.getInputSearch().getText());
        d_s = impldatasepatu.search(ds, cari);
        ModelTabelSepatu ms = new ModelTabelSepatu(d_s);
        frame.getTabelData().setModel(ms);

    }
}
