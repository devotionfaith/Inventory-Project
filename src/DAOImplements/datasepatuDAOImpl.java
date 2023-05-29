/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAOImplements;
import java.util.List;
import model.*;
/**
 *
 * @author Acer
 */
public interface datasepatuDAOImpl {
    public void updateJumlah(datasepatu p);
    public boolean isDataExists(String nama, String brand, String ukuran, String warna);
    public void insert(datasepatu p);
    public void update(datasepatu p);
    public void delete(int id);
    public List<datasepatu> search(datasepatu p, String cari);
    public List<datasepatu> getAll();
}
