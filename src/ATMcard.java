
import com.mysql.cj.xdevapi.Statement;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Pranjali
 */
public class ATMcard
        extends javax.swing.JFrame {

    /**
     * Creates new form ATM_card
     */
    public ATMcard() {
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

        jLabel2 = new javax.swing.JLabel();
        accnotxt = new javax.swing.JTextField();
        accnametxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        validitytxt = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cvvtxt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(1000, 700));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Microsoft Tai Le", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText("Insert  your  ATM  CARD ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(299, 0, 441, 76);

        accnotxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(accnotxt);
        accnotxt.setBounds(150, 230, 290, 30);

        accnametxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(accnametxt);
        accnametxt.setBounds(150, 290, 180, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Enter Account number here");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(154, 260, 220, 20);

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 0, 102));
        jButton1.setText("Insert");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 153)));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(740, 260, 179, 50);

        validitytxt.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        validitytxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1/2022", "2/2022", "3/2022", "4/2022", "5/2022", "6/2022", "7/2022", "8/2022", "9/2022", "10/2022", "11/2022", "12/2022", "1/2023", "2/2023", "3/2023", "4/2023", "5/2023", "6/2023", "7/2023", "8/2023", "9/2023", "10/2023", "11/2023", "12/2023", "1/2024", "2/2024", "3/2024", "4/2024", "5/2024", "6/2024", "7/2024", "8/2024", "9/2024", "10/2024", "11/2024", "12/2024", "1/2025", "2/2025", "3/2025", "4/2025", "5/2025", "6/2025", "7/2025", "8/2025", "9/2025", "10/2025", "11/2025", "12/2025" }));
        getContentPane().add(validitytxt);
        validitytxt.setBounds(387, 290, 70, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Enter Account Holder's name here");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(144, 324, 270, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Expiry");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(394, 310, 80, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Enter CVV here");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(294, 480, 120, 20);

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("Enter your Account number,Card holder's name,Card expiry and CVV");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(86, 79, 540, 40);

        cvvtxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(cvvtxt);
        cvvtxt.setBounds(300, 440, 90, 40);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/atmimage1.jpg"))); // NOI18N
        jLabel4.setText("jL");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(-40, -10, 590, 470);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(80, 130, 420, 460);

        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ATM-CARDnew.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 610);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1040, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Operations op=new Operations();
        try{
            String accnameStr= accnametxt.getText();
             String accnoStr= accnotxt.getText();
             String cvvStr=cvvtxt.getText();
             
             if(Operations.isLogin(accnameStr, accnoStr,cvvStr, this)){
                 new PIN().setVisible(true);
                 this.dispose();
             }else{
                 JOptionPane.showMessageDialog(this,"Please type correct information");
             }
        }catch(HeadlessException exception){
             JOptionPane.showMessageDialog(this,"Please type correct information");
            
        } 
        
    }//GEN-LAST:event_jButton1ActionPerformed
      
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
          
           
    }//GEN-LAST:event_jButton1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ATMcard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ATMcard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ATMcard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ATMcard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ATMcard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accnametxt;
    private javax.swing.JTextField accnotxt;
    private javax.swing.JTextField cvvtxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> validitytxt;
    // End of variables declaration//GEN-END:variables
}
