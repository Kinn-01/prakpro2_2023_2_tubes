/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package id.ac.unpas.ecycle.ubahProfil;

import id.ac.unpas.ecycle.dao.RegistrasiDao;
import id.ac.unpas.ecycle.db.MySqlConnection;
import id.ac.unpas.ecycle.login.LoginFrame;
import id.ac.unpas.ecycle.main.MainFrame;
import id.ac.unpas.ecycle.registrasi.Registrasi;
import id.ac.unpas.ecycle.ubahProfil.ubahProfileModelTable;
import java.io.File;


import java.util.*;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;


/**
 *
 * @author adawiyahajr
 */
public class UbahProfileFrame extends javax.swing.JFrame {

    private List<Registrasi> registrasiList;
    private RegistrasiDao registrasiDao;
    private MainFrame mainFrame;
    private UbahProfileFrame ubahProfileFrame;
    private ubahProfileModelTable ubahProfileModelTable;
    private Registrasi registrasiUbah;
    
    
    
    
    public UbahProfileFrame() {
        this.registrasiDao = new RegistrasiDao();
        this.registrasiDao = registrasiDao;
        this.registrasiList = this.registrasiDao.findAll();
        this.ubahProfileModelTable = new ubahProfileModelTable(registrasiList);
        initComponents();
    }
    
    

        
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textfieldNama = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textfieldAlamat = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        textfieldTglLahir = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        buttonHome = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        buttonHapus = new javax.swing.JButton();
        buttonUbah = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbUbahProfile = new javax.swing.JTable();
        buttonSimpanUbah = new javax.swing.JButton();
        buttonPrint = new javax.swing.JButton();
        buttonPreview = new javax.swing.JButton();
        buttonPDF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ubah Profil");
        jLabel1.setPreferredSize(new java.awt.Dimension(30, 30));

        jPanel1.setBackground(java.awt.Color.lightGray);

        jLabel2.setText("Nama :");

        textfieldNama.setColumns(20);
        textfieldNama.setRows(5);
        jScrollPane1.setViewportView(textfieldNama);

        jLabel3.setText("Alamat :");

        textfieldAlamat.setColumns(20);
        textfieldAlamat.setRows(5);
        jScrollPane2.setViewportView(textfieldAlamat);

        jLabel4.setText("Tanggal lahir :");

