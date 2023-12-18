package LaporanKepolisian;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DataHelper {
    private static String id = "";
    private static String waktuDiLaporkan = "";
    
    private static String getId() {
        LocalDateTime dateobj = LocalDateTime.now();
        DateTimeFormatter tanggal_id = DateTimeFormatter.ofPattern("ddMMyyy");
        DateTimeFormatter waktu_id = DateTimeFormatter.ofPattern("HHmmss");
        
        DateTimeFormatter tanggal_dilaporkan = DateTimeFormatter.ofPattern("dd-MM-yyy");
        DateTimeFormatter waktu_dilaporkan = DateTimeFormatter.ofPattern("HH:mm:ss");
        
        String date_id = dateobj.format(tanggal_id);
        String time_id = dateobj.format(waktu_id);
        String date_dilaporkan = dateobj.format(tanggal_dilaporkan);
        String time_dilaporkan = dateobj.format(waktu_dilaporkan);
        
        String id = date_id.concat(time_id);
        waktuDiLaporkan = "Tanggal : " + date_dilaporkan + ", Jam : " + time_dilaporkan;
        System.out.println("ID : " + id);
        System.out.println("WAKTU DILAPORKAN : " + waktuDiLaporkan);
        return id;
    }
    
    public static void MasukkanDataPelapor(String nama, String jenisKelamin, String umur, String pekerjaan, String alamat) {
        id = getId();
        try {
            String sql = String.format("insert into data_pelapor values('%s','%s','%s','%s','%s','%s')", id, nama, jenisKelamin, umur, pekerjaan, alamat);
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/laporan_kepolisian", "root", "");
            conn.createStatement().executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Laporan Berhasil !");
        } catch(Exception e) {
            System.out.println("GAGAL TAMBAH Pelapor: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Gagal Connect ke Database : " + e.getMessage(), "Laporan Gagal !", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void MasukkanDataTerlapor(String nama, String jenisKelamin, String umur, String pekerjaan, String alamat) {
        try {
            String sql = String.format("insert into data_terlapor values('%s','%s','%s','%s','%s','%s')", id, nama, jenisKelamin, umur, pekerjaan, alamat);
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/laporan_kepolisian", "root", "");
            conn.createStatement().executeUpdate(sql);
        } catch(Exception e) {
            System.out.println("GAGAL TAMBAH Terlapor : " + e.getMessage());
        }
    }
    
    public static void MasukkanDataPeristiwa(String jenisPeristiwa, String waktuKejadian, String tempatKejadian, String apayangTerjadi, String bagaimanaTerjadi) {
        try {
            String sql = String.format("insert into data_peristiwa values('%s','%s','%s','%s','%s','%s','%s')", id, jenisPeristiwa, waktuKejadian, tempatKejadian, apayangTerjadi, bagaimanaTerjadi, waktuDiLaporkan);
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/laporan_kepolisian", "root", "");
            conn.createStatement().executeUpdate(sql);
        } catch(Exception e) {
            System.out.println("GAGAL TAMBAH Peristiwa : " + e.getMessage());
        }
    }
 
    public static DefaultTableModel getDataPelaporModel() {   
        int no = 1;
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
             
        };
        model.addColumn("NO");
        model.addColumn("ID");
        model.addColumn("NAMA PELAPOR");
        model.addColumn("JENIS KELAMIN");
        model.addColumn("UMUR");
        model.addColumn("PEKERJAAN");
        model.addColumn("ALAMAT");
        
        try {
            String sql = "SELECT * FROM data_pelapor ORDER BY nama";
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/laporan_kepolisian", "root", "");
            Statement stm = conn.createStatement();
            ResultSet res = stm.executeQuery(sql);
            while(res.next()) {
                model.addRow(new Object[] {
                    no++, res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6)
                });
            }         
            System.out.println("BERHASIL AMBIL DATA");
        } catch(Exception e) {
            System.out.println("GAGAL AMBIL DATA : " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Gagal Connect ke Database : " + e.getMessage(), "Error !", JOptionPane.ERROR_MESSAGE);
        }
       
        return model;
    }
    
    public static ArrayList<String> getDataTerlapor(String id) {
        ArrayList<String> list = new ArrayList<>();
        
        try {
            String sql = "SELECT * FROM data_terlapor WHERE id = " + id;
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/laporan_kepolisian", "root", "");
            Statement stm = conn.createStatement();
            ResultSet res = stm.executeQuery(sql);

            while(res.next()) {
                for(int i = 1; i <= 6; i++) {
                    list.add(res.getString(i));
                }
            }  
            System.out.println("BERHASIL AMBIL DATA TERLAPOR");
        } catch (Exception e) {
            System.out.println("GAGAL AMBIL DATA : " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Gagal Connect ke Database : " + e.getMessage(), "Gagal Tampilkan Data !", JOptionPane.ERROR_MESSAGE);
        }
        
        return list;
    }
    
    public static ArrayList<String> getDataPeristiwa(String id) {
        ArrayList<String> list = new ArrayList<>();
        
        try {
            String sql = "SELECT * FROM data_peristiwa WHERE id = " + id;
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/laporan_kepolisian", "root", "");
            Statement stm = conn.createStatement();
            ResultSet res = stm.executeQuery(sql);

            while(res.next()) {
                for(int i = 1; i <= 7;i++) {
                    list.add(res.getString(i));
                }
            }  
            System.out.println("BERHASIL AMBIL DATA PERISTIWA");
        } catch (Exception e) {
            System.out.println("GAGAL AMBIL DATA : " + e.getMessage());
        }
        
        return list;
    }
    
    public static void hapusData(String id) {
        try {
            String sql1 = String.format("delete from data_pelapor where id = %s", id);
            String sql2 = String.format("delete from data_terlapor where id = %s", id);
            String sql3 = String.format("delete from data_peristiwa where id = %s", id);
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/laporan_kepolisian", "root", "");
            conn.createStatement().executeUpdate(sql1);
            conn.createStatement().executeUpdate(sql2);
            conn.createStatement().executeUpdate(sql3);
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal Connect ke Database : " + e.getMessage(), "Gagal Hapus Data !", JOptionPane.ERROR_MESSAGE);
        }    
    }
}
