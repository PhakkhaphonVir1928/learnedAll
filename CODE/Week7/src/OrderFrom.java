import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class OrderFrom extends javax.swing.JFrame {

    public OrderFrom() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        // สร้าง UI ตามที่คุณให้มา
        // ... (โค้ดการสร้าง UI ทั้งหมด)
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String name = jTextField1.getText();
        String contactChannels = jTextField2.getText();
        String type = (String) jComboBox1.getSelectedItem();
        String scale = (String) jComboBox2.getSelectedItem();
        String price = (String) jComboBox3.getSelectedItem();
        String date = jTextField3.getText();
        String time = (String) jComboBox4.getSelectedItem();

        // สร้างข้อความสำหรับ Receipt
        String receiptText = String.format(
            "Name: %s\nContact Channels: %s\nType: %s\nScale: %s\nPrice: %s\nDate: %s\nTime: %s",
            name, contactChannels, type, scale, price, date, time
        );

        // เลือกที่เก็บไฟล์โดยระบุพาธ
        String filePath = "C:/Users/YourUsername/Documents/receipt.txt"; // เปลี่ยนที่อยู่พาธตามต้องการ

        // เขียนข้อความลงไฟล์
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(receiptText);
            System.out.println("บันทึกข้อมูลลงไฟล์เรียบร้อยแล้ว");
        } catch (IOException e) {
            System.err.println("เกิดข้อผิดพลาดในการเขียนไฟล์: " + e.getMessage());
        }
    }                                        
        
    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jComboBox2KeyReleased(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
    }

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        Main ui = new Main();
        ui.setVisible(true);
        this.setVisible(false);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderFrom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing
