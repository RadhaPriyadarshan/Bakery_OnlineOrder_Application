
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Priyadharshan
 */
public class Bakery_purchase extends javax.swing.JFrame {

    /**
     * Creates new form Bakery_purchase
     */
    public Bakery_purchase() {
        initComponents();
        billHeader();
      
       
    }
    public void billHeader()
{

txtbill.setText("================================"+"\n"
            +"\t"+"PORTUGUESE BAKERY"+"\n"
            +"\t"+"         TUTICORIN"+"\n"
            +"\t"+"     ORDER PREVIEW"+"\n"
               +"================================"+"\n");

}
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pay = new javax.swing.JButton();
        blackforest_cake = new javax.swing.JTextField();
        cheese_cake = new javax.swing.JTextField();
        strawberry_cake = new javax.swing.JTextField();
        blueberry_cake = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        sign_out = new javax.swing.JButton();
        preview = new javax.swing.JButton();
        bar = new javax.swing.JLabel();
        bar1 = new javax.swing.JLabel();
        abar = new javax.swing.JLabel();
        abar1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtbill = new javax.swing.JTextArea();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1560, 835));
        getContentPane().setLayout(null);

        pay.setBackground(new java.awt.Color(212, 176, 176));
        pay.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pay.setForeground(new java.awt.Color(223, 75, 75));
        pay.setText("Continue to Pay");
        pay.setBorder(null);
        pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payActionPerformed(evt);
            }
        });
        getContentPane().add(pay);
        pay.setBounds(1140, 650, 230, 50);

        blackforest_cake.setBackground(new java.awt.Color(223, 75, 75));
        blackforest_cake.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        blackforest_cake.setForeground(new java.awt.Color(212, 176, 176));
        blackforest_cake.setText("0");
        blackforest_cake.setBorder(null);
        blackforest_cake.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blackforest_cakeMouseClicked(evt);
            }
        });
        blackforest_cake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackforest_cakeActionPerformed(evt);
            }
        });
        getContentPane().add(blackforest_cake);
        blackforest_cake.setBounds(760, 240, 30, 60);

        cheese_cake.setBackground(new java.awt.Color(223, 75, 75));
        cheese_cake.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cheese_cake.setForeground(new java.awt.Color(212, 176, 176));
        cheese_cake.setText("0");
        cheese_cake.setBorder(null);
        cheese_cake.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cheese_cakeMouseClicked(evt);
            }
        });
        getContentPane().add(cheese_cake);
        cheese_cake.setBounds(760, 340, 30, 60);

        strawberry_cake.setBackground(new java.awt.Color(223, 75, 75));
        strawberry_cake.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        strawberry_cake.setForeground(new java.awt.Color(212, 176, 176));
        strawberry_cake.setText("0");
        strawberry_cake.setBorder(null);
        strawberry_cake.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                strawberry_cakeMouseClicked(evt);
            }
        });
        strawberry_cake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                strawberry_cakeActionPerformed(evt);
            }
        });
        getContentPane().add(strawberry_cake);
        strawberry_cake.setBounds(760, 460, 30, 50);

        blueberry_cake.setBackground(new java.awt.Color(223, 75, 75));
        blueberry_cake.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        blueberry_cake.setForeground(new java.awt.Color(212, 176, 176));
        blueberry_cake.setText("0");
        blueberry_cake.setBorder(null);
        blueberry_cake.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blueberry_cakeMouseClicked(evt);
            }
        });
        blueberry_cake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueberry_cakeActionPerformed(evt);
            }
        });
        getContentPane().add(blueberry_cake);
        blueberry_cake.setBounds(760, 570, 30, 50);

        total.setBackground(new java.awt.Color(223, 75, 75));
        total.setForeground(new java.awt.Color(212, 176, 176));
        total.setBorder(null);
        total.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                totalMouseMoved(evt);
            }
        });
        total.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                totalKeyReleased(evt);
            }
        });
        getContentPane().add(total);
        total.setBounds(700, 680, 140, 60);

        sign_out.setBackground(new java.awt.Color(212, 176, 176));
        sign_out.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sign_out.setForeground(new java.awt.Color(223, 75, 75));
        sign_out.setText("SIGN OUT");
        sign_out.setBorder(null);
        sign_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_outActionPerformed(evt);
            }
        });
        getContentPane().add(sign_out);
        sign_out.setBounds(1370, 730, 100, 30);

        preview.setBackground(new java.awt.Color(223, 75, 75));
        preview.setForeground(new java.awt.Color(212, 176, 176));
        preview.setText("preview");
        preview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previewActionPerformed(evt);
            }
        });
        getContentPane().add(preview);
        preview.setBounds(1370, 610, 72, 22);

        bar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 12.png"))); // NOI18N
        getContentPane().add(bar);
        bar.setBounds(1460, 270, 10, 350);

        bar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 12.png"))); // NOI18N
        getContentPane().add(bar1);
        bar1.setBounds(1020, 270, 10, 360);

        abar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 13.png"))); // NOI18N
        getContentPane().add(abar);
        abar.setBounds(1020, 270, 450, 10);

        abar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 13.png"))); // NOI18N
        getContentPane().add(abar1);
        abar1.setBounds(1020, 620, 450, 10);

        txtbill.setBackground(new java.awt.Color(212, 176, 176));
        txtbill.setColumns(20);
        txtbill.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbill.setForeground(new java.awt.Color(223, 75, 75));
        txtbill.setLineWrap(true);
        txtbill.setRows(5);
        txtbill.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtbillMouseMoved(evt);
            }
        });
        jScrollPane1.setViewportView(txtbill);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(1020, 270, 450, 360);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bakery_pur - Copy.png"))); // NOI18N
        bg.setText("bg");
        getContentPane().add(bg);
        bg.setBounds(-10, -10, 1560, 835);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void blackforest_cakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blackforest_cakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_blackforest_cakeActionPerformed

    private void payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payActionPerformed
        // TODO add your handling code here:
             try{
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bakery","root","mysql");
            
            String query = "insert into bakery.bakery_purchase (  blackforest, cheese, strawberry, blueberry)"+"values ( ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query);

            pst.setString(1, blackforest_cake.getText());
            pst.setString(2, cheese_cake.getText());
            pst.setString(3, strawberry_cake.getText());
            pst.setString(4, blueberry_cake.getText());
            pst.executeUpdate();
          
            Bakery_pay q = new Bakery_pay();
            q.setVisible(true);
            con.close();

        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Bakery_purchase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_payActionPerformed

    private void totalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalKeyReleased
        // TODO add your handling code here:
        int num1 = Integer.parseInt(blackforest_cake.getText());
        int num2 = Integer.parseInt(cheese_cake.getText());
        int num3 = Integer.parseInt(strawberry_cake.getText());
        int num4 = Integer.parseInt(blueberry_cake.getText());
        int output = (num1*50)+(num2*50)+(num3*50)+(num4*50);
        total.setText(""+output);
    }//GEN-LAST:event_totalKeyReleased

    private void blueberry_cakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueberry_cakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_blueberry_cakeActionPerformed

    private void blackforest_cakeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blackforest_cakeMouseClicked
        // TODO add your handling code here:
        blackforest_cake.setText("");
    }//GEN-LAST:event_blackforest_cakeMouseClicked

    private void cheese_cakeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cheese_cakeMouseClicked
        // TODO add your handling code here:
        cheese_cake.setText("");
    }//GEN-LAST:event_cheese_cakeMouseClicked

    private void strawberry_cakeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_strawberry_cakeMouseClicked
        // TODO add your handling code here:
        strawberry_cake.setText("");
    }//GEN-LAST:event_strawberry_cakeMouseClicked

    private void blueberry_cakeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blueberry_cakeMouseClicked
        // TODO add your handling code here:
        blueberry_cake.setText("");
    }//GEN-LAST:event_blueberry_cakeMouseClicked

    private void strawberry_cakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_strawberry_cakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_strawberry_cakeActionPerformed

    private void totalMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_totalMouseMoved
        // TODO add your handling code here:
        int num1 = Integer.parseInt(blackforest_cake.getText());
        int num2 = Integer.parseInt(cheese_cake.getText());
        int num3 = Integer.parseInt(strawberry_cake.getText());
        int num4 = Integer.parseInt(blueberry_cake.getText());
        int bfc = num1*50;
        int cc = num2*50;
        int sc = num3*50;
        int bc = num4*50;
        int output = bfc + cc + sc + bc;
        total.setText(""+output);
    }//GEN-LAST:event_totalMouseMoved

    private void sign_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_outActionPerformed
        // TODO add your handling code here:
            Bakery_login h = new Bakery_login();
            h.setVisible(true);
    }//GEN-LAST:event_sign_outActionPerformed

    private void txtbillMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtbillMouseMoved
        // TODO add your handling code here:
  
    }//GEN-LAST:event_txtbillMouseMoved

    private void previewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previewActionPerformed
        // TODO add your handling code here:
    txtbill.setText("================================"+"\n"
            +"\t"+"PORTUGUESE BAKERY"+"\n"
            +"\t"+"         TUTICORIN"+"\n"
            +"\t"+"     ORDER PREVIEW"+"\n"
            +"================================"+"\n");
    txtbill.setText(txtbill.getText()+"\n"
            +"BLACK FOREST        "+"\t"+blackforest_cake.getText()
            +"\n"+"CHEESE CAKE          "+"\t"+cheese_cake.getText()
            +"\n"+"STRAWBERRY CAKE"+"\t"+strawberry_cake.getText()
            +"\n"+"BLUBERRY CAKE      "+"\t"+blueberry_cake.getText()+"\n"
            +"================================"+"\n"
            +"\n"+"                    TOTAL"+"\t"+total.getText());
    
    

    }//GEN-LAST:event_previewActionPerformed

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
            java.util.logging.Logger.getLogger(Bakery_purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bakery_purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bakery_purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bakery_purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bakery_purchase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel abar;
    private javax.swing.JLabel abar1;
    private javax.swing.JLabel bar;
    private javax.swing.JLabel bar1;
    private javax.swing.JLabel bg;
    private javax.swing.JTextField blackforest_cake;
    private javax.swing.JTextField blueberry_cake;
    private javax.swing.JTextField cheese_cake;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pay;
    private javax.swing.JButton preview;
    private javax.swing.JButton sign_out;
    private javax.swing.JTextField strawberry_cake;
    private javax.swing.JTextField total;
    private javax.swing.JTextArea txtbill;
    // End of variables declaration//GEN-END:variables
}