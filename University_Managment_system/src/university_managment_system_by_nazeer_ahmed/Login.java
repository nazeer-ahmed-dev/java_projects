package university_managment_system_by_nazeer_ahmed;
import java.sql.*;
import javax.swing.JOptionPane;
public class Login extends javax.swing.JFrame 
{
     public Login()
     {
         super("University Managment system");
        initComponents();
        setBounds(300,150,525,410);
         setResizable(false);    
     }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel3.setIcon(new javax.swing.ImageIcon("F:\\IMPORTANT\\COMPUTER SCIENCE\\BS_CS_4\\DBMS\\University_Managment_system_By_Nazeer_Ahmed\\src\\university_managment_system_by_nazeer_ahmed\\Images\\background1.jfif")); // NOI18N
        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "LOGIN", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 11)); // NOI18N
        jLabel1.setText("USER_NAME :");
        jLabel1.setToolTipText("");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(30, 40, 90, 15);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(110, 40, 130, 20);

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 11)); // NOI18N
        jLabel2.setText("PASSWORD : ");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 90, 70, 14);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LOG_IN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(70, 130, 110, 23);

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jPasswordField1);
        jPasswordField1.setBounds(110, 90, 130, 20);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(30, 80, 260, 180);

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel4.setText("UNIVERSITY MANAGMENT SYSTEM BY NAZEER");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 20, 490, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon("F:\\IMPORTANT\\COMPUTER SCIENCE\\BS_CS_4\\DBMS\\University_Managment_system_By_Nazeer_Ahmed\\src\\university_managment_system_by_nazeer_ahmed\\Images\\background1.jfif")); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 530, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          try
          {
            connwithmysql c1 = new connwithmysql();
            String username=jTextField1.getText();
            String password=jPasswordField1.getText();
            String sql = "select * from login where user_name='"+username+"' and password='"+password+"'";
            ResultSet rs=c1.stmt.executeQuery(sql);
            if(rs.next())
            {
                new project().setVisible(true);
                setVisible(false);
                //JOptionPane.showMessageDialog(null,"done");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"invalid login");
                setVisible(true);
            }
                    
          }
          catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this,ex.getMessage());
        }
          
           
            
             
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

 
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
           
            public void run()
            {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
