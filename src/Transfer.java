
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Pranjali
 */
public class Transfer extends javax.swing.JFrame {

    /**
     * Creates new form Transfer
     */
    public Transfer() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        taccnametxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        taccnotxt = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        tbalancetxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 500));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(51, 102, 0)));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Pranjali Documents\\Pictures\\sammple image\\transfer.png")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 70, 170, 160);

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("in which you want to transfer money");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(370, 60, 470, 50);

        taccnametxt.setBackground(new java.awt.Color(255, 204, 255));
        taccnametxt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        taccnametxt.setForeground(new java.awt.Color(204, 51, 0));
        jPanel1.add(taccnametxt);
        taccnametxt.setBounds(620, 210, 240, 70);

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Enter account number and account holder's name ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(270, 10, 640, 50);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 153, 255)));
        jPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Account Holder's Name");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 20, 300, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(230, 210, 350, 70);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 153, 255)));
        jPanel3.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Account Number");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(30, 20, 200, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(310, 120, 250, 70);

        taccnotxt.setBackground(new java.awt.Color(255, 204, 255));
        taccnotxt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        taccnotxt.setForeground(new java.awt.Color(204, 51, 0));
        taccnotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taccnotxtActionPerformed(evt);
            }
        });
        jPanel1.add(taccnotxt);
        taccnotxt.setBounds(620, 120, 240, 70);

        jButton2.setBackground(new java.awt.Color(153, 255, 204));
        jButton2.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 102));
        jButton2.setText("Main Menu");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(36, 368, 159, 35);

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Click here for receipt");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(750, 420, 147, 20);

        jButton1.setBackground(new java.awt.Color(255, 153, 153));
        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 0, 51));
        jButton1.setText("Enter");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 0, 102)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(480, 390, 120, 41);

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 0, 102)));
        jPanel4.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 102));
        jLabel7.setText("Amount");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(30, 10, 140, 60);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(300, 300, 197, 70);

        tbalancetxt.setBackground(new java.awt.Color(204, 255, 255));
        tbalancetxt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tbalancetxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(tbalancetxt);
        tbalancetxt.setBounds(620, 300, 179, 70);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("Rs");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(840, 330, 60, 37);

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 153));
        jButton3.setText("Generate Receipt");
        jButton3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 153)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(740, 370, 210, 50);

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Click here for menu");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(36, 409, 147, 14);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 980, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        workChoice w=new workChoice();
        w.show();
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        toperation op=new toperation();
        try{
            String accnameStr= taccnametxt.getText();
             String accnoStr= taccnotxt.getText();
            
             if(toperation.isLogin(accnameStr, accnoStr, this)){
                 
                 
             }else{
                 JOptionPane.showMessageDialog(this,"Please type correct information");
             }
        }catch(HeadlessException exception){
             JOptionPane.showMessageDialog(this,"Please type correct information");
            
        } 
        try{
            String depositStr= tbalancetxt.getText();
           
             if(tdeposit.istdepo(Integer.parseInt(depositStr), this)){
                 
                 
             }else{
                 JOptionPane.showMessageDialog(this,"Retry again");
             }
        }catch(Exception exception){
             JOptionPane.showMessageDialog(this,"plz Retry"+exception);
            
        }
        try{
            String withStr= tbalancetxt.getText();
           
            balance.istransfer(Integer.parseInt(withStr), this); 
             if(withdrawclass.iswith(Integer.parseInt(withStr), this)){
                 JOptionPane.showMessageDialog(this,"Amount Transferred");
             }else{
                 JOptionPane.showMessageDialog(this,"Retry again");
             }
        }catch(Exception exception){
             JOptionPane.showMessageDialog(this,"plz Retry"+exception);
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void taccnotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taccnotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taccnotxtActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new treceipt().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transfer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField taccnametxt;
    private javax.swing.JTextField taccnotxt;
    private javax.swing.JTextField tbalancetxt;
    // End of variables declaration//GEN-END:variables
}