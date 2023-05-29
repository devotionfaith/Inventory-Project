/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;
import java.sql.*;
import java.util.*;
import koneksi.connector;
import model.*;
import DAOImplements.datasepatuDAOImpl;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Acer
 */
public class DAOdatasepatu implements datasepatuDAOImpl{
    Connection connection;
    
    final String select = "SELECT * FROM data_sepatu";
    final String insert = "INSERT INTO data_sepatu (nama, brand, ukuran, warna, jumlah, harga) VALUES (?,?,?,?,?,?)";
    final String update = "UPDATE data_sepatu set nama=?,brand=?,ukuran=?,warna=?, jumlah=?, harga=? where id=?";
    final String delete = "DELETE FROM data_sepatu where id=?";

    
    public DAOdatasepatu(){
        connection = connector.connection();
    }
    
    

    @Override
    public boolean isDataExists(String nama, String brand, String ukuran, String warna) {
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            // Query untuk memeriksa keberadaan data
            String query = "SELECT COUNT(*) FROM data_sepatu WHERE nama = ? AND brand = ? AND ukuran = ? AND warna = ?";
            statement = connection.prepareStatement(query);
            statement.setString(1, nama);
            statement.setString(2, brand);
            statement.setString(3, ukuran);
            statement.setString(4, warna);
            resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                return count > 0;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return false;
    }

    @Override
    public void insert(datasepatu p) {
        PreparedStatement statement = null;
        try{
            statement= connection.prepareStatement(insert,Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, p.getNama());
            statement.setString(2, p.getBrand());
            statement.setString(3, p.getUkuran());
            statement.setString(4, p.getWarna());
            statement.setInt(5, p.getJumlah());
            statement.setInt(6, p.getHarga());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while(rs.next()){
                p.setId(rs.getInt(1));
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void update(datasepatu p) {
        PreparedStatement statement = null;
        try{
            statement= connection.prepareStatement(update);
            statement.setString(1, p.getNama());
            statement.setString(2, p.getBrand());
            statement.setString(3, p.getUkuran());
            statement.setString(4, p.getWarna());
            statement.setInt(5, p.getJumlah());
            statement.setInt(6, p.getHarga());
            statement.setInt(7, p.getId());
            statement.executeUpdate();

        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void updateJumlah(datasepatu p){
        PreparedStatement statement = null;

        try {
            // Query untuk melakukan update data
            String query = "UPDATE data_sepatu SET jumlah = jumlah + ? WHERE nama = ? AND brand = ? AND ukuran = ? AND warna = ?";
            statement = connection.prepareStatement(query);
            statement.setInt(1, p.getJumlah());
            statement.setString(2, p.getNama());
            statement.setString(3, p.getBrand());
            statement.setString(4, p.getUkuran());
            statement.setString(5, p.getWarna());
            statement.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    @Override
    public void delete(int id) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(delete);
            statement.setInt(1, id);
            statement.executeUpdate();  
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
        
    }
    
    

    @Override
    public List<datasepatu> getAll() {
        List<datasepatu> d_s = null;
        try{
            d_s = new ArrayList<datasepatu>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while(rs.next()){
                datasepatu sepatu = new datasepatu();
                sepatu.setId(rs.getInt("Id"));
                sepatu.setNama(rs.getString("Nama"));
                sepatu.setBrand(rs.getString("Brand"));
                sepatu.setUkuran(rs.getString("Ukuran"));
                sepatu.setWarna(rs.getString("Warna"));
                sepatu.setJumlah(rs.getInt("Jumlah"));
                sepatu.setHarga(rs.getInt("Harga"));
                d_s.add(sepatu);
            }
        }catch(SQLException ex){
            Logger.getLogger(DAOdatasepatu.class.getName()).log(Level.SEVERE,null,ex);
        }
        return d_s;
    }

    @Override
    public List<datasepatu> search(datasepatu p, String cari){
        List<datasepatu> d_s = null;
        try {
            d_s = new ArrayList<datasepatu>();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM data_sepatu where "+cari+"=?");
            if(cari.equals("nama")){
                statement.setString(1, p.getNama());
            }else if(cari.equals("brand")){
                statement.setString(1, p.getBrand());
            }else if(cari.equals("ukuran")){
                statement.setString(1, p.getUkuran());
            }else if(cari.equals("warna")){
                statement.setString(1, p.getWarna());
            }
            
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                datasepatu sepatu = new datasepatu();
                sepatu.setId(rs.getInt("Id"));
                sepatu.setNama(rs.getString("Nama"));
                sepatu.setBrand(rs.getString("Brand"));
                sepatu.setUkuran(rs.getString("Ukuran"));
                sepatu.setWarna(rs.getString("Warna"));
                sepatu.setJumlah(rs.getInt("Jumlah"));
                sepatu.setHarga(rs.getInt("Harga"));
                d_s.add(sepatu);
            }
            rs.close();
            statement.close();
        } catch (SQLException e) {
            Logger.getLogger(DAOdatasepatu.class.getName()).log(Level.SEVERE, null, e);
        }
        return d_s;
    }
}