        textfieldTglLahir.setColumns(20);
        textfieldTglLahir.setRows(5);
        jScrollPane3.setViewportView(textfieldTglLahir);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 255));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ecycle");

        buttonHome.setText("Home");
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });

        jButton3.setText("About");

        jButton4.setText("Contact");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel5)
                .addGap(155, 155, 155)
                .addComponent(buttonHome)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(228, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(buttonHome)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(16, 16, 16))
        );

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gilman Arief\\Downloads\\uncpas.jpeg")); // NOI18N
        jLabel6.setText("jLabel6");
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel6.setMaximumSize(new java.awt.Dimension(2053, 2048));
        jLabel6.setMinimumSize(new java.awt.Dimension(2053, 2048));
        jLabel6.setPreferredSize(new java.awt.Dimension(2053, 2048));

        buttonHapus.setBackground(new java.awt.Color(0, 0, 255));
        buttonHapus.setForeground(new java.awt.Color(255, 255, 255));
        buttonHapus.setText("Hapus");
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });

        buttonUbah.setBackground(new java.awt.Color(0, 0, 255));
        buttonUbah.setForeground(new java.awt.Color(255, 255, 255));
        buttonUbah.setText("Ubah");
        buttonUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUbahActionPerformed(evt);
            }
        });

        tbUbahProfile.setModel(ubahProfileModelTable);
        tbUbahProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbUbahProfileMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbUbahProfile);

        buttonSimpanUbah.setBackground(new java.awt.Color(0, 0, 255));
        buttonSimpanUbah.setForeground(new java.awt.Color(255, 255, 255));
        buttonSimpanUbah.setText("Simpan Ubah");
        buttonSimpanUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpanUbahActionPerformed(evt);
            }
        });

        buttonPrint.setBackground(new java.awt.Color(0, 0, 255));
        buttonPrint.setForeground(new java.awt.Color(255, 255, 255));
        buttonPrint.setText("Print");
        buttonPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPrintActionPerformed(evt);
            }
        });

        buttonPreview.setBackground(new java.awt.Color(0, 0, 255));
        buttonPreview.setForeground(new java.awt.Color(255, 255, 255));
        buttonPreview.setText("Preview");
        buttonPreview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPreviewActionPerformed(evt);
            }
        });

        buttonPDF.setBackground(new java.awt.Color(0, 0, 255));
        buttonPDF.setForeground(new java.awt.Color(255, 255, 255));
        buttonPDF.setText("Export to PDF");
        buttonPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(buttonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonSimpanUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonPreview)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonPDF)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(304, 304, 304)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonHapus)
                    .addComponent(buttonUbah)
                    .addComponent(buttonSimpanUbah)
                    .addComponent(buttonPrint)
                    .addComponent(buttonPreview)
                    .addComponent(buttonPDF))
                .addGap(51, 51, 51)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        mainFrame = new MainFrame();
        mainFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonHomeActionPerformed

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
        // TODO add your handling code here:
        int row = this.tbUbahProfile.getSelectedRow();
        int column = this.tbUbahProfile.getSelectedColumn();

        if (row == -1 || column == -1) {
            return;
        } else {
            String newValue = (String) this.tbUbahProfile.getModel().getValueAt(row, column);

            Registrasi id = new Registrasi();

            String col = "";

            switch (column) {
                case 0:
                    col = "nama";
                    break;
                case 1:
                    col = "alamat";
                    break;
                case 2:
                    col = "tanggal_lahir";
                    break;
                default:
                    System.out.println("Kolom tidak ditemukan");
                    break;
            }
            id = this.registrasiDao.select(col, newValue);

            this.delete(id);
            this.registrasiDao.delete(id);
        }
    }//GEN-LAST:event_buttonHapusActionPerformed

    private void buttonUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUbahActionPerformed
        // TODO add your handling code here:
        int row = tbUbahProfile.getSelectedRow();
        int column = tbUbahProfile.getSelectedColumn();

        if (row == -1 || column == -1) {
            return;
        }

        String dataUbah = (String) tbUbahProfile.getModel().getValueAt(row, column);

        int id = -1;
        String col = "";

        switch (column) {
            case 0:
                col = "nama";
                break;
            case 1:
                col = "alamat";
                break;
            case 2:
                col = "tangal_lahir";
                break;
            default:
                System.out.println("Kolom tidak ditemukan");
                break;
        }
        id = this.registrasiDao.select(col, dataUbah).getId();

        this.textfieldNama.setText(this.registrasiDao.select(col, dataUbah).getNama());
        this.textfieldAlamat.setText(this.registrasiDao.select(col, dataUbah).getAlamat());
        this.textfieldTglLahir.setText(this.registrasiDao.select(col, dataUbah).getTanggal_lahir());

        

        registrasiUbah = new Registrasi(); // Jangan mengubah registrasiUbah menjadi null sebelum menggunakannya

        registrasiUbah.setId(id);
    }//GEN-LAST:event_buttonUbahActionPerformed

    private void tbUbahProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbUbahProfileMouseClicked
        
    }//GEN-LAST:event_tbUbahProfileMouseClicked

    private void buttonSimpanUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanUbahActionPerformed
        String nama = this.textfieldNama.getText();
        String alamat = this.textfieldAlamat.getText();
        String tanggal_lahir = this.textfieldTglLahir.getText();
//        String nama = this.textfieldNamaPelanggan.getText();
//        String alamat = this.textfieldAlamatPelanggan.getText();
          Registrasi registrasiUbah = new Registrasi(); // Inisialisasi objek sebelum menggunakannya

