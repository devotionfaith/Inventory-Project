/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Acer
 */
public class ModelTabelSepatu extends AbstractTableModel{

    List<datasepatu> d_s;    
            
    public ModelTabelSepatu(List<datasepatu>d_s){
        this.d_s = d_s;
    }
    
    @Override
    public int getRowCount() {
       return d_s.size();
    }

    @Override
    public int getColumnCount() {
       return 7;
    }

    @Override
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "ID";
            case 1:
                return "Nama";
            case 2:
                return "Brand";
            case 3:
                return "Ukuran";
            case 4:
                return "Warna";
            case 5:
                return "Jumlah";
            case 6:
                return "Harga";
            default:
                return null;
        }
    }
    @Override
    public Object getValueAt(int row, int column) {
        switch(column){
            case 0:
                return d_s.get(row).getId();
            case 1:
                return d_s.get(row).getNama();
            case 2:
                return d_s.get(row).getBrand();
            case 3:
                return d_s.get(row).getUkuran();
            case 4:
                return d_s.get(row).getWarna();
            case 5:
                return d_s.get(row).getJumlah();
            case 6:
                return d_s.get(row).getHarga();
            default:
                return null;
        }
    }
    
}