//        Registrasi registrasi = new Registrasi();
//        registrasi.setId(registrasiUbah.getId());
//        registrasi.setNama(nama);
//        registrasi.setAlamat(alamat);
//        registrasi.setTanggal_lahir(tanggal_lahir);
//
//        this.registrasiDao.update(registrasi);
//        this.update(registrasi);

         
         Registrasi registrasi = new Registrasi();
         registrasi.setId(this.registrasiUbah.getId());
         registrasi.setNama(nama);
         registrasi.setAlamat(alamat);
         registrasi.setTanggal_lahir(tanggal_lahir);

         this.registrasiDao.update(registrasi);
         this.update(registrasi);

    }//GEN-LAST:event_buttonSimpanUbahActionPerformed

    private void buttonPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPrintActionPerformed
        try{
            //Mendapatkan path direktori laporan
            String reportPath = System.getProperty("user.dir") + File.separator + "report";
            
            //Mendapatkan path lengkap untuk file laporan (MemberReport.jrxml)
            String path = reportPath + File.separator + "dataMasyarakat.jrxml";
            
            //mengompilasi file laporan menjadi objek jasperReport
            JasperReport jasperReport = JasperCompileManager.compileReport(path);
            
            //Membuat objek parameter untuk laporan
            Map<String,Object> parameters = new HashMap<>();
            
            //Mengisi laporan menggunakan data dari koneksi database
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,
                    parameters, MySqlConnection.getInstance().getConnection());
            
            //Mencetak Laporan ke printer
            JasperPrintManager.printReport(jasperPrint, true);
        } catch (Exception e) {
            // menangani exception dengan mencetak stackTrace
            e.printStackTrace();
        } 
    }//GEN-LAST:event_buttonPrintActionPerformed

    private void buttonPreviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPreviewActionPerformed
        try{
            //Mendapatkan path direktori laporan
            String reportPath = System.getProperty("user.dir") + File.separator + "report";
            
            //Mendapatkan path lengkap untuk file laporan (MemberReport.jrxml)
            String path = reportPath + File.separator + "dataMasyarakat.jrxml";
            
            //mengompilasi file laporan menjadi objek jasperReport
            JasperReport jasperReport = JasperCompileManager.compileReport(path);
            
            //Membuat objek parameter untuk laporan
            Map<String,Object> parameters = new HashMap<>();
            
            //Mengisi laporan menggunakan data dari koneksi database
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,
                    parameters, MySqlConnection.getInstance().getConnection());
            
            // Menampilkan laporan dalam jendela pertinjau
            JasperViewer.viewReport(jasperPrint);
        } catch (Exception e) {
            // menangani exception dengan mencetak stackTrace
            e.printStackTrace();
        }
    }//GEN-LAST:event_buttonPreviewActionPerformed

    private void buttonPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPDFActionPerformed
        try{
            //Mendapatkan path direktori laporan
            String reportPath = System.getProperty("user.dir") + File.separator + "report";
            
            //Mendapatkan path lengkap untuk file laporan (MemberReport.jrxml)
            String path = reportPath + File.separator + "dataMasyarakat.jrxml";
            
            //mengompilasi file laporan menjadi objek jasperReport
            JasperReport jasperReport = JasperCompileManager.compileReport(path);
            
            //Membuat objek parameter untuk laporan
            Map<String,Object> parameters = new HashMap<>();
            
            //Mengisi laporan menggunakan data dari koneksi database
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,
                    parameters, MySqlConnection.getInstance().getConnection());
            
            // membuat direktori jika belum ada
            File outDir = new File(reportPath);
            outDir.mkdirs();
            //Mencetak laporan ke PDF
            JasperExportManager.exportReportToPdfFile(jasperPrint, reportPath + File.separator + "dataMasyarakat.pdf");
            
            //Menampilkan pesan dialog bahwa proses export selesai
            JOptionPane.showMessageDialog(this, "Export Selesai");
        } catch (Exception e) {
            //menangani exception dengan mencetak stack trace
            e.printStackTrace();
        }
    }//GEN-LAST:event_buttonPDFActionPerformed
    
    public void delete(Registrasi registrasi) {
        // Tambahkan permintaan ke tableModel
        ubahProfileModelTable.delete(registrasi);
    }
    
    public void update(Registrasi registrasi) {
        ubahProfileModelTable.update(registrasi);
        textfieldNama.setText("");
        textfieldAlamat.setText("");
        textfieldTglLahir.setText("");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UbahProfileFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonPDF;
    private javax.swing.JButton buttonPreview;
    private javax.swing.JButton buttonPrint;
    private javax.swing.JButton buttonSimpanUbah;
    private javax.swing.JButton buttonUbah;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tbUbahProfile;
    private javax.swing.JTextArea textfieldAlamat;
    private javax.swing.JTextArea textfieldNama;
    private javax.swing.JTextArea textfieldTglLahir;
    // End of variables declaration//GEN-END:variables

    
}
